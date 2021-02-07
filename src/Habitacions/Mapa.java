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
    protected boolean moure = false;

    protected Mapa(Habitacio[] habitacions) {
        // RECOGEMOS VALORES CON EL THIS
        this.habitacions = habitacions;
    }

    public Habitacio getHabitacioActual() {
        // DEVUELVE LA HABITACION ACTUAL DE LAS HABITACIONES MEDIANTE EL AUXILIAR
        Habitacio habitacioActual;
        int aux = 0;

        for (int i = 0; i < habitacions.length; i++) {
            if (habitacions[i].moure) {
                aux = i;
            }
        }

        habitacioActual = habitacions[aux];
        return habitacioActual;
    }

    // RETORNA TRUE O FALSE PER MOURE'S D'HABITACIO SI L'ARRAY DE habitacions.length
    // ES MÉS PETIT QUE SIGUI true, SI ES MÉS GRAN QUE EL NOMBRE D'HABITACIONS false
    public boolean mou() {
        boolean moureHabitacions = false;
        for (int i = 0; i < habitacions.length; i++) {
            if (i < habitacions.length) {
                moureHabitacions = true;
            } else {
                moureHabitacions = false;
            }
        }
        return moureHabitacions;
    }

    public String toString(int linia) {
        String habitacioTxt = "";
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < habitacions.length; x++) {
                habitacioTxt += habitacions[x].toString(i);
                if (x != habitacions.length - 1) {
                    if (x != habitacions.length - 1) {
                        if (i == 2) {
                            habitacioTxt += "-->";
                        } else {
                            habitacioTxt += "  ";
                        }
                    }
                    habitacioTxt += "\n";
                }
            }
        }
        return habitacioTxt;
    }

}
