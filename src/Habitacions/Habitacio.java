/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacions;

import Personatges.Jugador;

/**
 *
 * @author lucas
 */
public abstract class Habitacio {
    boolean moure;
    public abstract String activar(Jugador jugador);
    public abstract String entrar();
    public abstract String sortir();
    public abstract String toString(int linia);

}