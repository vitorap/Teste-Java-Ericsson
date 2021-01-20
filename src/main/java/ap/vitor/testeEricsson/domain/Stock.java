package ap.vitor.testeEricsson.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Stock {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idStock;

    @Column(unique = true, nullable = false)
    private String name;

    //O lazy faz trazer só os dados que queremos
    @OneToMany(mappedBy = "stock", fetch = FetchType.LAZY)
    private List<Quote> quotes;


}
