package tn.esprit.ds.championnatt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailChampionnat {
    @Id
    private String idDetailChamp;

    private String code;
    private String description;

}