package ma.projet.grpc.controllers;

import ma.projet.grpc.stubs.Compte;

import java.util.List;

public class CompteService {
    public List<Compte> findAllComptes() {
        return List.of();
    }

    public Compte saveCompte(Compte compte) {
        return compte;
    }
}
