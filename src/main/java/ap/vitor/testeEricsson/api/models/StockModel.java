package ap.vitor.testeEricsson.api.models;

import ap.vitor.testeEricsson.domain.Quote;
import ap.vitor.testeEricsson.domain.Stock;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class StockModel {
    private String name;
    private List<Float> quotes;


    public static StockModel fromStockEntity(Stock s) {
        StockModel model = new StockModel();
        model.setName(s.getName());
        List<Float> quotes = new ArrayList<>();

        if (!CollectionUtils.isEmpty(s.getQuotes())) {
            for (Quote q : s.getQuotes()) {
                quotes.add(q.getValue());
            }
            model.setQuotes(quotes);
        }

        return model;
    }

}
