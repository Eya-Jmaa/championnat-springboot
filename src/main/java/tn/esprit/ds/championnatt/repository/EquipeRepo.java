package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.Equipe;

import java.util.Optional;

public interface EquipeRepo extends JpaRepository<Equipe, Integer> {
    void deleteById(Long idEquipe);

    Optional<Object> findById(Long idEquipe);
}
