
package simulacion;

import java.util.Scanner;
/**
 *
 * @author LPBC
 */
public class Simulacion {

    public static void main(String[] args) {
     
        int n, a, b, T;
        float tiempoT;
        Scanner clientes = new Scanner(System.in);
        System.out.println("introduzca el valor de a:");
        a = clientes.nextInt();
        System.out.println("introduzca el valor de b:");
        b = clientes.nextInt();
        double r = Math.random();
        double vi = a + (b - a) * r;
        System.out.println("Selecione una opcion\n 1) El tiempo exacto de cada cliente\n"
                + " 2) El tiempo que tarda el empleado\n 3) El tiempo que tarda en la fila el cliente n\n");
        int opcion = clientes.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduzca cuantos clientes hay en la fila");
                n = clientes.nextInt();
                float arreglo[] = new float[n];
                for(int i=0;i<n;i++){
                   r = Math.random();
                   vi = a + (b - a) * r;
                   arreglo[i] = (float) vi;
                   System.out.println("El tiempo del cliente en la posicion " + (i+1) + " es de " + arreglo[i]);
                }
                System.out.println("El numero de clientes es de: " + n);
                break;
            case 2:
                vi+=vi;
                System.out.println("El empleado tardo " + vi);
                break;
            case 3:
                System.out.println("Introduzca cuantos clientes hay en la fila");
                n = clientes.nextInt();
                float arreglos[] = new float[n];
                for(int i=0;i<n;i++){
                   r = Math.random();
                   vi = a + (b - a) * r;
                   arreglos[i] = (float) vi;
                   System.out.println("El tiempo del cliente en la posicion " + (i+1) + " es de " + arreglos[i]);
                }
                System.out.println("que posicion desea saber");
                int p = clientes.nextInt();
                System.out.println("el tiempo es de " + arreglos[p-1]);
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
    }

}
