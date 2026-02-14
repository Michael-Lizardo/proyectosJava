/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_proyectos3;

import java.time.LocalDate;

/**
 *
 * @author Arialdys
 */
public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;

        if (libro.consultarDisponibilidad()) {
            this.fecha = LocalDate.now();
            libro.prestarLibro();
            usuario.agregarLibro(libro);

            System.out.println("===== PRÉSTAMO REALIZADO =====");
            System.out.println("Usuario: " + usuario.getNombre());
            System.out.println("Libro: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Fecha: " + fecha);
            System.out.println("===============================");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
}
