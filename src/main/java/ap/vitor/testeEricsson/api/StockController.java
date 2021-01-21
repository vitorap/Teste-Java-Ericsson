package ap.vitor.testeEricsson.api;

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
@RequestMapping("/")
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private QuoteService quoteService;

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


//    @GetMapping("/{idStock}")
//    public Optional<Stock> get(@PathVariable("idStock") Long idStock){
//        return service.getStockById(idStock);
//    }


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
}
