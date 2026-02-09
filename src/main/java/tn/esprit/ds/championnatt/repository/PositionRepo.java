package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.Position;

public interface PositionRepo extends JpaRepository<Position, Integer> {
}
