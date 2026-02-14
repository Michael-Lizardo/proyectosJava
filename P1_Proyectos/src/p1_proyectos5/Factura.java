/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_proyectos5;

/**
 *
 * @author Arialdys
 */
public class Factura {

    private Cliente cliente;
    private int minutosUsados;
    private int datosUsadosGB;
    private double cargosExtras;
    private double montoTotal;

    public Factura(Cliente cliente, int minutosUsados, int datosUsadosGB) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGB = datosUsadosGB;
        this.cargosExtras = 0;
        this.montoTotal = 0;
        calcularCargos();
    }

    private void calcularCargos() {
        Plan plan = cliente.getPlan();
        double cargoMinutos = 0;
        double cargoDatos = 0;

        // Calcular exceso de minutos
        if (minutosUsados > plan.getMinutosIncluidos()) {
            int minutosExtra = minutosUsados - plan.getMinutosIncluidos();
            cargoMinutos = minutosExtra * plan.getTarifaMinutoExtra();
        }

        // Calcular exceso de datos
        if (datosUsadosGB > plan.getDatosGB()) {
            int datosExtra = datosUsadosGB - plan.getDatosGB();
            cargoDatos = datosExtra * plan.getTarifaGBExtra();
        }

        this.cargosExtras = cargoMinutos + cargoDatos;
        this.montoTotal = plan.getPrecioMensual() + this.cargosExtras;
    }

    public void generarFactura() {
        System.out.println("========================================");
        System.out.println("         FACTURA DE TELEFONIA");
        System.out.println("========================================");
        System.out.println();
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println("  Nombre: " + cliente.getNombre());
        System.out.println("  Teléfono: " + cliente.getNumeroTelefonico());
        System.out.println();

        Plan plan = cliente.getPlan();
        System.out.println("PLAN CONTRATADO:");
        System.out.println("  Minutos incluidos: " + plan.getMinutosIncluidos() + " min");
        System.out.println("  Datos incluidos: " + plan.getDatosGB() + " GB");
        System.out.println("  Precio base: RD$" + String.format("%.2f", plan.getPrecioMensual()));
        System.out.println();

        System.out.println("CONSUMO DEL MES:");
        System.out.println("  Minutos usados: " + minutosUsados + " min");
        System.out.println("  Datos usados: " + datosUsadosGB + " GB");
        System.out.println();

        System.out.println("DETALLE DE CARGOS:");
        System.out.println("  Precio base del plan: RD$" + String.format("%.2f", plan.getPrecioMensual()));

        // Detallar excesos
        if (minutosUsados > plan.getMinutosIncluidos()) {
            int minutosExtra = minutosUsados - plan.getMinutosIncluidos();
            double cargoMinutos = minutosExtra * plan.getTarifaMinutoExtra();
            System.out.println("  Exceso de minutos (" + minutosExtra + " min x RD$"
                    + plan.getTarifaMinutoExtra() + "): RD$" + String.format("%.2f", cargoMinutos));
        }

        if (datosUsadosGB > plan.getDatosGB()) {
            int datosExtra = datosUsadosGB - plan.getDatosGB();
            double cargoDatos = datosExtra * plan.getTarifaGBExtra();
            System.out.println("  Exceso de datos (" + datosExtra + " GB x RD$"
                    + plan.getTarifaGBExtra() + "): RD$" + String.format("%.2f", cargoDatos));
        }

        if (cargosExtras > 0) {
            System.out.println("  Total cargos extras: RD$" + String.format("%.2f", cargosExtras));
        } else {
            System.out.println("  Sin cargos extras");
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("  TOTAL A PAGAR: RD$" + String.format("%.2f", montoTotal));
        System.out.println("========================================");
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getCargosExtras() {
        return cargosExtras;
    }
}
