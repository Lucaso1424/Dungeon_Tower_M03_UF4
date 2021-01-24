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
public class PocioDefensa extends Pocio {

    public PocioDefensa(String nom, int intensitat) {
        super(nom, intensitat);
    }

    // @Override
    public String efecte(Jugador jugador) {
        jugador.setDefensa(jugador.getDefensa() + 1);
        return "La defensa del jugador s'ha sumat en 1";
    }
}
