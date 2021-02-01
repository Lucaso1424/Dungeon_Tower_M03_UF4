/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte;

import Personatges.Jugador;
import Habitacions.Mapa;

/**
 *
 * @author lucas
 */
public class Joc {

    private Jugador jugador;

    public Joc(Jugador jugador) {
        this.jugador = jugador;
    }

    public void jugar(Mapa mapa, boolean interactiu) {
        
        System.out.println(" ____                             _____\n"
                + "|    \\ _ _ ___ ___ ___ ___ ___   |_   _|___ _ _ _ ___ ___\n"
                + "|  |  | | |   | . | -_| . |   |    | | | . | | | | -_|  _|\n"
                + "|____/|___|_|_|_  |___|___|_|_|    |_| |___|_____|___|_|\n"
                + "              |___|");
    }
}