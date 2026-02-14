/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_proyectos4;

/**
 *
 * @author Arialdys
 */
public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    // 🔹 Constructor vacío (valores por defecto)
    public Vehiculo() {
        this.placa = "000-000";
        this.marca = "Generica";
        this.modelo = "Base";
    }

    // 🔹 Constructor básico
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "No especificado";
    }

    // 🔹 Constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // 🔥 Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("===== VEHICULO =====");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("====================");
    }

    // ===============================
    // MÉTODOS SOBRECARGADOS
    // ===============================
    public double calcularMantenimiento(int km) {
        return km * 0.10;
    }

    public double calcularMantenimiento(int km, String tipoServicio) {
        double costoBase = km * 0.10;

        switch (tipoServicio.toLowerCase()) {
            case "basico":
                return costoBase + 1000;
            case "completo":
                return costoBase + 2500;
            default:
                return costoBase + 500;
        }
    }

    public double calcularMantenimiento(int km, String tipoServicio, int antiguedad) {
        double costo = calcularMantenimiento(km, tipoServicio);

        if (antiguedad > 5) {
            costo += 1500;
        }

        return costo;
    }
}
