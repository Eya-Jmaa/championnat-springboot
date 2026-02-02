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
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String libelleC;
    private Integer annee;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_champ_code")
    private DetailChampionnat detailChampionnat;

    @OneToMany(mappedBy = "championnat", cascade = CascadeType.ALL)
    private List<Course> courses;
}