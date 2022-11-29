/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;


    import java.util.Scanner;

public class DistribucionBer {
    public static void main(String[] args) {
        int p, prob, r,
                x;
        int x1, x0;
        float //variable aletoria
                vi,
                //Numero aletorio        
                ri, ri2 = 0;
        //ri= (float) ri;
        Scanner r2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Escriba el valor de p");
        p = r2.nextInt();
        System.out.println("Escriba el valor de ri");
        ri = r2.nextFloat();

        ri = (float) (ri2 * 0.0001);
        prob = 100 - p;
        if (0.0 <= ri && ri <= prob) {
            System.out.println("" + ri + "" + prob);
            System.out.println("X=0, no ocurre el evento");
        } else if (prob <= ri && ri <= 1.0) {
            System.out.println("es igual a uno 1");
        }

    }
}
