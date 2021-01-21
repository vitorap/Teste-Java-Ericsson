package ap.vitor.testeEricsson.api;

import ap.vitor.testeEricsson.api.models.QuoteModel;
import ap.vitor.testeEricsson.api.models.StockModel;
import ap.vitor.testeEricsson.domain.Quote;
import ap.vitor.testeEricsson.domain.QuoteService;
import ap.vitor.testeEricsson.domain.Stock;
import ap.vitor.testeEricsson.domain.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private QuoteService quoteService;


//    Read All Stock
//    URL: http://<host>:<port>/stock HTTP Method: GET

    @GetMapping()
    public Iterable<StockModel> get() {
        List<StockModel> models = new ArrayList<>();
        List<Stock> stocks = (List<Stock>)stockService.getStocks();

        for (Stock s : stocks)
        {
            models.add(StockModel.fromStockEntity(s));
        }

        return models;
    }

//    Read Stock by Name
//    URL: http://<host>:<port>/stock?name=<stock_name> HTTP Method: GET


    @GetMapping(params = "name")
    public StockModel get(@RequestParam("name") String name){

        Stock s = stockService.getStock(name);

        if(s == null)
            return null;

        StockModel model = new StockModel();
        model = model.fromStockEntity(s);

        return model;
    }

//    Create Stock
//    URL: http://<host>:<port>/stock HTTP Method: POST


    @PostMapping
    public StockModel post(@RequestBody StockModel stockModel){
        Stock s = new Stock();
        s.setName(stockModel.getName());
        s = stockService.save(s);


        if(!CollectionUtils.isEmpty(stockModel.getQuotes())){
            for (float p : stockModel.getQuotes())
            {
                Quote q = new Quote();
                q.setValue(p);
                q.setStock(s);

                q = quoteService.save(q);
            }
        }

        Stock stock = stockService.getStock(s);
        stock.setQuotes(quoteService.findByIdStock(stock.getIdStock()));

        return StockModel.fromStockEntity(stock);
    }

//    Update Stock
//    URL: http://<host>:<port>/stock/<stock_name> HTTP Method: PATCH


    @PatchMapping("/{name}")
    public StockModel patch(@PathVariable String name, @RequestBody QuoteModel quoteModel){
        System.out.println("nome eh" + name);
        Stock s = stockService.getStock(name);

        if(s == null)
            return null;

        if(!CollectionUtils.isEmpty(quoteModel.getQuotes())){
            for (float p : quoteModel.getQuotes())
            {
                Quote q = new Quote();
                q.setValue(p);
                q.setStock(s);
                q = quoteService.save(q);
            }
        }

        StockModel model = new StockModel();
        model = model.fromStockEntity(s);
        return model;
    }

//    Delete Stock
//    URL: http://<host>:<port>/stock/<stock_name> HTTP Method: DELETE

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name){

        stockService.deleteStock(name);
    }

}
