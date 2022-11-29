/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsimulacion;

public class MetodoMultiplicativoDecimal {
    int a, semilla, modulo, contador;
    float resultado;
    public MetodoMultiplicativoDecimal(int a, int semilla, int modulo,int contador){
        this.a = a;
        this.semilla = semilla;
        this.modulo = modulo;
        this.contador = contador;
        int multiplicacion;
        
        for(;contador>0;contador--){
            multiplicacion = a * semilla;
            if (multiplicacion/modulo > 0){
                semilla = ((int) multiplicacion/modulo);
                resultado =(float) (multiplicacion/modulo)/modulo;
            } else {
                semilla = a * semilla;
                resultado = ((float)semilla/ (float)modulo);
            }
            System.out.println(resultado);
        }
        
    }
}