package tn.esprit.twin.springboot.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy="Foyers")
    private Set<Bloc> Blocs;
    @OneToOne(mappedBy="FoyUni")
    private Universite Universites;

    public Foyer() {
    }
}
