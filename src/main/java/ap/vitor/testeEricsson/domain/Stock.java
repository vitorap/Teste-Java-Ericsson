package ap.vitor.testeEricsson.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idStock;

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="stock")
    private List<Quote> quotes;
}
