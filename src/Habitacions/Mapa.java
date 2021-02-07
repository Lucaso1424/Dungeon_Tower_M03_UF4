/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacions;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Mapa {

    Scanner in = new Scanner(System.in);
    final Habitacio[] habitacions;
    private int habitacioActual;
    private boolean moureHabitacions;

    protected Mapa(Habitacio[] habitacions) {
        // RECOGEMOS VALORES CON EL THIS
        this.habitacions = habitacions;
    }

    public Habitacio getHabitacioActual() {
        // RETORNA EL ARRATY D'HABITACIONS I L'HABITACIO ACTUAL
        return habitacions[habitacioActual];
    }

    // RETORNA TRUE O FALSE PER MOURE'S D'HABITACIO SI L'ARRAY DE habitacions.length
    // ES MÉS PETIT QUE SIGUI true, SI ES MÉS GRAN QUE EL NOMBRE D'HABITACIONS false
    public boolean mou() {
        moureHabitacions = (habitacioActual < habitacions.length - 1);

        if (moureHabitacions == true) {
            habitacions[habitacioActual].sortir();
            // ES SUMA L'HABITACIO ACTUAL PER PODER MOURE
            habitacioActual++;
            habitacions[habitacioActual].entrar();
        }
        return moureHabitacions;
    }

    @Override
    public String toString() {
        String habitacioTxt = "";
        for (int i = 0; i <= 5; i++) {
            for (int x = 0; x < habitacions.length; x++) {
                habitacioTxt += habitacions[x].toString(i);
                if (i == 2) {
                    if (x != habitacions.length - 1) {
                        habitacioTxt += " => ";
                    }
                } else {
                    habitacioTxt += "    ";
                }
            }
            habitacioTxt += "\n";
        }
        return habitacioTxt;
    }
}
