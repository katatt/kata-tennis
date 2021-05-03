package com.katatennis.demo.models;


import lombok.Data;

@Data
public class Joueur {

    public String nom;
    public int score = 0;

    public Joueur() {
    }

    //Le joueur gagne un point a chaque balle gagnante
    public void lancerBalleGagnante() {
    }
}