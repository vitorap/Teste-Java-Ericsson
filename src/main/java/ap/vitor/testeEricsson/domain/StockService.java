package ap.vitor.testeEricsson.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository rep;

    public Iterable<Stock> getStocks(){
        return rep.findAll();
    }

    public Stock getStock(Stock s){
        return rep.findByName(s.getName());
    }

    public Stock getStock(String name){
        return rep.findByName(name);
    }



//    public Optional<Stock> getStockById(Long idStock) {
//        return rep
//
//    }

    public List<Stock> getStocksFake() {
        List<Stock> stocks = new ArrayList<>();

        stocks.add(new Stock(1L,"example", null));
        stocks.add(new Stock(2L,"example 2", null));
        stocks.add(new Stock(3L,"example 3", null));

        return stocks;
    }


    public Stock save(Stock stock) {
       return  rep.save(stock);
    }


}
