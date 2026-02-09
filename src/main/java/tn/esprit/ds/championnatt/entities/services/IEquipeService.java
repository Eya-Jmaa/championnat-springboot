package tn.esprit.ds.championnatt.entities.services;

import tn.esprit.ds.championnatt.entities.Equipe;
import java.util.List;

public interface IEquipeService {

    Equipe ajouterEquipe(Equipe equipe);

    Equipe modifierEquipe(Equipe equipe);

    void supprimerEquipe(Long idEquipe);

    List<Equipe> retrieveAllEquipes();

    Equipe retrieveEquipe(Long idEquipe);
}
