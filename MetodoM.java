
package simulacion;

/**
 *
 * @author LPBC
 */
public class MetodoM {
    
     int t, b ,ni;
    float numero,a;

    public MetodoM(int t, int b, int ni ){
        this.t = t;
        this.b = b;
         this.ni= ni;
          String binario = "";
        a=(8*t)+3;
          for(;ni == numero; numero--){
            numero = a * ni;
            if(numero > 0){
                while(numero > 0){
                    if(numero%2 == 0){
                        binario = "0" + binario;
                    } else{
                        binario = "1" + binario;
                    }
                    numero = (int) numero/2^b;
                }
            } else if (numero == 0){
                binario = "0";
            } else{
                binario = "No se puede convertir el numero.";
            }
            System.out.println("El numero convertido a binario es: " + numero);
            int nbinario = Integer.parseInt(binario);
      
    }
    }
}
