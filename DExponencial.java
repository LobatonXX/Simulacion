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
import java.util.Random;

public class DExponencial {
    private int i;//lleva el numero de clientes 
    private int la;//lleva la landa 
    private double ri[];//lleva los Ri's
    private double ei[];//lleva los valores Ei
    private double ti[];//lleva los valor de Ti
    private double tr[];//lleva los valores de tiempo real
    private double te[];//lleva los valores de tiempo espera
    private Random m = new Random();
    
    public DExponencial(int pi, int pa){
        this.i=pi;
        this.la=pa;
        ri = new double[i];
        for(int j=0;j<i;j++){
           ri[j]=(double)m.nextInt(9999)/10000; 
        }
    }
    
    public int getLanda(){
        return la;
    }
    public double[] getRI(){
        return ri;
    }
    private double restaRi(double pr){
        return 1-pr;
    }
    private double logaritmo(double pl){
        return Math.log(pl);
    }
    private double retornaEi(int pi){
        return (-3*logaritmo(restaRi(ri[pi])));
    }
    
    private double[] guardaTi(){
        ti = new double[i];
        for(int j=0;j<i;j++){
            ti[j]=Math.rint(retornaEi(j)*Math.pow(10,2))/Math.pow(10,2);
        }
        return this.ti;
    }
    
    private double[] guardaTr(){
        tr = new double[i];
        for(int j=0;j<i;j++){
            tr[j]=tiempo(guardaTi()[j]);
        }
        return this.tr;
    }
    
    private double tiempo(double pi){
        double r=0;
        r=(int)(pi*100)/100;
        pi=(pi*100)%100;
        pi=(pi/100)*60;
        r=r+(pi/100);
        return r;
    }
    
    private double[] guardaTe(){
        te = new double[i];
        te[0]=0;
        for(int j=1,a=0;j<i;j++,a++){
            te[j]=te[j-1]+guardaTr()[a];
            te[j]=aTiempo(te[j]);
        }
        return te;
    }
    
    private double aTiempo(double pt){
        int r=0;
        double rr=0;
        r=(int)(pt*100);
        if(r%100<60){
            return pt;
        }else{
          r=(int)(pt*100)%100;
          rr=(double)r/100; 
          return Math.rint(pt)+ajustaT(rr);
        }
    }
    
    private double ajustaT(double pn){
        return pn-0.60;
    }
    
    public double[] getTi(){
        return guardaTi();
    }
    
    public double[] getTr(){
        return guardaTr();
    }

    public void ensena(){
        double r=0;
        System.out.print("No Cte: "+"\t");
        System.out.print("Ri: "+"\t\t");
        System.out.print("Ei=-λ*ln(1-ri): "+"\t");
        System.out.print("Ti: "+"\t");
        System.out.print("Tr: "+"\t");
        System.out.print("Te: "+"\n");
        for(int j=0;j<i;j++){
            System.out.print((j+1)+"\t\t");
            System.out.print(getRI()[j]+"\t\t");
            System.out.print(" - "+getLanda()+" * Ln( 1 - "+getRI()[j]+")\t");
            System.out.print(getTi()[j]+"\t");
            System.out.print(getTr()[j]+"\t");
            System.out.print(guardaTe()[j]+"\n");            
        }
    } 
}