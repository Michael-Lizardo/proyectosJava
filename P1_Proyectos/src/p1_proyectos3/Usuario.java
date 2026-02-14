/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_proyectos3;

import java.util.ArrayList;

/**
 *
 * @author Arialdys
 */
public class Usuario {

    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    // Método para agregar libro prestado
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    // Método para devolver libro
    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
}
