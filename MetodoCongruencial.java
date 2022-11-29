/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsimulacion;

import java.util.Scanner;

public class MetodoCongruencial {

    Scanner leer = new Scanner(System.in);

    public MetodoCongruencial() {

        System.out.println("¿Cuantas Semillas Son En Total?");
        int numSemillas = leer.nextInt();
        int letraA;
        int semillas[] = new int[numSemillas];

        System.out.println("Eliga una opcion\n1.Llenar los datos manualmente\n2.Generar los datos automaticamente");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            for (int q = 0; q < semillas.length; q++) {
                System.out.println("Introduce La Semilla " + (q + 1));
                letraA = leer.nextInt();
                if (letraA > 0) {
                    semillas[q] = letraA;
                } else {
                    q--;
                }
            }
        } else if (opcion == 2) {
            for (int q = 0; q < semillas.length; q++) {
                semillas[q] = (int) (Math.random() * 100);
            }
        }

        System.out.println("¿Cuantos Modulos Son En Total?");
        int numeroM = leer.nextInt();
        int letraM;
        int modulos[] = new int[numeroM];

        if (opcion == 1) {
            for (int w = 0; w < modulos.length; w++) {
                System.out.println("Introduce El Modulo " + (w + 1));
                letraM = leer.nextInt();
                if (letraM > 0) {
                    modulos[w] = letraM;
                } else {
                    w--;
                }
            }
        } else if (opcion == 2) {
            for (int w = 0; w < modulos.length; w++) {
                modulos[w] = (int) (Math.random() * 100);
            }
        }

        float congruencial[] = new float[semillas.length * modulos.length];
        int co1 = 0, co2 = 0;
        float con1, con2, r, ri = 0;

        for (int l = 0; l < congruencial.length; l++) {

            if (semillas[co1] < modulos[co2]) {
                con1 = (float) (semillas[co1]);
                con2 = (float) (modulos[co2]);
                ri = con1 / con2;
            } else {
                if (semillas[co1] > modulos[co2]) {
                    r = (float) (semillas[co1] % modulos[co2]);
                    ri = (float) (r / modulos[co2]);
                }
            }
            congruencial[l] = ri;

            co1 = co1 + 1;
            if (co1 > (semillas.length - 1)) {
                co2 = co2 + 1;
                co1 = 0;
            }
        }

        System.out.print("Semilla (a) = ");
        for (int s = 1; s <= semillas.length; s++) {
            if (s < semillas.length) {
                System.out.print(semillas[s - 1] + ", ");
            } else {
                System.out.println(semillas[s - 1]);
            }
        }

        System.out.print("Modulo (m) = ");
        for (int m = 1; m <= modulos.length; m++) {
            if (m < modulos.length) {
                System.out.print(modulos[m - 1] + ", ");
            } else {
                System.out.println(modulos[m - 1]);
            }
        }

        System.out.println("\n" + "|a/m|Numero Pseudoaleatorio|");
        System.out.println("--------------------------------");
        int resl1 = 0, resl2 = 0;

        for (int re = 0; re < congruencial.length; re++) {
            System.out.println("|" + semillas[resl1] + "/" + modulos[resl2] + "|" + congruencial[re] + "|");
            System.out.println("--------------------------------");
            resl1 = resl1 + 1;
            if (resl1 > (semillas.length - 1)) {
                resl2 = resl2 + 1;
                resl1 = 0;
            }
        }
    }
}