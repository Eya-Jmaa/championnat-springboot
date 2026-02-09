package tn.esprit.ds.championnatt.entities.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ds.championnatt.entities.Equipe;
import tn.esprit.ds.championnatt.repository.EquipeRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipeService implements IEquipeService {

    private final EquipeRepo equipeRepo;

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepo.save(equipe);
    }

    @Override
    public Equipe modifierEquipe(Equipe equipe) {
        return equipeRepo.save(equipe);
    }

    @Override
    public void supprimerEquipe(Long idEquipe) {
        equipeRepo.deleteById(idEquipe);
    }

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepo.findAll();
    }

    @Override
    public Equipe retrieveEquipe(Long idEquipe) {
        return (Equipe) equipeRepo.findById(idEquipe).orElse(null);
    }
}
