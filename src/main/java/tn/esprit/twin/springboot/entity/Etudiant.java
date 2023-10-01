package tn.esprit.twin.springboot.entity;



import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToMany(mappedBy="Etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
