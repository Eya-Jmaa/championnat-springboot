package tn.esprit.ds.championnatt.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String libelle;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    // ========== ASSOCIATIONS ==========

    // OneToMany avec Pilote
    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<Pilote> pilotes;

    // ManyToMany avec Sponsor via Contrat
    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<Contrat> contrats;
}