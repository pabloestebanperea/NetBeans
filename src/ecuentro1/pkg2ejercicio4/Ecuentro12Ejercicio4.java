/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32+(9 * C / 5)
 */
package ecuentro1.pkg2ejercicio4;

import java.util.Scanner;
import java.util.Locale;


public class Ecuentro12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double grados,fahrenheit;
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la Temperatura en Grados: ");    
        grados=leer.nextDouble();
        fahrenheit= 32+(9*grados/5);
        System.out.print("Ingrese la Temperatura en Fahrenheit: "+fahrenheit);                 
    }
}
