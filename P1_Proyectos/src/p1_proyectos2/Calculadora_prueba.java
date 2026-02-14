/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1_proyectos2;

import java.util.Scanner;

/**
 *
 * @author Arialdys
 */
public class Calculadora_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadNum = 0;
        int opcion;
        boolean activo = true;
        int resultado = 0;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        Calculadora calc = new Calculadora();

        do {

            System.out.println("1)Ingresar numeros");
            System.out.println("2)Sumar");
            System.out.println("3)Restar");
            System.out.println("4)Multiplicar");
            System.out.println("5)Dividir");
            System.out.println("6)Salir");
            System.out.println(" ");
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Elija cuantos numeros desea agregar. \n 1)Dos digitos \n 2)Tres digitos \n 3)Cuatro digitos \n Elija una opcion:");
                    cantidadNum = sc.nextInt();
                    switch (cantidadNum) {
                        case 1:
                            System.out.println("Ingrese el primer digito:");
                            num1 = sc.nextInt();
                            System.out.println("Ingrese el segundo digito:");
                            num2 = sc.nextInt();

                            break;

                        case 2:
                            System.out.println("Ingrese el primer numero:");
                            num1 = sc.nextInt();
                            System.out.println("Ingrese el segundo numero:");
                            num2 = sc.nextInt();
                            System.out.println("Ingrese el tercer numero:");
                            num3 = sc.nextInt();

                            break;

                        case 3:
                            System.out.println("Ingrese el primer numero:");
                            num1 = sc.nextInt();
                            System.out.println("Ingrese el segundo numero:");
                            num2 = sc.nextInt();
                            System.out.println("Ingrese el tercer numero:");
                            num3 = sc.nextInt();
                            System.out.println("Ingrese el cuarto numero:");
                            num4 = sc.nextInt();
                            break;

                        default:
                            throw new AssertionError();
                    }
                    break;

                case 2:
                    if (cantidadNum == 1) {
                        resultado = calc.sumar(num1, num2);
                    } else if (cantidadNum == 2) {
                        resultado = calc.sumar(num1, num2, num3);
                    } else if (cantidadNum == 3) {
                        resultado = calc.sumar(num1, num2, num3, num4);
                    } else if (cantidadNum == 0) {
                        System.out.println("Debe ingresar numeros...");

                    }
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 3:
                    if (cantidadNum == 1) {
                        resultado = calc.restar(num1, num2);
                    } else if (cantidadNum == 2) {
                        resultado = calc.restar(num1, num2, num3);
                    } else if (cantidadNum == 3) {
                        resultado = calc.restar(num1, num2, num3, num4);
                    } else if (cantidadNum == 0) {
                        System.out.println("Debe ingresar numeros...");

                    }
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 4:
                    if (cantidadNum == 1) {
                        resultado = calc.multiplicar(num1, num2);
                    } else if (cantidadNum == 2) {
                        resultado = calc.multiplicar(num1, num2, num3);
                    } else if (cantidadNum == 3) {
                        resultado = calc.multiplicar(num1, num2, num3, num4);
                    } else if (cantidadNum == 0) {
                        System.out.println("Debe ingresar numeros...");

                    }
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 5:

                    if (cantidadNum == 1) {

                        if (num2 == 0) {
                            System.out.println("No se puede dividir por cero...");
                        } else {
                            resultado = calc.dividir(num1, num2);
                            System.out.println("El resultado es: " + resultado);
                        }

                    } else if (cantidadNum == 2) {

                        System.out.println("No se puede dividir con tres numeros...");

                    } else if (cantidadNum == 3) {

                        System.out.println("No se puede dividir con cuatro numeros...");

                    } else {

                        System.out.println("Debe ingresar numeros...");

                    }

                    break;

                case 6:
                    System.out.println("Saliendo del programa....");
                    activo = false;
                    break;
            }

        } while (activo);

    }

}
