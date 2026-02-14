/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_proyectos5;

/**
 *
 * @author Arialdys
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un plan
        Plan planBasico = new Plan(500, 10, 800.0);

        // Crear cliente
        Cliente cliente1 = new Cliente("Maria Gonzalez", "+1-809-555-1234", planBasico);

        // Crear factura con consumo (620 minutos, 12 GB)
        Factura factura1 = new Factura(cliente1, 620, 12);

        // Generar y mostrar la factura
        factura1.generarFactura();

        System.out.println("\n\n");

        // Ejemplo 2: Cliente sin excesos
        Plan planPremium = new Plan(1000, 20, 1200.0);
        Cliente cliente2 = new Cliente("Juan Perez", "+1-809-555-5678", planPremium);
        Factura factura2 = new Factura(cliente2, 800, 15);

        factura2.generarFactura();
    }
}
