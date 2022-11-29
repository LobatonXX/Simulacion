
package simulacion;

/**
 *
 * @author LPBC
 */
public class MetodoD {
    
     int a, mod ,ni,contador;
    float numero;
    

    public MetodoD(int a, int mod, int ni){
        this.a = a;
        this.mod = mod;
         this.ni= ni;
        for(;numero>0;numero--){
            if(numero> mod){
                numero = (float) ((a*ni)%mod)/mod;
            } else {
                numero = (float) (a*ni)/mod;
            }
        System.out.println("Numero generado es: " + numero);
    }
    }
}