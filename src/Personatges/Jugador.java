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

public class Jugador extends Personatge {
    private int vida_maxima = 10;
    
    public Jugador (int vida_maxima, int vida, int atact, int defensa, boolean esticViu) {
        this.vida_maxima = vida_maxima;
        this.vida = vida;
        this.atac = atac;
        this.defensa = defensa;
        this.esticViu = esticViu;
    }

    public void setVida_maxima(int vida_maxima) {
        this.vida_maxima = vida_maxima;
    }

    public int getVida_maxima() {
        return vida_maxima;
    }
}
