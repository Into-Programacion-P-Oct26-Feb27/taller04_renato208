/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);
            
            String cliente;
            double CPU;
            double pantalla;
            double teclado;
            double raton;
            double costoBaseTotal;
            double costoAdicional;
            double costoTotal;
            
            System.out.println("Ingrese su nombre: ");
            cliente = entrada.nextLine();
            System.out.println("Ingrese el costo del CPU: ");
            CPU = entrada.nextDouble();
            System.out.println("Ingrese el costo del Teclado: ");
            teclado = entrada.nextDouble();
            System.out.println("Ingrese el costo del Raton: ");
            raton = entrada.nextDouble();
            System.out.println("Ingrese el costo de la Pantalla: ");
            pantalla = entrada.nextDouble();
            
            costoBaseTotal = CPU + teclado + raton + pantalla;
            
            costoAdicional = costoBaseTotal * 0.15;
            
            costoTotal = costoBaseTotal + costoAdicional;
            
            System.out.printf("Reporte: \nNombres del cliente: %s\n"
                    + "Valores iniciales:\nCPU: $ %.1f\nTeclado: $ %.1f\n"
                    + "Ratón: $ %.1f\nPantalla: $ %.1f\n\nCosto base: $ %.0f\n"
                    + "Costo adicional del 15%%: %.2f\nCosto final: $ %.2f\n",
                    cliente, CPU, teclado, raton, pantalla, costoBaseTotal,
                    costoAdicional, costoTotal);
                    
            
        
    }
    
}
