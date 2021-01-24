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

public class Jugador {
    private int vida = 10;
    private final static int vida_maxima = 10;
    private int atac = 1;
    private int defensa = 1;
    
    public Jugador (int vida, int atac, int defensa) {
        this.vida = vida;
        this.atac = atac;
        this.defensa = defensa;
    }
}
