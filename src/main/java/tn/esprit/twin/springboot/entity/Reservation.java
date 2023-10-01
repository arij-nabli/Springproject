package tn.esprit.twin.springboot.entity;



import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation")
    private Long idReservation; // Clé primaire
    @Temporal(TemporalType.DATE)
    private Date AnneUniversitaire;
    private Boolean estValide;

    @ManyToMany(cascade=CascadeType.ALL)

    private Set <Etudiant>Etudiants;
}

