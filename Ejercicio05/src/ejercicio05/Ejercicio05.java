/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cliente;
        double precioNetflix;
        double descuentoNetflix;
        double precioFinalNetflix;
        double precioYoutube;
        double descuentoYoutube;
        double precioFinalYoutube;
        double precioDropbox;
        double descuentoDropbox;
        double precioFinalDropbox;
        double precioSpotify;
        double descuentoSpotify;
        double precioFinalSpotify;
        double costoTotal;
        double ahorroMensual;
        double costoTotalDescuento;
        
        
        System.out.println("Ingrese su nombre: ");
        cliente = entrada.nextLine();
        System.out.println("Ingrese el precio mensual de Netflix: ");
        precioNetflix = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de YoutubePremium: ");
        precioYoutube = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de Dropbox: ");
        precioDropbox = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de Spotify: ");
        precioSpotify = entrada.nextDouble();
        
        descuentoNetflix = precioNetflix * 0.23;
        descuentoYoutube = precioYoutube * 0.23;
        descuentoDropbox = precioDropbox * 0.45;
        descuentoSpotify = precioSpotify * 0;
        
        
        precioFinalNetflix = precioNetflix - descuentoNetflix;
        precioFinalYoutube = precioYoutube - descuentoYoutube;
        precioFinalDropbox = precioDropbox - descuentoDropbox;
        precioFinalSpotify = precioSpotify - descuentoSpotify;
        
        costoTotal = precioNetflix + precioYoutube + precioDropbox
                + precioSpotify;
        ahorroMensual = descuentoNetflix + descuentoYoutube + descuentoDropbox
                + descuentoSpotify;
        costoTotalDescuento = precioFinalNetflix + precioFinalYoutube
                + precioFinalDropbox + precioFinalSpotify;
               
        
        
        
        System.out.printf("SERVICIOS DIGITALES \n----------------------------\n"
                + "Nombre del cliente: %s\n----------------------------\n"
                + "NETFLIX\nPrecio original: $ %.2f\nDescuento - 23%%: $ %.2f\n"
                + "Precio final: $ %.2f \n\nYOUTUBE PREMIUM \nPrecio original:"
                + " $ %.2f \nDescuento - 23%%: $ %.2f\nPrecio final: $ %.2f\n\n"
                + "DROPBOX\nPrecio original: $ %.2f\nDescuento - 45%%: $ %.2f\n"
                + "Precio final: $ %.2f \n\nSPOTIFY\nPrecio original: $ %.2f\n"
                + "Descuento - 0%%: $ %.2f \nPrecio final: $ %.2f \n"
                + "----------------------------\nCosto mensual sin descuento: "
                + "$ %.2f \nAhorro mensual total: $ %.2f \n"
                + "Total mensual con descuento: $ %.2f\n",
                cliente, precioNetflix, descuentoNetflix, precioFinalNetflix,
                precioYoutube, descuentoYoutube, precioFinalYoutube,
                precioDropbox, descuentoDropbox, precioFinalDropbox,
                precioSpotify, descuentoSpotify, precioFinalSpotify,
                costoTotal, ahorroMensual, costoTotalDescuento);
        
       
        
        
    }
    
}
