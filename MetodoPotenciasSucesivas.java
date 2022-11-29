/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsimulacion;

public class MetodoPotenciasSucesivas {
    int a = 0, mod = 0, i = 0;
    float respuesta;
    
    public MetodoPotenciasSucesivas(int a,int mod,int i){
        this.a = a;
        this.mod = mod;
        this.i = i;
        
        for(int contador = 1; contador <= i; contador++){
            if(Math.pow(a, contador) < mod){
                respuesta = (float) Math.pow(a, contador)/mod;
            } else {
                respuesta = (float) (Math.pow(a, contador)%mod)/mod;
            }
            System.out.println("Numero generado es: " + respuesta);
        }
    }
    
}