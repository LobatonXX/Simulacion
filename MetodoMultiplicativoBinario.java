
package progsimulacion;

public class MetodoMultiplicativoBinario {

    int t, semilla, b, contador;
    float resultado;

    public MetodoMultiplicativoBinario(int t, int semilla, int b, int contador) {
        this.t = t;
        this.semilla = semilla;
        this.b = (int) Math.pow(b, 2);
        this.contador = contador;
        int a = (8 * t) + semilla;
        int numero, modulo, contador2 = 4;
        String binario = "";
        System.out.println("valores t semi b " + t + " " + semilla+ " " + b);
        for (; contador > 0; contador--) {
            numero = a * semilla;
            //pasa de decimal a binario
            while (contador2 > 0) {
                modulo = (numero % 2);
                binario = modulo + binario;
                numero = numero / 2;
                contador2--;
            }
            contador2 = 4;
            System.out.println(binario);
            //pasa de binario a decimal
            int binarioint = Integer.parseInt(binario);
            binario = "";
            int exponente = 0;
            int decimal = 0;
            while (binarioint != 0) {
                int digito = binarioint % 10;
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                exponente++;
                binarioint = binarioint / 10;
            }
            System.out.println("Decimal: " + decimal);
            semilla = decimal;
            resultado = ((float)decimal /(float) this.b);
            System.out.println("resultado: " + resultado);
        }
    }
}