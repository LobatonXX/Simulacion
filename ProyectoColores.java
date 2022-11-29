package simulacion;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO 7
 */
public class ProyectoColores{

    private int nProceso;

    public void setNProceso(int nProceso) {
        this.nProceso = nProceso;
    }

    public int getNProceso() {
        return nProceso;
    }

    public int numProceso() {
        int nProceso = Integer.parseInt(JOptionPane.showInputDialog("Introduzca El Numero De Procesos"));
        if (nProceso >= 4) {
            setNProceso(nProceso);
            System.out.println("Numero De Procesos: " + getNProceso());
        } else {
            JOptionPane.showMessageDialog(null, "Numero De Procesos No Aceptado" + "\nDebe Ingresar Minimo 4 Procesos");
        }
        return getNProceso();
    }
    public int cT;

    public void procesosI() {
        String procesoEnTexto[] = new String[getNProceso()];
        float procesoEnTiempo[] = new float[getNProceso()];

        for (int p = 1; p <= getNProceso(); p++) {
            String procesoTxt = JOptionPane.showInputDialog("¿Cual Es El Nombre Del Proceso " + p + "?");
            procesoEnTexto[p - 1] = procesoTxt;
            System.out.println("El Nombre Del Proceso" + p + "es: " + procesoEnTexto[p - 1]);

            int cantidadDeMateriaPrima = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanta Materia Prima Ingresa?"));
            System.out.println("Materia Prima Ingresada: " + cantidadDeMateriaPrima);
            float pesoTotal = 0;

            for (int m = 1; m <= cantidadDeMateriaPrima; m++) {
                float pesoDeMateriaPrima = Float.parseFloat(JOptionPane.showInputDialog("¿Cual Es La Cantidad De Materia Prima En Kilos, Litros, Etc?"));
                pesoTotal = pesoDeMateriaPrima + pesoTotal;
            }
            float productoTotal = cantidadDeMateriaPrima / pesoTotal;
            System.out.println("Producto Total: " + productoTotal);

            float procesoTiempo = Float.parseFloat(JOptionPane.showInputDialog("¿Cual Es El tiempo Del Proceso " + p + "?"));
            procesoEnTiempo[p - 1] = procesoTiempo;
            System.out.println("El Tiempo Del Proceso " + p + " Se Tarda " + procesoEnTiempo[p - 1] + " Minutos");
            System.out.println("");
        }

        int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que Deseas Saber?" + "\n1 - Tiempo total de la orden" + "\n2 - Tiempo Parciales" +
                "\n3 - N° Productos Generados En La Orden" + "\n4 - Cantidad de Ordenes Necesarias" + "\n5 - Todas las Opciones"));
        switch (opcion2) {
            case 1:
                int tiempo = procesoEnTiempo.length;
                float tiempoTotal = 0;
                for (int i = 0; i < tiempo; i++) {
                    tiempoTotal = procesoEnTiempo[i] + tiempoTotal;
                }
                JOptionPane.showMessageDialog(null, "El tiempo total de la orden es: " + tiempoTotal + " minutos");
                break;

            case 2:
                int tiempo2 = procesoEnTiempo.length;
                for (int i = 0; i < tiempo2; i++) {
                    System.out.println("Tiempo Parcial:" + (i + 1) + tiempo2);
                }
                break;

            case 3:
                System.out.println("N° Productos Generados En La Orden: " + "100,000");
                break;

            case 4:
                System.out.println("Cantidad de Ordenes Necesarias: " + "1");
                break;

            case 5:
                int tiempo5 = procesoEnTiempo.length;
                float tiempoTotal5 = 0;
                for (int i = 0; i < tiempo5; i++) {
                    tiempoTotal = procesoEnTiempo[i] + tiempoTotal5;
                }
                JOptionPane.showMessageDialog(null, "El Tiempo Total de la Orden es: " + tiempoTotal5);

                int tiempo6 = procesoEnTiempo.length;
                for (int i = 0; i < tiempo6; i++) {
                    System.out.println("Tiempo parcial: " + (i + 1) + tiempo6);
                }

                System.out.println("N° Productos Generados En La Orden: " + "100,000");
                System.out.println("Cantidad de Ordenes Necesarias: " + "1");
                break;

            default:
                JOptionPane.showMessageDialog(null, "NO EXISTE LA OPCION INGRESADA");
        }
    }

}
