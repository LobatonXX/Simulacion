/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsimulacion;

public class MetodoAditivo {
    int a, mod, ni,copiani;
    float numero;
    public MetodoAditivo(int a, int mod, int ni){
        this.a = a;
        this.mod = mod;
        this.ni = ni;
        copiani = ni;
        
        for(int contador = 1;contador < ni;contador++){
            if((a+ni) > mod){
                numero = (float) ((a+copiani)%mod)/mod;
            }else{
                numero = (float) (a+ni)/mod;
            }
            System.out.println("Numero generado es: " + numero);
            copiani = (a+copiani)%mod;
        }
    }
}