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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;
    private LocalDate dateCourse;



    // ManyToOne avec Championnat
    @ManyToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;

    // OneToMany avec Position
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Position> positions;
}