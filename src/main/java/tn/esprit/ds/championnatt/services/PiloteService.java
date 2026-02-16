package tn.esprit.ds.championnatt.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ds.championnatt.entities.Pilote;
import tn.esprit.ds.championnatt.repository.PiloteRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PiloteService implements IPiloteService {

    private final PiloteRepo piloteRepo;

    @Override
    public String addPilote(Pilote p) {
        piloteRepo.save(p);
        return "Pilote ajouté avec succès";
    }

    @Override
    public Pilote updatePilote(Pilote p) {
        return piloteRepo.save(p);
    }

    @Override
    public void deletePilote(Long idPilote) {
        piloteRepo.deleteById(idPilote);
    }

    @Override
    public List<Pilote> retrieveAllPilotes() {
        return piloteRepo.findAll();
    }

    @Override
    public Pilote retrievePilote(Long idPilote) {
        return (Pilote) piloteRepo.findById(idPilote).orElse(null);
    }
}
