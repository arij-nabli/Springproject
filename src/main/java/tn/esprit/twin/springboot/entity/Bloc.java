package tn.esprit.twin.springboot.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "Bloc")
public class Bloc  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy="Blocs")

    private Set<Chambre> Chambres;
    @ManyToOne
    Foyer Foyers ;

}
