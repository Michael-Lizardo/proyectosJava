/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_proyectos5;

/**
 *
 * @author Arialdys
 */
public class Plan {

    private int minutosIncluidos;
    private int datosGB;
    private double precioMensual;
    private double tarifaMinutoExtra;
    private double tarifaGBExtra;

    public Plan(int minutosIncluidos, int datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
        this.tarifaMinutoExtra = 2.0; // RD$2 por minuto extra
        this.tarifaGBExtra = 100.0; // RD$100 por GB extra
    }

    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public int getDatosGB() {
        return datosGB;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public double getTarifaMinutoExtra() {
        return tarifaMinutoExtra;
    }

    public double getTarifaGBExtra() {
        return tarifaGBExtra;
    }

    @Override
    public String toString() {
        return "Plan: " + minutosIncluidos + " min, " + datosGB + " GB - RD$" + precioMensual + "/mes";
    }
}
