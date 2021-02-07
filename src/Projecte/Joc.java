/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte;

import java.util.Scanner;
import Personatges.Jugador;
import Habitacions.*;

/**
 *
 * @author lucas
 */
public class Joc {

    Scanner in = new Scanner(System.in);
    private Jugador jugador;

    public Joc(Jugador jugador) {
        this.jugador = jugador;
    }

    public void jugar(Mapa mapa, boolean interactiu) {
        Habitacio habitacioActual;

        do {
            habitacioActual = mapa.getHabitacioActual();

            if (interactiu) {
                System.out.println(mapa.toString());
            }

            System.out.println(habitacioActual.activar(jugador));

            if (interactiu && jugador.isEsticViu()) {
                System.out.println("Prem [Enter] per entrar a la següent habitació.");
                in.nextLine();
            }
        } while (jugador.isEsticViu() && mapa.mou());

        if (!jugador.isEsticViu()) {
            if (interactiu) 
                System.out.println("HAS MORT!! El teu esperit vagarà per la torre eternament...");
            

        } else {
            System.out.println("ENHORABONA!! has sortit de la TORRE");
        }
    }
}
