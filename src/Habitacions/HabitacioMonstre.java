/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacions;

import Personatges.Jugador;
import Personatges.Monstre;

/**
 *
 * @author lucas
 */
public class HabitacioMonstre extends Habitacio {

    private Monstre monstre;

    public HabitacioMonstre(Monstre monstre) {
        this.monstre = monstre;
    }

    @Override
    public String activar(Jugador jugador) {
        String combat = "";
        return combat;
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
        String habitacio = "";
        switch (linia) {
            case 0:
                habitacio = "+-----+";
                break;
            case 1:
                habitacio = "| M   |";
                break;
            case 2:
                habitacio = "|     |";
                break;
            case 3:
                habitacio = "|     |";
                break;
            case 4:
                habitacio = "+-----+";
                break;
        }
        return habitacio;
    }

}
