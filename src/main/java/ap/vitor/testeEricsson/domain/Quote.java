package ap.vitor.testeEricsson.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idQuote;

    //esse cascade faz com que só possam ser adicionados stocks que existam
    @ManyToOne(cascade = {CascadeType.MERGE})
    private Stock stock;

//    sera que esse seria um jeito melhor de relacionar com o pai?
//    @ManyToOne
//    private Long idStock;


}
