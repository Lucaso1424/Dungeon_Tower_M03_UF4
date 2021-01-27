/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacions;

import Objectes.Pocio;
import Personatges.Jugador;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class HabitacioPocio extends Habitacio {

    Scanner in = new Scanner(System.in);
    private Pocio pocio;

    public HabitacioPocio(Pocio pocio) {
        this.pocio = pocio;
    }

    @Override
    public String activar(Jugador jugador) {
        return pocio.efecte(jugador);
    }

    @Override
    public String entrar() {        
        String mensaje = "";
        mensaje = "Entres a l'habitació. Ummmm... Sembla que hi ha alguna cosa... una poció\n";
        mensaje = "Et beus la poció incrementant el teu estat de "+pocio.getNom()+" en "+pocio.getIntensitat()+".\n";
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
                habitacio = "| P   |";
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
