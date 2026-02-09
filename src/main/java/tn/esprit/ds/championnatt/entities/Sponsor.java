package tn.esprit.ds.championnatt.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;
    Boolean archived;
    LocalDate dateCreation;
    LocalDate dateDerniereModification;

    // ========== ASSOCIATIONS ==========

    // OneToMany avec Contrat
    @OneToMany(mappedBy = "sponsor", cascade = CascadeType.ALL)
    private List<Contrat> contrats;
}