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
        for (int i = 1; i < 4; i++) {
            combat += "Assalt " + i + "    --->   Jugador: [V: " + jugador.getVida() + "(" + jugador.vida_maxima + "), A/D: " + jugador.getAtac() + "/" + jugador.getDefensa() + "]"
                    + " vs " + monstre.getNom() + ": [V: " + monstre.getVida() + " A/D: " + monstre.getAtac() + "/" + monstre.getDefensa() + "]\n";

            int vida_jugador = jugador.getVida() + jugador.getDefensa() - monstre.getAtac();
            int vida_monstre = monstre.getVida() + monstre.getDefensa() - jugador.getAtac();
            
            jugador.setVida(vida_jugador);
            monstre.setVida(vida_monstre);

            combat += "Fi Assalt " + i + "    --->   Jugador: [V: " + jugador.getVida() + "(" + jugador.vida_maxima + "), A/D: " + jugador.getAtac() + "/" + jugador.getDefensa() + "]"
                    + " vs " + monstre.getNom() + ": [V: " + monstre.getVida() + " A/D: " + monstre.getAtac() + "/" + monstre.getDefensa() + "]\n";

            if (jugador.getVida() < 1) {
                combat += "Has estat derrotat per un " + monstre.getNom() + " \n "
                        + "HAS MORT!! El teu esperit vagarà per la torre eternament...\n";
                jugador.setEsticViu(false);
                return combat;
            }

            if (monstre.getVida() < 1) {
                combat += "Enhorabona has matat un " + monstre.getNom() + "!\n "
                        + "Prem [Enter] per entrar a la següent habitació.\n";
                return combat;
            }
        }
        combat += "Enhorabona has matat un " + monstre.getNom() + " per esgotament!!";
        return combat;
    }

    @Override
    public String entrar() {
        String mensaje = "";
        mensaje = "Entres a l'habitació. O no!! Entre les ombres apareix un " + monstre.getNom() + "\n";
        mensaje = "Prem [Enter] per entrar a la següent habitació.\n";
        return mensaje;
    }

    @Override
    public String sortir() {
        String mensaje = "";
        mensaje = "Prem [Enter] per entrar a la següent habitació.\n";
        return mensaje;
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
