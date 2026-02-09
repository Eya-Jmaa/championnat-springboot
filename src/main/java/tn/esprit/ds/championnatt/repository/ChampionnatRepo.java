package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.Championnat;

public interface ChampionnatRepo extends JpaRepository<Championnat, Integer> {
}
