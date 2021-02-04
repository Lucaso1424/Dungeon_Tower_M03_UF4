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
        return false;
    }
    
//    @Override
    public String toString (int linia) {
        // STRING DE HABITITACION PARA GENERAR EL MAPA CONCATENADO POR LAS FLECHAS -->
        String habitacioTxt = "";
        return habitacioTxt;
    }
}