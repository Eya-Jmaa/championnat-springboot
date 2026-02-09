package tn.esprit.ds.championnatt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;

    private Integer classement;
    private Integer nbPoints;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "pilote_id")
    private Pilote pilote;
}