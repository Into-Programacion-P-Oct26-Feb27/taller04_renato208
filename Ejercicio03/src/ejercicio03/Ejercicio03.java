/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String titular;
        String direccion;
        double costoMinutos;
        int minutosConsumidos;
        double valorTotal;
        
        System.out.println("Ingresa tu nombre completo: ");
        titular = entrada.nextLine();
        System.out.println("Ingresa tu dirección: ");
        direccion = entrada.nextLine();
        System.out.println("Ingresa el costo por minuto: ");
        costoMinutos = entrada.nextDouble();
        System.out.println("Ingresa los minutos consumidos: ");
        minutosConsumidos = entrada.nextInt();
        
        valorTotal = costoMinutos * minutosConsumidos;
        
        System.out.printf("==================================\n"
                + "PLANTILLA DE SERVICIO TELEFÓNICO\n"
                + "==================================\nTitular: %s\n"
                + "Dirección: %s\n ---------------------------------\n"
                + "Costo por minuto: $%.2f\nMinutos consumidos: %s\n"
                + "----------------------------------\n"
                + "VALOR TOTAL A PAGAR: $%.2f\n"
                + "==================================\n",
                titular, direccion, costoMinutos,
                minutosConsumidos, valorTotal);
            
     
        
        
    }
    
}
