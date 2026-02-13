/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1_Proyectos;

/**
 *
 * @author Arialdys
 */
public class Tv {
    
    // Atributos (Sugerencias de la imagen)
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;

    // Constructor para inicializar la TV
    public Tv(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.encendido = false; // Por defecto inicia apagada
        this.volumen = 10;      // Volumen inicial
    }

    // Métodos (Sugerencias de la imagen)

    public void encender() {
        this.encendido = true;
        System.out.println("La TV se esta encendiendo...");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("La TV se esta apagando...");
    }

    public void subirVolumen() {
        if (encendido) {
            this.volumen++;
            System.out.println("Subiendo el volumen... Nivel actual: " + this.volumen);
        } else {
            System.out.println("No se puede subir el volumen, la TV esta apagada.");
        }
    }

    public void bajarVolumen() {
        if (encendido && volumen > 0) {
            this.volumen--;
            System.out.println("Bajando el volumen... Nivel actual: " + this.volumen);
        } else if (!encendido) {
            System.out.println("No se puede bajar el volumen, la TV esta apagada.");
        }
    }
}