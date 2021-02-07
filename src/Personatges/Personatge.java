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
public abstract class Personatge {

    protected int vida;
    protected int atac;
    protected int defensa;
    protected boolean esticViu;

    protected Personatge() {
        this.vida = 1;
        this.atac = 0;
        this.defensa = 0;
        this.esticViu = true;
    }

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
