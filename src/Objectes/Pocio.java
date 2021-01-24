/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectes;

/**
 *
 * @author lucas
 */
public abstract class Pocio {
    private int intensitat;
    private String nom;
    
    protected Pocio(String nom, int intensitat) {
        this.nom = nom;
        this.intensitat = intensitat;
    }
    
    
}