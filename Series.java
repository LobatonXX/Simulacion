/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LPBC2655
 * 55
 */
public class Series {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Genera los numeros pseudoaleatorios
        System.out.println("¿Cuantos numeros desea generar?");
        int numero = leer.nextInt();
        double[] numeros = new double[numero];
        System.out.println("\nnumeros generados:");
        for (int i = 0; i < numero; i++) {
            double auxn = Math.random();
            numeros[i] = auxn;
            System.out.print(auxn + ", ");
        }
        System.out.println("\n");
        
        //Crea las parejas de numeros
        int i = 0;
        int matriz[][] = new int[5][5];
        boolean first = false;
        boolean second = false;
        double valor_en_x;
        double valor_en_y;
        double cuadrante_en_x;
        double cuadrante_en_y;
        double valor_aumento = 0.2;
        ArrayList<Integer> frecuenciaObtenida = new ArrayList<Integer>();
        ArrayList<Double> frecuenciaEsperada = new ArrayList<Double>();
        ArrayList<Double> Total = new ArrayList<Double>();

        while (i < numeros.length - 1) {
            String aux = "";
            for (int y = 0; y < matriz.length; y++) {
                for (int x = 0; x < matriz[y].length; x++) {
                    valor_en_x = numeros[i];
                    valor_en_y = numeros[i + 1];
                    cuadrante_en_x = (x + 1) * valor_aumento;
                    cuadrante_en_y = (y + 1) * valor_aumento;
                    first = (valor_en_x >= (valor_aumento * x)) && (valor_en_x <= cuadrante_en_x);
                    second = (valor_en_y >= (valor_aumento * y)) && valor_en_y <= cuadrante_en_y;
                    if (first && second) {
                        System.out.println("pareja: " + "[" + valor_en_x + ", " + valor_en_y + "]");
                        System.out.println("------------------------------------------------------");
                        matriz[x][y] = matriz[x][y] + 1;
                    }
                }
            }
            i++;
        }
        //calcula la frecuencia esperada
        double ei = ((numeros.length - 1) / (Math.pow(matriz.length, 2)));
        double resul = 0;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                frecuenciaObtenida.add(matriz[y][x]);
                frecuenciaEsperada.add(ei);
            }
        }

        double sumador = 0;

        System.out.println("FE: " + frecuenciaEsperada);
        System.out.println("FO: " + frecuenciaObtenida);

        for (int j = 0; j < frecuenciaEsperada.size(); j++) {
            resul = (Math.pow((frecuenciaEsperada.get(j) - frecuenciaObtenida.get(j)), 2)) / frecuenciaEsperada.get(j);
            sumador += resul;
            Total.add(resul);
        }
        
        System.out.println("\nx^2=(FE-FO)^2/FE:");
        System.out.println(Total);
        System.out.println("\nvalor de X^2: " + sumador + "\n");

        //  Recorrer la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" | ");
                System.out.print(matriz[y][x]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}