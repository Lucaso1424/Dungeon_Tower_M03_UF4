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
    Habitacio[] habitacions;
    private int habitacioActual;

    protected Mapa(Habitacio[] habitacions) {
        // RECOGEMOS VALORES CON EL THIS
        this.habitacions = habitacions;
        habitacioActual = 0;
        this.habitacions[0].entrar();
    }

    public Habitacio getHabitacioActual() {
        // DEVUELVE LA HABITACION ACTUAL DE LAS HABITACIONES (0)
        return habitacions[habitacioActual];
    }
    
    // RETORNA TRUE O FALSE PER MOURE'S D'HABITACIO
    public boolean mou() {
        boolean moure = (habitacioActual < habitacions.length -1);
        
        if (moure) {
            habitacions[habitacioActual].sortir();
            // LA POSICIO DE L'HABITACIO ES SUMA EN 1 PER PODER PASSAR A LA SEGUENT
            habitacioActual++;
            habitacions[habitacioActual].entrar();
        } 
        return moure;
    }
    
//    @Override
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