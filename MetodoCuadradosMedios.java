/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsimulacion;

public class MetodoCuadradosMedios {
    int semilla, contador=0;
    String resultado="";
    
    public MetodoCuadradosMedios(int semilla, int contador){
        this.contador = contador;
        this.semilla = semilla;
    }
    
    public int NuevaSemilla(){
        int nsemilla;
        semilla = semilla*semilla;
        String Ssemilla = Integer.toString(semilla);
        int longitud = Ssemilla.length()-1;
        if (longitud > 5){
            nsemilla = Integer.parseInt(Ssemilla.substring(3, longitud));
        } else {
            nsemilla = semilla;
        }
        return nsemilla;
    }
    
    public void Metodo(){
        int aux;
        for(;contador > 0;contador--){
            aux = NuevaSemilla();
            resultado = "0." + aux;
            System.out.println(resultado);
        }
    }
}