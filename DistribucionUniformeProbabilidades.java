/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author EQUIPO
 */

import java.util.Scanner;

public class DistribucionUniformeProbabilidades {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, x1, x2, opcion;
        double probabilidad, p;
        System.out.println("1) Si desea conocer un solo valor\n2) Si desea conocer mas de un valor");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor de a:");
                a = leer.nextInt();
                System.out.println("Ingrese el valor de b:");
                b = leer.nextInt();
                System.out.println("Ingrese el valor de x1:");
                x1 = leer.nextInt();
                System.out.println("Ingrese el valor de x2:");
                x2 = leer.nextInt();
                probabilidad = (1 / b - a);
                probabilidad *= (x1 - x2);
                p = (a / probabilidad);
                System.out.println("La probabilidad es: " + p);
                break;
            case 2:
                System.out.println("Cuantos valores desea conocer:");
                int aux = leer.nextInt();
                for (int i = 0; i < aux; i++) {
                    System.out.println("Ingrese el valor de a:");
                    a = leer.nextInt();
                    System.out.println("Ingrese el valor de b:");
                    b = leer.nextInt();
                    System.out.println("Ingrese el valor de x1:");
                    x1 = leer.nextInt();
                    System.out.println("Ingrese el valor de x2:");
                    x2 = leer.nextInt();
                    probabilidad = (1 / b - a);
                    probabilidad *= (x1 - x2);
                    p = (a / probabilidad);
                    System.out.println("La probabilidad es: " + p + "\n");
                }
                break;
            default:
                System.out.println("Error en su eleccion");
                break;
        }
    }
}