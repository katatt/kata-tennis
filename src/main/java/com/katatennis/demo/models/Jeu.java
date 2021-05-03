package com.katatennis.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Jeu {

    public Joueur joueur1;
    public Joueur joueur2;


    //Cette variable stock le score en cours du joueur
    public int scoreJoueur1;
    public int scoreJoueur2;

    //Cette variable stock le score final
    public String scoreFinal1;
    public String scoreFinal2;

    //Cette variable retournera l'état du jeu actuelle
    //(Signalement de l'arbitre : Advantage, Deuce,Gagnant)
    public String etatJeu;

    final int pointsMax = 6;



    public Jeu(){

    }
}
