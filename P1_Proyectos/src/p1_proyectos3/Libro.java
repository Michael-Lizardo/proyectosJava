/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_proyectos3;

/**
 *
 * @author Arialdys
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Por defecto está disponible
    }

    // Método para consultar disponibilidad
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    // Método para prestar libro
    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    // Método para devolver libro
    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro ha sido devuelto.");
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
