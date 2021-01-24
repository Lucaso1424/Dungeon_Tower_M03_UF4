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
    private String nom;
    
    public Monstre (int vida, int atac, int defensa, String nom) {
        this.vida = vida;
        this.atac = atac;
        this.defensa = defensa;
        this.nom = nom;           
    }
}
