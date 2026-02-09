package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.Contrat;

public interface ContratRepo extends JpaRepository<Contrat, Integer> {
}
