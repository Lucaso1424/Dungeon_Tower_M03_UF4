/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacions;

import Personatges.TipusMonstre;
import Personatges.Monstre;

/**
 *
 * @author lucas
 */
public class GeneradorMonstres extends Monstre {

    public GeneradorMonstres() {
        super(0, 0, 0, true);
    }

    public static void estatMonstres(Monstre monstre, TipusMonstre tipus) {
        switch (tipus) {
            case Ashcream:
                monstre.setVida(1);
                monstre.setAtac(1);
                monstre.setDefensa(0);
                break;
            case Bladetree:
                monstre.setVida(2);
                monstre.setAtac(3);
                monstre.setDefensa(0);
                break;
            case Cryptvine:
                monstre.setVida(3);
                monstre.setAtac(1);
                monstre.setDefensa(1);
                break;
        }
    }

    // DEFINIM DOS MÈTODES PER A CREAR EL MONSTRE GENERANT EL NOM DEL MONSTRE I EL TIPUS DEL MONSTRE
//    public static Monstre crearMonstre(TipusMonstre tipus) {
//        Monstre monstre = new GeneradorMonstres();
//        monstre.setNom(tipus);
//        estatMonstres(monstre, tipus);
//        return monstre;
//    }

    public static Monstre crearMonstre(String nom) {
        Monstre monstre = new GeneradorMonstres();
        monstre.setNom(nom);
        estatMonstres(monstre, TipusMonstre.valueOf(nom));
        return monstre;
    }

}
