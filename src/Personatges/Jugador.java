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

    public Jugador(int vida, int atac, int defensa, boolean esticViu) {
        super(10, 1, 1, true);
        this.vida_maxima = vida_maxima;
    }
}
