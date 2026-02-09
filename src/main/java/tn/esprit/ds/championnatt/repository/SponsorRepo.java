package tn.esprit.ds.championnatt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.ds.championnatt.entities.Sponsor;

import java.util.List;

public interface SponsorRepo extends JpaRepository <Sponsor, Long> {

}
