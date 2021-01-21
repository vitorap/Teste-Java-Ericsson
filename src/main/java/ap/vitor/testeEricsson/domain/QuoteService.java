package ap.vitor.testeEricsson.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository rep;


    public Quote save(Quote quote) {
        return  rep.save(quote);
    }

    public List<Quote> findByIdStock(Long idStock){
        List<Quote> quotes = rep.findByStock_IdStock(idStock);

        return CollectionUtils.isEmpty(quotes) ? new ArrayList<>() : quotes;
    }
}
