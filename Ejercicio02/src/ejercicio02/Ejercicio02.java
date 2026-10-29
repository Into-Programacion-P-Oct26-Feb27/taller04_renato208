/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        double base;
        double altura;
        double area;
        
        System.out.println("Ingrese la base del triangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura dle triangulo: ");
        altura = entrada.nextDouble();
        
        area = (base * altura) / 2;
                
     
        System.out.printf("Tu triangulo tiene: \nBase: %.2f \nAltura: %.2f\n"
                + "Area: %.2f\n",base, altura, area);
        
        
        
    }
    
}
