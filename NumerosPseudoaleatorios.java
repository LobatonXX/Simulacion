package progsimulacion;

import java.util.Scanner;

public class NumerosPseudoaleatorios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Eliga una opcion \n1.Metodo Congruencial\n2.Metodo Potencias Sucesivas\n3.Metodo Aditivo"+
                "\n4.Metodo Mixto Congruencias\n5.Metodo Multiplicativo Binario\n6.Metodo Multiplicativo Decimal\n7.Metodo Centenas" +
                "\n8.Metodo Cuadrados Medios");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                    MetodoCongruencial metodo1 = new MetodoCongruencial();
                    break;
            case 2:
                System.out.println("Metodo Potencias Sucesivas\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int semilla, modulo, i;
                    System.out.println("Metodo Potencias Sucesivas");
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    System.out.println("Ingrese el valor de i");
                    i = leer.nextInt();
                    MetodoPotenciasSucesivas metodo2 = new MetodoPotenciasSucesivas(semilla, modulo, i);
                } else if (opcion == 2) {
                    int semilla, modulo, i;
                    System.out.println("Metodo Potencias Sucesivas");
                    semilla = (int) (Math.random() * 100);
                    modulo = (int) (Math.random() * 100);
                    i = (int) (Math.random() * 100);
                    MetodoPotenciasSucesivas metodo2 = new MetodoPotenciasSucesivas(semilla, modulo, i);
                }
                break;
            case 3:
                System.out.println("Metodo Aditivo\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1) {
                    int semilla, ni, modulo;
                    System.out.println("Metodo Aditivo");
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    System.out.println("Ingrese el valor de ni (constante)");
                    ni = leer.nextInt();
                    MetodoAditivo metodo3 = new MetodoAditivo(ni, modulo, semilla);
                } else if (opcion == 2) {
                    int semilla, ni, modulo;
                    System.out.println("Metodo Aditivo");
                    semilla = (int) (Math.random()*100);
                    ni = (int) (Math.random()*100);
                    modulo = (int) (Math.random()*100);
                    MetodoAditivo metodo3 = new MetodoAditivo(ni, modulo, semilla);
                }
                break;
            case 4:
                System.out.println("Metodo Mixto Congruencias\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1){
                    System.out.println("Metodo Mixto Congruencias");
                    int a, c, semilla, modulo;
                    System.out.println("Ingrese el valor de la constante a");
                    a = leer.nextInt();
                    System.out.println("Ingrese el valor de la constante c");
                    c = leer.nextInt();
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    MetodoMixtoCongruencias metodo4 = new MetodoMixtoCongruencias(a,c,semilla,modulo);
                } else if (opcion == 2){
                    System.out.println("Metodo Mixto Congruencias");
                    int a, c, semilla, modulo;
                    a = (int) (Math.random()*100);
                    c = (int) (Math.random()*100);
                    semilla = (int) (Math.random()*100);
                    modulo = (int) (Math.random()*100);
                    MetodoMixtoCongruencias metodo4 = new MetodoMixtoCongruencias(a,c,semilla,modulo);
                }
                break;
            case 5:
                System.out.println("Metodo Multiplicativo Binario\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1){
                    System.out.println("Metodo Multiplicativo Binario");
                    int t, semilla, b, contador;
                    System.out.println("Ingrese el valor de t");
                    t = leer.nextInt();
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor de b");
                    b = leer.nextInt();
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    MetodoMultiplicativoBinario metodo5 = new MetodoMultiplicativoBinario(t,semilla,b, contador);
                } else if (opcion == 2){
                    System.out.println("Metodo Multiplicativo Binario");
                    int t, semilla, b, contador;
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    t = (int) (Math.random()*50);
                    semilla = (int) (Math.random()*100);
                    b = (int) (Math.random()*30);
                    MetodoMultiplicativoBinario metodo5 = new MetodoMultiplicativoBinario(t,semilla,b, contador);
                }
                break;
            case 6:
                System.out.println("Metodo Multiplicativo Decimal\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if (opcion == 1){
                    System.out.println("Metodo Multiplicativo Decimal");
                    int a, semilla, modulo, contador;
                    System.out.println("Ingrese el valor de a");
                    a = leer.nextInt();
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("Ingrese el valor del modulo");
                    modulo = leer.nextInt();
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    MetodoMultiplicativoDecimal metodo6 = new MetodoMultiplicativoDecimal(a, semilla, modulo, contador);
                } else if (opcion == 2){
                    System.out.println("Metodo Multiplicativo Decimal");
                    int a, semilla, modulo,contador;
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    a = (int) (Math.random()*100);
                    semilla = (int) (Math.random()*100);
                    modulo = (int) (Math.random()*100);
                    MetodoMultiplicativoDecimal metodo6 = new MetodoMultiplicativoDecimal(a, semilla, modulo, contador);
                }
                break;
            case 7:
                System.out.println("Metodo Centenas\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if(opcion == 1){
                    int semilla, contador;
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    MetodoCentenas metodo7 = new MetodoCentenas(semilla, contador);
                    metodo7.Metodo();
                } else if (opcion == 2){
                    int semilla, contador;
                    semilla = (int) (Math.random()*1000);
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    MetodoCentenas metodo7 = new MetodoCentenas(semilla, contador);
                    metodo7.Metodo();
                }
                break;
            case 8:
                System.out.println("Metodo Cuadrados Medios\nEliga una opcion\n1.Ingresar datos manualmente\n2.Generar datos aleatorios");
                opcion = leer.nextInt();
                if(opcion == 1){
                    int semilla, contador;
                    System.out.println("Ingrese el valor de la semilla");
                    semilla = leer.nextInt();
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    MetodoCuadradosMedios metodo8 = new MetodoCuadradosMedios(semilla, contador);
                    metodo8.Metodo();
                } else if (opcion == 2){
                    int semilla, contador;
                    semilla = (int) (Math.random() * 1000);
                    System.out.println("¿Cuantos numeros desea generar?");
                    contador = leer.nextInt();
                    MetodoCuadradosMedios metodo8 = new MetodoCuadradosMedios(semilla, contador);
                    metodo8.Metodo();
                }
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
    }

}