package tn.esprit.ds.championnatt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private Float montant;
    private String annee;
    private Boolean archived;

    // ========== ASSOCIATIONS ==========

    // ManyToOne avec Sponsor
    @ManyToOne
    @JoinColumn(name = "sponsor_id")
    private Sponsor sponsor;

    // ManyToOne avec Equipe
    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
}