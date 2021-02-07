/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personatges;

/**
 *
 * @author lucas
 */
public class Monstre extends Personatge {

    // DEFINIM INSTANCIA DEL NOM DEL MONSTRE DE LA CLASSE TIPUS MONSTRE
    private String nom;

    public Monstre() {
        super();
    }

    public TipusMonstre getNom() {
        return TipusMonstre.valueOf(nom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setNom (TipusMonstre nom) {
        this.nom = nom.toString();
    }

}
