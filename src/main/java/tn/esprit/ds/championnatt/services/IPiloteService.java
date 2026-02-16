package tn.esprit.ds.championnatt.services;

import tn.esprit.ds.championnatt.entities.Pilote;
import java.util.List;

public interface IPiloteService {

    String addPilote(Pilote p);

    Pilote updatePilote(Pilote p);

    void deletePilote(Long idPilote);

    List<Pilote> retrieveAllPilotes();

    Pilote retrievePilote(Long idPilote);
}
