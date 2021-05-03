package com.katatennis.demo.models;


import lombok.Data;

@Data
public class Joueur {

    public String nom;
    public int score = 0;

    public Joueur(String nom) {
        this.nom = nom;
    }

    //Le joueur gagne un point a chaque balle gagnante
    public void lancerBalleGagnante() {
        //De 0 à 15
        //Advantage ou victoire immediate apres coup réussie
        if(this.score == 0 || this.score == 6 || this.score == 7){
            this.score++;
        } //De 15 à 30
        else if(this.score == 1){
            this.score = this.score + 2;
        } // De 30 à 40
        else if(this.score == 3){
            this.score = this.score + 3;
        }
    }
}
