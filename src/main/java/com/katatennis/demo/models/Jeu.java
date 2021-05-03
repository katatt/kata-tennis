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




    public Jeu(){
    }

    //Les fonctions sont déclencher ici lorsque le jeu est lancé
    public void jouer() {
    }

    //Cette fonction simule le lancer de balle gagnant
    public void genererScore(int scoreJoueur1, int scoreJoueur2){

    }

    public String convertirScore(Joueur joueur){
        String nouveauScore = null;
        return nouveauScore;
    }


    //Si le joueur est égalité avec son adversaire on dit alors que c’est un «DEUCE»
    public boolean etatDeuce(){
        return true;
    }

    //Si le joueur a marquer le point après l'égalité il est donc en Avantage
    public boolean avantage(){
        return true;
    }

    //Il faut qu’il ai un score de 4 points (FORTY) et que l’adversaire ai au moins 2 points de moins
    public boolean joueurGagnant(){
        return false;
    }

    //Verifie qui a le plus de point et retourne son nom
    public String nomDuJoueurGagnant(){
        String nomDuGagnant="";
        return nomDuGagnant;
    }
}
