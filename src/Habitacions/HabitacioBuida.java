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
public class HabitacioBuida extends Habitacio {

    @Override
    public String activar(Jugador jugador) {
        return null;
    }

    @Override
    public String entrar() {
        String mensaje = "";
        mensaje = "Entres a l'habitació. Ummm... Sembla que no hi ha rés...\n";
        mensaje = "Prem [Enter] per entrar a la següent habitació.\n";
        return mensaje;
    }

    @Override
    public String sortir() {
        return null;
    }

    @Override
    public String toString(int linia) {
        return null;
    }

}
