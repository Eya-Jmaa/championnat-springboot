package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.championnatt.entities.DetailChampionnat;

public interface DetailChampionnatRepo extends JpaRepository<DetailChampionnat, Integer> {
}
