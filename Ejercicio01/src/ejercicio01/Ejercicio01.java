/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Declarar variables
        
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoTotal;
        
        
        System.out.println("Ingrese el nombre del proyecto 1: ");
        proyecto1 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del proyecto 1: ");
        gasto1 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del proyecto 2: ");
        entrada.nextLine();
        proyecto2 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del proyecto 2: ");
        gasto2 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del proyecto 3: ");
        entrada.nextLine();
        proyecto3 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del proyecto 3: ");
        gasto3 = entrada.nextDouble();
        
        
        gastoTotal = gasto1 + gasto2 + gasto3;
        
        
        System.out.printf("1. %s: $%2f\n2. %s: $%2f\n3. %s: $%2f\n "
                + "Gasto Mensual: $%2f\n",
                proyecto1,
                gasto1,
                proyecto2,
                gasto2,
                proyecto3,
                gasto3,
                gastoTotal);
        
        
        
        
    }
    
}
