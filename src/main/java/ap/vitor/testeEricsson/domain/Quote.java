package ap.vitor.testeEricsson.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quote {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idQuote;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idStock")
    @JsonIgnore
    private Stock stock;

    private float value;


}
