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
public class PocioAtac extends Pocio {

    public PocioAtac(String nom, int intensitat) {
        super(nom, intensitat);
    }

    @Override
    public String efecte(Jugador jugador) {
        jugador.setAtac(jugador.getAtac() + 1);
        return "L'atac del jugador s'ha sumat en 1";
    }
}
