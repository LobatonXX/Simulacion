package simulacion;

import java.util.Scanner;
/**
 *
 * @author LPBC
 */
public class Potencias_Sucesivas {
    Scanner o = new Scanner(System.in);
    int a, m, i, n = 1, j;
    float pseudo[] = new float[1000];
    void numeros() {
        while (n <= i) {
            j = (int) (Math.pow(a, n)) % m;
            pseudo[n - 1] = (float) j / m;
            System.out.println("Numero Pseudo aleatorio de :" + a + "^" + n + " = " + (float) Math.round(pseudo[n - 1] * 10000d) / 10000);
            n++;
        }
    }
    public static void main(String[] args) {
        Potencias_Sucesivas num = new Potencias_Sucesivas();
        System.out.printf("Ingrese la semilla a: ");
        num.a = num.o.nextInt();
        System.out.printf("Ingrese el modulo m: ");
        num.m = num.o.nextInt();
        System.out.printf("Ingrese el valor de i: ");
        num.i = num.o.nextInt();
        num.numeros();
    }
}
