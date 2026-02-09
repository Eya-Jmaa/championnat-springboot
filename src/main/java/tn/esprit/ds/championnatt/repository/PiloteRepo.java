package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.Pilote;

import java.util.Optional;

public interface PiloteRepo extends JpaRepository<Pilote, Integer> {
    Optional<Object> findById(Long idPilote);

    void deleteById(Long idPilote);
}
