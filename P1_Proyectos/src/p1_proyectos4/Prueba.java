/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_proyectos4;

/**
 *
 * @author Arialdys
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("A123BC", "Toyota", "Corolla");

        // 🔥 Mostrar datos del vehículo
        v1.mostrarInfo();

        // 🔥 Calcular mantenimientos
        double costo1 = v1.calcularMantenimiento(5000);
        double costo2 = v1.calcularMantenimiento(5000, "basico");
        double costo3 = v1.calcularMantenimiento(5000, "completo", 7);

        System.out.println("Costo solo km: " + costo1);
        System.out.println("Costo basico: " + costo2);
        System.out.println("Costo completo + antiguedad: " + costo3);
    }
}
