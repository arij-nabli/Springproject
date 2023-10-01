package tn.esprit.twin.springboot.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite; // Clé primaire
    @OneToOne
    private Foyer FoyUni;
}