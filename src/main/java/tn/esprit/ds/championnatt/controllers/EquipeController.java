package tn.esprit.ds.championnatt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.championnatt.entities.Equipe;
import tn.esprit.ds.championnatt.services.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/equipe")
@RequiredArgsConstructor
public class EquipeController {

    private final IEquipeService equipeService;

    @PostMapping("/add")
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }

    @GetMapping("/all")
    public List<Equipe> getAllEquipes() {
        return equipeService.retrieveAllEquipes();
    }

    @GetMapping("/{id}")
    public Equipe getEquipe(@PathVariable Long id) {
        return equipeService.retrieveEquipe(id);
    }

    @PutMapping("/update")
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.modifierEquipe(equipe);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipe(@PathVariable Long id) {
        equipeService.supprimerEquipe(id);
    }
}
