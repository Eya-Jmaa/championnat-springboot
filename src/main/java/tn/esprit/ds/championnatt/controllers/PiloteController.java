package tn.esprit.ds.championnatt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.championnatt.entities.Pilote;
import tn.esprit.ds.championnatt.services.IPiloteService;

import java.util.List;

@RestController
@RequestMapping("/pilote")
@RequiredArgsConstructor
public class PiloteController {

    private final IPiloteService piloteService;

    @PostMapping("/add")
    public String addPilote(@RequestBody Pilote p) {
        return piloteService.addPilote(p);
    }

    @GetMapping("/all")
    public List<Pilote> getAllPilotes() {
        return piloteService.retrieveAllPilotes();
    }

    @GetMapping("/{id}")
    public Pilote getPilote(@PathVariable Long id) {
        return piloteService.retrievePilote(id);
    }

    @PutMapping("/update")
    public Pilote updatePilote(@RequestBody Pilote p) {
        return piloteService.updatePilote(p);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePilote(@PathVariable Long id) {
        piloteService.deletePilote(id);
    }
}
