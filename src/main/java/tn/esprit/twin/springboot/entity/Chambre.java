package tn.esprit.twin.springboot.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Chambre")
public class Chambre implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private TypeChambre typeC;
    private Long numeroChambre;
    @OneToMany(cascade =CascadeType.ALL)
    private Set<Reservation> Reservations;
    @ManyToOne
    Bloc Blocs ;
    // Constructeurs, accesseurs (getters), et mutateurs (setters)
}