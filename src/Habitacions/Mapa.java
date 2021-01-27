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
public class Mapa /*(Habitacio[] habitacions)*/ {

    Scanner in = new Scanner(System.in);
    Habitacio[] habitacions;

    protected Mapa(Habitacio[] habitacions) {
        this.habitacions = habitacions;
    }

    public Habitacio getHabitacioActual() {
        return habitacions[0];
    }

    public boolean mou() {
        return false;
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
