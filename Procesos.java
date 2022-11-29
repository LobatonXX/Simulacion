package simulacion;
import javax.swing.JOptionPane;
/**
 *
 * @author LPBC
 */
public class Procesos {
    private int nProceso;
    
    public  void setNProceso(int nProceso){
        this.nProceso= nProceso;
    }
    public int getNProceso(){
        return nProceso;
    }
    public int numProceso(){
        int nProceso = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de procesos:"));
        if(nProceso>=4){
            setNProceso(nProceso);
            System.out.println("Numero de procesos:"+getNProceso());
        }else{
            JOptionPane.showMessageDialog(null,"Numero de proceso No aceptado"+"\nDebe ingresar minimo 4 procesos");
        }
        return getNProceso();
    }
    public int cT;
    public void procesosI(){
        String procesoEnTexto[]=new String [getNProceso()];
        float procesoEnTiempo[]=new float[getNProceso()];
        
        for(int p=1;p<=getNProceso();p++){
            String procesoTxt=JOptionPane.showInputDialog("¿Cual es el nombre del proceso"+p+"?");
            procesoEnTexto[p-1]=procesoTxt;
            System.out.println("El nombe del proceso"+p+"Es:"+procesoEnTexto[p-1]);
            
            int cantidadDeMateriaPrima=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es la cantidad de materia prima"));
            System.out.println("Materia prima ingresada:"+cantidadDeMateriaPrima);
            float pesoTotal=0;
            
            for(int m=1;m<cantidadDeMateriaPrima;m++){
                float pesoDeMateriaPrima=Float.parseFloat(JOptionPane.showInputDialog("¿Cual es la cantidad de materia prima?"));
                pesoTotal= pesoDeMateriaPrima + pesoTotal;
            }
            float productoTotal=cantidadDeMateriaPrima/pesoTotal;
            System.out.println("Producto Total:"+productoTotal);
            
            float procesoTiempo=Float.parseFloat(JOptionPane.showInputDialog("¿Cual es el tiempo del proceso"+p+"?"));
            procesoEnTiempo[p-1]=procesoTiempo;
            System.out.println("El tiempo del proceso"+p+"Se tarda "+procesoEnTiempo[p-1]+"minutos");
            System.out.println("");
        }
        int opcion2=Integer.parseInt(JOptionPane.showInputDialog("¿Que deseas saber?"+"\n 1-Tiempo total de la orden"+""));
    }
    
}
