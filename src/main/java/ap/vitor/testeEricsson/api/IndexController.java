package ap.vitor.testeEricsson.api;

import ap.vitor.testeEricsson.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/index")
public class IndexController {

//    @Autowired
//    private StockRepository stocks;
//
//    @Autowired
//    private QuoteRepository quotes;



//    There will be 5 operations expected for your application and all of them are described below:



//    CREATE STOCK
//    This operation will create a new Stock entry in database. For create operations only the name is a
//    mandatory parameter, Quotes are optional. Below there is an example of a create operation:
//    URL: http://<host>:<port>/stock HTTP Method: POST

    //@Autowired
    //private StockService service;

//    @PostMapping
//    public Stock post(@RequestBody Stock stock){
//        Stock s = service.save(stock);
//
//        return s;
//    }

//    Update Stock
//    This operation will update an existing Stock entry in database. For update operations only the Quotes
//    are a mandatory parameter in the request payload, the Stock name will be used as a path parameter.
//    This update operation must be used to introduce new Quote values in the Stock. Below there is an
//    example of an update operation:
//    URL: http://<host>:<port>/stock/<stock_name> HTTP Method: PATCH




//    Read Stock
//    This operation will read existing Stocks in database. For read operations there will be two different
//    responses, the first one must return all existing Stocks in database and the second one must find one
//    Stock by name. Below there are examples for both scenarios:
//
//    Read All Stock
//    URL: http://<host>:<port>/stock HTTP Method: GET

//    @GetMapping("/stock")
//    public List<StockModel> getStocks()
//    {
//        List<StockModel> models = new ArrayList<>();
//        List<Stock> stocks = stocks.findAll();
//
//        for (Stock s : stocks)
//        {
//            models.add(StockModel.fromStockEntity(s));
//        }
//
//        return models;
//    }

//    Read Stock by Name
//    URL: http://<host>:<port>/stock?name=<stock_name> HTTP Method: GET
//    Request Payload: N/A



//
//    Delete Stock
//    This operation will delete an existing Stock entry in database. For delete operations only the Quotes the
//    Stock name will be used as a path parameter (mandatory). Below there is an example of a delete
//    operation:
//    URL: http://<host>:<port>/stock/<stock_name> HTTP Method: DELETE
//    Request Payload: N/A
//    Response Payload: N/A


}