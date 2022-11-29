/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsimulacion;
 
import java.util.Scanner;

public class MetodoCentenas {

    int semilla, contador, modulo = 0;
    float resultado;

    public MetodoCentenas(int semilla, int contador) {
        this.semilla = semilla;
        this.contador = contador;
    }

    public int modulo() {
        int cmodulo = 0, aux, csemilla = semilla;
        while (csemilla > 0) {
            aux = csemilla % 10;
            cmodulo += aux;
            csemilla /= 10;
        }
        modulo = cmodulo;
        return modulo;
    }

    public float gNumero() {
        int aux = semilla % modulo();
        if (aux == 0) {
            System.out.println("El residuo es 0 | imposible generar mas numeros");
            contador = 0;
            return 0;
        }
        resultado = (float) aux / (float) modulo();
        return resultado;
    }

    public void Metodo() {
        float r = 0;
        while (contador > 0) {
            r = gNumero();
            System.out.println(r);
            semilla = (int) (resultado * 100000);
            contador--;
        }
    }
}