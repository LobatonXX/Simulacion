package simulacion;

import java.util.Scanner;

/**
 *
 * @author LPBC
 */
public class MetodoMDB {
    
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int opcion;
        System.out.println("Eliga una opcion \n1.Metodo Multiplicativo Binario\n2.Metodo Multiplicativo Decimal");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Metodo Multiplicativo Binario\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int t, b,ni;
                    System.out.println("Multiplicativo Binario");
                    System.out.println("Ingrese el valor de t");
                    t = leer.nextInt();
                    System.out.println("Ingrese el valor del ni");
                    ni = leer.nextInt();
                    System.out.println("Ingrese el valor de b");
                    b= leer.nextInt();
                    MetodoM metodo1 = new MetodoM(t,ni,b);
                } else if (opcion == 2) {
                   
                }
                break;
            case 2:
                System.out.println("Metodo Multiplicativo Decimal\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int semilla, modulo, ni;
                    System.out.println("Metodo Multiplicativo Decimal ");
                    System.out.println("Ingrese el valor de a");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    System.out.println("Ingrese el valor de ni");
                    ni = leer.nextInt();
                    MetodoD metodo2 = new MetodoD(semilla, modulo, ni);
                } else if (opcion == 2) {
                    
                }
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
    }
}
