/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habitacions;

import Objectes.*;

/**
 *
 * @author lucas
 */
public class GeneradorMapes {

    public static Mapa crearMapa(String creacionHabitacion) {
        int longitud = (creacionHabitacion.length() / 3);
        Habitacio[] habitacio = new Habitacio[longitud];

        // DECLAREM ELS INT D'ESQUERRA I DRETA PER AGAFAR ELS TRES PRIMERS VALORS s
        int esquerra = 0;
        int dreta = 3;

        for (int i = 0; i < longitud; i++) {
            // UTILITZEM EL MÉTODE SUBSTRING PER DIVIDIR LA CADENA DE L'ESQUERRA I LA DRETA 
            String x = creacionHabitacion.substring(esquerra, dreta);
            // FEM UN .split PER SEPARAR AQUESTS DOS PER UN STRING DE ""
            String[] y = x.split("");

            // COMPROBEM AMB EL EQUALS DE QUE LA X ES IGUAL ALS "..." PER A L'HABITACIO BUIDA
            if (x.equals("...")) {
                habitacio[i] = new HabitacioBuida();
            }

            // PASSEM LA VARIABLE num1 A parseInt DE L'ARRAY DE STRING DE y, QUE ES EL SPLIT DEL STRING ""
            // RELITZEM EL MATEIX 
            if (y[0].equals("P")) {
                switch (y[1]) {
                    case "A":
                        // EN CADA CASE CREEM LA NOVA HABITACIO DE CADA POCIO
                        Pocio PA = new PocioAtac("atac", Integer.parseInt(y[2]));
                        habitacio[i] = new HabitacioPocio(PA);
                        break;
                    case "D":
                        Pocio PD = new PocioDefensa("defensa", Integer.parseInt(y[2]));
                        habitacio[i] = new HabitacioPocio(PD);
                        break;
                }
            }
            if (y[0].equals("M")) {
                // CREEM EL GENERADOR DE MOSNTRES PER A CREAR CADA TIPUS DE EN L'HABITACIO
                GeneradorMonstres gm = new GeneradorMonstres();
                switch (y[1]) {
                    case "A":
                        // EN CADA CASE CREEM L'HABITACIO DE MONSTRE Y CREEM TAMBÉ EL MONSTRE AMB EL MÈTODES crearMonstre
                        habitacio[i] = new HabitacioMonstre(gm.crearMonstre("Ashcream"));
                        break;
                    case "B":
                        habitacio[i] = new HabitacioMonstre(gm.crearMonstre("Bladetree"));
                        break;
                    case "C":
                        habitacio[i] = new HabitacioMonstre(gm.crearMonstre("Cryptvine"));
                        break;
                }
            }
            
            esquerra = esquerra + 3;
            dreta = dreta + 3;
            
        }
        // COM NO PODEM FER EL RETURN DE habitacio, CREEM UN new MAPA PASSANT EL VALOR D'habitacio 
        Mapa mapa = new Mapa(habitacio);
        // FINALMENT, FEM EL RETURN D'habitacio PERO AGAFANT EL PARÀMETRE DE mapa
        return mapa;
    }
}