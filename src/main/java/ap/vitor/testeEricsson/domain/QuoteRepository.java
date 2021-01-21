package ap.vitor.testeEricsson.domain;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface QuoteRepository extends CrudRepository<Quote, Long> {
    List<Quote> findByStock_IdStock(Long idStock);
}
