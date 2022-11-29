/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
import java.util.Scanner;

public class DistribucionUniformeLimites {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, opcion, aux, aux1;
        float ui, ri;
        System.out.println("1) Si desea dar el valor de ri\n2) Si desea generar automaticamente los numeros ri");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del limite inferior a:");
                a = leer.nextInt();
                System.out.println("Ingrese el valor del limite superior b:");
                b = leer.nextInt();
                System.out.println("Ingrese el valor del ri:");
                ri = leer.nextFloat();
                ui = (b - a);
                ui *= ri;
                ui += a;
                System.out.println("El valor de la variable con distribucion uniforme es: " + ui);
                aux = (int) (ui);
                aux1 = ((aux * 60) / 100);
                System.out.println("Tr: " + aux + "." + aux1);
                break;
            case 2:
                System.out.println("Ingrese el valor del limite inferior a:");
                a = leer.nextInt();
                System.out.println("Ingrese el valor del limite superior b:");
                b = leer.nextInt();
                System.out.println("¿Cuantos numeros ri desea generar?");
                int numerosri = leer.nextInt();
                for (int i = 0; i < numerosri; i++) {
                    ri = (float) (Math.random());
                    ui = (b - a);
                    ui *= ri;
                    ui += a;
                    System.out.println("El valor de la variable con distribucion uniforme es: " + ui);
                    aux = (int) (ui);
                    aux1 = ((aux * 60) / 100);
                    System.out.println("Tr: " + aux + "." + aux1);
                }
                break;
            default:
                System.out.println("Error al seleccionar");
                break;
        }
    }
}