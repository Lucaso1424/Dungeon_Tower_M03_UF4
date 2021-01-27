/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

import Personatges.Jugador;

/**
 *
 * @author lucas
 */
public abstract class Pocio {
    private int intensitat;
    private String nom;
    
    protected Pocio(String nom, int intensitat) {
        this.nom = nom;
        this.intensitat = intensitat;
    }

    public int getIntensitat() {
        return intensitat;
    }

    public String getNom() {
        return nom;
    }

    public void setIntensitat(int intensitat) {
        this.intensitat = intensitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    // SOBRECARGA DE MÉTODO PORQUE HACE FALTA AQUI POR EL OVERRIDE, PORQUE ES EL PADRE
    public abstract String efecte(Jugador jugador);
}