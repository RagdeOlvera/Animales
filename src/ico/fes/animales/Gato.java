/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

import animales.Animales;
import java.awt.Color;

/**
 *
 * @author Ragde
 */
public class Gato extends Animales{
    
    private String raza;
    private String tipodeSonido;
    private Color colorPelaje;
    private boolean manchas;

    public Gato() {
    }

    public Gato(String raza, String tipodeSonido, Color colorPelaje, boolean manchas) {
        this.raza = raza;
        this.tipodeSonido = tipodeSonido;
        this.colorPelaje = colorPelaje;
        this.manchas = manchas;
    }

    public Gato(String raza, String tipodeSonido, Color colorPelaje, boolean manchas, int numeroPatas, String sonido, boolean pelaje) {
        super(numeroPatas, sonido, pelaje);
        this.raza = raza;
        this.tipodeSonido = tipodeSonido;
        this.colorPelaje = colorPelaje;
        this.manchas = manchas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipodeSonido() {
        return tipodeSonido;
    }

    public void setTipodeSonido(String tipodeSonido) {
        this.tipodeSonido = tipodeSonido;
    }

    public Color getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(Color colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public boolean isManchas() {
        return manchas;
    }

    public void setManchas(boolean manchas) {
        this.manchas = manchas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGato{" + "raza=" + raza + ", tipodeSonido=" + tipodeSonido + ", colorPelaje=" + colorPelaje + ", manchas=" + manchas + '}';
    }
       
}
