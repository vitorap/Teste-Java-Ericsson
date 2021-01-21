package ap.vitor.testeEricsson.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepository rep;

    public Iterable<Stock> getStocks() {
        return rep.findAll();
    }

    public Stock getStock(Stock s) {
        return rep.findByName(s.getName());
    }

    public Stock getStock(String name) {
        return rep.findByName(name);
    }

    public ResponseEntity deleteStock(String name) {
        Stock s = rep.findByName(name);
        if (s == null) {
            return ResponseEntity.notFound().build();
        }
        rep.delete(s);
        return ResponseEntity.ok().build();
    }

    public Stock save(Stock stock) {
        return rep.save(stock);
    }


}
