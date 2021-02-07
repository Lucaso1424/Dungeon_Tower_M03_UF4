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
        System.out.println(" ____                             _____\n"
                + "|    \\ _ _ ___ ___ ___ ___ ___   |_   _|___ _ _ _ ___ ___\n"
                + "|  |  | | |   | . | -_| . |   |    | | | . | | | | -_|  _|\n"
                + "|____/|___|_|_|_  |___|___|_|_|    |_| |___|_____|___|_|\n"
                + "              |___|");
        System.out.println("Arriba al final de la torre sense morir en l'intent.");
        do {
            habitacioActual = mapa.getHabitacioActual();
            // HO DEFINIM EN TRUE PER A QUE PRINTI LA J DEL JUGADOR
            habitacioActual.setPosicioJugador(true);
            System.out.println(habitacioActual.entrar());
            System.out.println(mapa.toString());
            System.out.println(habitacioActual.activar(jugador));

            if (interactiu && jugador.isEsticViu()) {
                System.out.println("Prem [Enter] per entrar a la següent habitació.");
                in.nextLine();
            }

            // HO DEFINIM EN FALSE PER A QUE EL PROGRAMA DEIXI DE PRINTAR LA J
            habitacioActual.setPosicioJugador(false);
        } while (jugador.isEsticViu() && mapa.mou());

        if (!jugador.isEsticViu()) {
            System.out.println("HAS MORT!! El teu esperit vagarà per la torre eternament...");

        } else {
            System.out.println("ENHORABONA!! has sortit de la TORRE");
        }
    }
}
