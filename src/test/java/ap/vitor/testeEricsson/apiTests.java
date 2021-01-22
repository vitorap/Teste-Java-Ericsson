package ap.vitor.testeEricsson;


import ap.vitor.testeEricsson.api.models.StockModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TesteEricssonApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class apiTests {

    @Autowired
    protected TestRestTemplate rest;

    private ResponseEntity<StockModel> getStockModel(String url){
        return rest.getForEntity(url, StockModel.class);
    }

    private ResponseEntity<List<StockModel>> getStockModels(String url){
        return rest.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<StockModel>>() {
                });
    }

    @Test
    public void HTTPResponses(){
        HttpStatus response = getStockModels("/stock").getStatusCode();
        assertEquals(response, HttpStatus.OK);
        response = getStockModel("/stock?name=error").getStatusCode();
        assertEquals(response, HttpStatus.NOT_FOUND);
        response = getStockModel("/stock?name=eos").getStatusCode();
        assertEquals(response, HttpStatus.OK);
    }


    @Test
    public void testReadAllStock(){
        List<StockModel> stockModels = getStockModels("/stock").getBody();
        assertNotNull(stockModels);
        assertEquals(30,stockModels.size());
    }

    @Test
    public void testReadbyName(){
        StockModel reference = new StockModel();
        StockModel gotByName = new StockModel();
        reference.setName("eos");
        List<Float> quotes = new ArrayList<>();
		quotes.add(8.31F);
		quotes.add(12.85F);
		quotes.add(10.46F);
        quotes.add(7.68F);
        reference.setQuotes(quotes);
        ResponseEntity<StockModel> response = getStockModel("/stock?name=eos");
        gotByName = response.getBody();
        assertNotNull(response);
        assertEquals(gotByName,reference);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void testPostAndDelete() {
        StockModel reference = new StockModel();
        reference.setName("testPost");
        List<Float> quotes = new ArrayList<>();
        quotes.add(8.31F);
        quotes.add(12.85F);
        quotes.add(10.46F);
        quotes.add(7.68F);

        ResponseEntity<StockModel> response = rest.postForEntity("/stock",reference,null);
        assertEquals(HttpStatus.OK,response.getStatusCode());

        rest.delete("/stock/testPost");
        assertEquals(HttpStatus.NOT_FOUND, getStockModel("/stock?name=testPost").getStatusCode());

    }

    @Test
    public void testUpdate(){
        //aparentemente o cliente HTTP do SDK padrao nao suporta patch, entao o teste aqui é apenas simbolico por agora

    }



}
