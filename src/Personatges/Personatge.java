/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personatges;

/**
 *
 * @author lucas
 */

abstract class Personatge {
    protected int vida = 10;
    protected int atac = 1;
    protected int defensa = 1;
    protected boolean esticViu;

    public int getVida() {
        return vida;
    }

    public int getAtac() {
        return atac;
    }

    public int getDefensa() {
        return defensa;
    }

    public boolean isEsticViu() {
        return esticViu;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setEsticViu(boolean esticViu) {
        this.esticViu = esticViu;
    }
    
    
}
