package ma.projet.grpc.controllers;

import ma.projet.grpc.stubs.Compte;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compte")
public class CompteRestController {
    private final CompteService compteService;

    public CompteRestController(CompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping
    public List<Compte> getAllComptes() {
        return compteService.findAllComptes();
    }

    @PostMapping
    public Compte saveCompte(@RequestBody Compte compte) {
        return compteService.saveCompte(compte);
    }
}

