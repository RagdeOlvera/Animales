/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;
import java.awt.Color;

/**
 *
 * @author Ragde
 */
public class Animales {
    
    private int numeroPatas;
    private String sonido;
    private boolean pelaje;

    public Animales() {
    }

    public Animales(int numeroPatas, String sonido, boolean pelaje) {
        this.numeroPatas = numeroPatas;
        this.sonido = sonido;
        this.pelaje = pelaje;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gato gato1 = new Gato("Salvaje", "Maullar", Color.gray, true, 4, "si", true);     
        System.out.println(gato1);
        Perro perro1 = new Perro("Husky", "Aullar", Color.black, false, 4, "si", true);
        System.out.println(perro1);
        // TODO code application logic here
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "\nAnimales{" + "numeroPatas=" + numeroPatas + ", sonido=" + sonido + ", pelaje=" + pelaje + '}';
    }
    
}
