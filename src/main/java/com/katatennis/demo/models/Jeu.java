package com.katatennis.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
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

    //Cette variable stock le nombre de points max possible pour un jeu
    final int pointsMax = 6;


    public Jeu(){
    }

    //Un Jeu dans notre cas comporte 2 joueurs
    //Que j'intialise dans le constructeur
    public Jeu(Joueur joueur1, Joueur joueur2, int balleGagnanteJ1, int balleGagnanteJ2
    ){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;

        //Score determiner par l'utilisateur
        this.scoreJoueur1 = balleGagnanteJ1;
        this.scoreJoueur2 = balleGagnanteJ2;
    }


    //Les fonctions sont déclencher ici lorsque le jeu est lancé
    public void jouer() {
    }

    //Cette fonction simule le lancer de balle gagnant
    public void genererScore(int scoreJoueur1, int scoreJoueur2){
        for (int i=0;i<scoreJoueur1;i++){
            this.joueur1.lancerBalleGagnante();
        }

        for (int j=0;j<scoreJoueur2;j++){
            this.joueur2.lancerBalleGagnante();
        }
    }

    public String convertirScore(Joueur joueur){
        String nouveauScore = null;
        switch (joueur.score){
            case 0:
                nouveauScore = "LOVE";
                break;
            case 1:
                nouveauScore = "15";
                break;
            case 3:
                nouveauScore = "30";
                break;
            case 6:
                nouveauScore = "40";
                break;
            case 7:
                nouveauScore = "40A";
                break;
            case 8:
                nouveauScore ="40A -> WIN";
            default:
                System.out.println("P/S");

        }
        return nouveauScore;
    }


    //Si le joueur est égalité avec son adversaire on dit alors que c’est un «DEUCE»
    public boolean etatDeuce(){
        return joueur1.score == this.pointsMax && joueur2.score == this.pointsMax && joueur1.score == joueur2.score;
    }

    //Si le joueur a marquer le point après l'égalité il est donc en Avantage
    public boolean avantage(){
        if(this.joueur2.score>= this.pointsMax && this.joueur2.score == this.joueur1.score + 1){
            return true;
        }
        if(this.joueur1.score>= this.pointsMax && this.joueur1.score == this.joueur2.score + 1){
            return true;
        }
        return false;
    }

    //Il faut qu’il ai un score de 6 points (FORTY) et que l’adversaire ai au moins 2 points de moins
    public boolean joueurGagnant(){
        if(joueur1.score >= this.pointsMax && joueur2.score <= joueur1.score - 2){
            return true;
        }

        if( joueur2.score >= this.pointsMax && joueur1.score <= joueur2.score - 2){
            return true;
        }
        return false;
    }

    //Verifie qui a le plus de point et retourne son nom
    public String nomDuJoueurGagnant(){
        String nomDuGagnant;
        if(this.joueur1.score > this.joueur2.score){
            nomDuGagnant = this.joueur1.nom;
        }
        else{
            nomDuGagnant = this.joueur2.nom;
        }
        return nomDuGagnant;
    }
}
