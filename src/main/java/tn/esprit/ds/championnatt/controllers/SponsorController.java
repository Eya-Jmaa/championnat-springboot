package tn.esprit.ds.championnatt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.championnatt.entities.Sponsor;
import tn.esprit.ds.championnatt.services.ISponsorService;

import java.util.List;

@RestController
@RequestMapping("/sponsor")
@RequiredArgsConstructor
public class SponsorController {

    private final ISponsorService sponsorService;

    @PostMapping("/add")
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }

    @PostMapping("/addAll")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("/update")
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerSponsor(@PathVariable Long id) {
        sponsorService.supprimerSponsor(id);
    }

    @GetMapping("/all")
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    @GetMapping("/{id}")
    public Sponsor recupererSponsor(@PathVariable Long id) {
        return sponsorService.recupererSponsor(id);
    }

    @PutMapping("/archiver/{id}")
    public Boolean archiverSponsor(@PathVariable Long id) {
        return sponsorService.archiverSponsor(id);
    }
}
