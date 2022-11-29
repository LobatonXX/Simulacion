package simulacion;

import java.util.Scanner;

/**
 *
 * @author LPBC
 */
class Congruencial {

    Scanner o = new Scanner(System.in);
    int a, m, n = 0, n1 = 0, j, opc;
    int sem[] = new int[10000];
    int mod[] = new int[10000];
    float pseudo;

    void numeros() {
        System.out.printf("a/m");
        while (n < m) {
            System.out.printf("\t" + mod[n]);
            n++;
        }
        n = 0;
        while (n < a) {
            System.out.println();
            System.out.printf("" + sem[n]);
            while (n1 < m) {
                j = sem[n] % mod[n1];
                pseudo = (float) j / mod[n1];
                System.out.printf("   " + (float) Math.round(pseudo * 10000d) / 10000);
                n1++;
            }
            n1 = 0;
            n++;
        }
    }

    void numerosaleatorios() {
        n = 0;
        while (n < opc) {
            sem[n] = (int) (Math.random() * 100);
            mod[n] = (int) (Math.random() * 100);
            while (mod[n] == 0) {
                mod[n] = (int) (Math.random() * 100);
            }
            System.out.printf((n + 1) + ". a/m =");
            System.out.printf(" " + sem[n]);
            System.out.printf("/" + mod[n]);
            j = sem[n] % mod[n];
            pseudo = (float) j / mod[n];
            System.out.printf(" = " + (float) Math.round(pseudo * 10000d) / 10000);
            System.out.println();
            n++;
        }
    }

    public static void main(String[] args) {
        Congruencial num = new Congruencial();
        System.out.println("Este programa muestra numeros pseudoaleatorios con el metodo congruencial");
        System.out.println("¿Quieres generacion manual o aleatoria?");
        System.out.println("1. Manual");
        System.out.println("2. Aleatorio");
        while (true) {
            System.out.println("Ingresa una opcion:");
            num.opc = num.o.nextInt();
            if (num.opc == 1 || num.opc == 2) {
                break;
            }
            System.out.println("Ingresa una opcion valida!!");
        }
        System.out.println();

        switch (num.opc) {
            case 1:
                System.out.println("¿Cuantas semillas se usaran?");
                num.a = num.o.nextInt();
                System.out.println("Ingresa las semillas a:");
                while (num.n < num.a) {
                    num.sem[num.n] = num.o.nextInt();
                    num.n++;
                }
                num.n = 0;
                System.out.println("¿Cuantas modulos se usaran?");
                num.m = num.o.nextInt();
                System.out.println("Ingresa los modulos m:");
                while (num.n < num.m) {
                    num.mod[num.n] = num.o.nextInt();
                    num.n++;
                }
                num.n = 0;
                num.numeros();
                break;
            case 2:
                System.out.println("¿Cuantos numeros quieres generar?");
                num.opc = num.o.nextInt();
                num.numerosaleatorios();
                break;
        }
    }

}
