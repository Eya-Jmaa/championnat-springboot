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
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;



    // ManyToOne avec Equipe
    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    // OneToMany avec Position
    @OneToMany(mappedBy = "pilote", cascade = CascadeType.ALL)
    private List<Position> positions;
}