/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_proyectos3;

/**
 *
 * @author Arialdys
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "12345");
        Usuario usuario1 = new Usuario("Carlos", "U001");

        // Crear préstamo
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);

        // Consultar disponibilidad
        System.out.println("¿Disponible? " + libro1.consultarDisponibilidad());

        // Devolver libro
        libro1.devolverLibro();
        usuario1.devolverLibro(libro1);

        System.out.println("¿Disponible? " + libro1.consultarDisponibilidad());
    }
}
