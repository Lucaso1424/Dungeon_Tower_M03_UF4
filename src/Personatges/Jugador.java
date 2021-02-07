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

    public final int vida_maxima = 10;

    public Jugador() {
        super();
        this.vida = vida_maxima;
        atac = 1;
        defensa = 1;
    }
}
