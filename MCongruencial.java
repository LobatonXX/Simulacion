
package simulacion;

/**
 *
 * @author LPBC
 */
public class MCongruencial {
    
     int a = 0, mod = 0;
    float respuesta;

    public MCongruencial(int a, int mod){
        this.a = a;
        this.mod = mod;
        if(a < mod){
            respuesta = (float) a/mod;
        }
        else{
            respuesta = (float) (a%mod)/mod;
        }
        System.out.println("Numero generado es: " + respuesta);
    }
}
