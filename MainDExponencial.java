/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author EQUIPO
 */
import java.util.Scanner;
public class MainDExponencial {
    private int ri;
    private int la;
    Scanner teclado = new Scanner(System.in);
    
    void pide(){
        System.out.print("Ingresa el numero de Ri's: "+"\n");            
        ri = teclado.nextInt();
        System.out.print("Ingresa Landa: "+"\n");            
        la = teclado.nextInt();
    }
    
    public void ejecuta(){
        pide();
        DExponencial de = new DExponencial(ri,la);
        de.ensena();
    }

    public static void main(String[] args) {
        MainDExponencial  prueba = new MainDExponencial();
        prueba.ejecuta();
    }
}