/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte;

import Habitacions.*;
import Personatges.*;
import Objectes.*;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        test2(true);
//        Jugador j = new Jugador();
//        GeneradorMapes GMP = new GeneradorMapes();
//        GeneradorMonstres gm = new GeneradorMonstres();
//        Mapa habitacio = GMP.crearMapa("...MA.PA1...");
//        System.out.println(habitacio);
    }
    
    public static void test2(boolean interactiu) {
        System.out.println("--- Test 2 ---");
        Joc j = new Joc(new Jugador());
        j.jugar(GeneradorMapes.crearMapa("...MA.MA."), interactiu);
    }
}
