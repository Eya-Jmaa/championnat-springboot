package tn.esprit.ds.championnatt.services;

import tn.esprit.ds.championnatt.entities.Sponsor;
import tn.esprit.ds.championnatt.repository.SponsorRepo;

import java.time.LocalDate;
import java.util.List;

public class SponsorService implements ISponsorService {
    private SponsorRepo sponsorRepo;
    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);
        return sponsorRepo.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        sponsors.forEach(s -> {
            s.setDateCreation(LocalDate.now());
            s.setArchived(false);
            s.setBloquerContrat(false);
        });
        return sponsorRepo.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateDerniereModification(LocalDate.now());
        return sponsorRepo.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sponsorRepo.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sponsorRepo.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sponsorRepo.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sponsorRepo.findById(idSponsor).orElse(null);
        if (sponsor != null) {
            sponsor.setArchived(true);
            sponsorRepo.save(sponsor);
            return true;
        }
        return false;
    }
}
