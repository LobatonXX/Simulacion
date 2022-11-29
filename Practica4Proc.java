
package simulacion;
    import javax.swing.JOptionPane;
/**
 *
 * @author LOBATON
 */
public class Practica4Proc {
    public static void main(String[] args) {
        int opcion;
        ProcesoIndustrial x = new ProcesoIndustrial();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Un Sistema De Produccion" + "\n1 - Paletas Magnum" + "\n2 - Toallas Humedas" + "\n3 - Pan De Caja"));
            switch (opcion) {
                case 1:
                    System.out.println("Este Programa Simula La Elaboracion De La Paleta Magnum");
                    int numeroDeProcesos = x.numProceso();
                    x.procesosI();
                    break;

                case 2:
                    System.out.println("Este Programa Simula La Elaboracion De Las Toallas Humedas");
                    int numeroDeProcesos2 = x.numProceso();
                    x.procesosI();
                    break;

                case 3:
                    System.out.println("Este Programa Simula La Elaboracion Del Pan De Caja");
                    int numeroDeProcesos3 = x.numProceso();
                    x.procesosI();
                    break;
            }
        } while (opcion > 3 || opcion < 1);
    }
}
