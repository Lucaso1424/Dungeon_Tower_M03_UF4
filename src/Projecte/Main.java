/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte;

import Habitacions.GeneradorMapes;
import Habitacions.HabitacioPocio;
import Personatges.Jugador;
import Objectes.PocioAtac;
import Objectes.Pocio;
import Objectes.PocioAtac;
import Objectes.PocioDefensa;
import java.util.Scanner;

/**
 *
 * @author lucas
 */

public class Main {

    public static void main(String[] args) {
        test1(false);
    }

    public static void test1(boolean interactiu) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("--- Test 1 ---\n");
        System.out.println(" ____                             _____\n"
                + "|    \\ _ _ ___ ___ ___ ___ ___   |_   _|___ _ _ _ ___ ___\n"
                + "|  |  | | |   | . | -_| . |   |    | | | . | | | | -_|  _|\n"
                + "|____/|___|_|_|_  |___|___|_|_|    |_| |___|_____|___|_|\n"
                + "              |___|");
        
        Joc j = new Joc(new Jugador(10, 1, 1, true));
        
        Pocio pa = new PocioAtac("atac", 1);
        Pocio pd = new PocioDefensa("defensa", 1);
        
        GeneradorMapes mapa = new GeneradorMapes();
        System.out.println(mapa.crearMapa(""));
        
    }
}