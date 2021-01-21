package ap.vitor.testeEricsson.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idStock")
    @JsonIgnore
    private Stock stock;

    private float value;


}
