
package simulacion;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO 7
 */
public class Proyecto {
        public static void main(String[] args) {
        int opcion;
        ProyectoColores x = new ProyectoColores(); 
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion que desea:" + "\n1-Lapices de Colores" + "\n2"
                    + ""
                    + "-Salir"));
            switch(opcion){
                case 1:
                    System.out.println("Este Programa Simula La Elaboracion De Los Lapices de Colores");
                    int numeroDeProcesos = x.numProceso();
                    x.procesosI();
                    break;       
                case 2:
                    System.out.println("Gracias por Ingresar al Programa");
                    break;
            }
        }while(opcion>2 || opcion<1);
    }  
}
