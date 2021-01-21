package ap.vitor.testeEricsson.domain;

import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, Long> {
    Stock findByName(String name);
}
