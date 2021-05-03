package com.katatennis.demo.controllers;

import com.katatennis.demo.models.Jeu;
import com.katatennis.demo.models.Joueur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JeuController {
    @GetMapping(value="joueur1/{nomJoueur1}/joueur2/{nomJoueur2}/balleWin1/{balleGagnanteJ1}/balleWin2/{balleGagnanteJ2}")
    Jeu play(@PathVariable("nomJoueur1") String nomJoueur1,
             @PathVariable ("nomJoueur2") String nomJoueur2,
             @PathVariable ("balleGagnanteJ1") int balleGJ1,
             @PathVariable ("balleGagnanteJ2") int balleGJ2

    ) {
        Joueur joueur1 = new Joueur(nomJoueur1);
        Joueur joueur2 = new Joueur(nomJoueur2);

        System.out.printf(joueur1.nom,joueur2.nom);

        Jeu jeu = new Jeu(joueur1,joueur2,balleGJ1,balleGJ2);
        jeu.jouer();
        return jeu;
    }
}
