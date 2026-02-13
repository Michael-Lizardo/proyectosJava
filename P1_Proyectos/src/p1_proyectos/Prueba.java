
package P1_Proyectos;

public class Prueba {

    public static void main(String[] args) {
        // Paso 1: Crear instancias (Ya lo tienes bien)
        Tv tv1 = new Tv("Samsung", 55);
        Tv tv2 = new Tv("TCL", 78); // Nota: Corregí "TLC" por "TCL" que es la marca común
        Tv tv3 = new Tv("LG", 85);

        // Paso 2: Asignar valores (Opcional si ya los pasaste en el constructor)
        // Pero como la imagen pide volumen diferente, lo hacemos aquí:
        tv1.volumen = 20;
        tv2.volumen = 15;
        tv3.volumen = 30;

        // Paso 3: Invocar métodos para las 3 instancias (Esto te falta)
        
        System.out.println("--- PRUEBA TV 1 ---");
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        System.out.println("\n--- PRUEBA TV 2 ---");
        tv2.encender();
        tv2.subirVolumen();
        tv2.subirVolumen(); // Podemos probar subirlo dos veces
        tv2.apagar();

        System.out.println("\n--- PRUEBA TV 3 ---");
        tv3.encender();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}
