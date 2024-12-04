/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletos;

/**
 *
 * @author alejo
 */
import java.util.Scanner;

public class BOLETO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] conciertos = {"Bad Bunny", "DUKI", "KHEA"};

        
        System.out.println("Seleccione un concierto:");
        for (int i = 0; i < conciertos.length; i++) {
            System.out.println((i + 1) + ". " + conciertos[i]);
        }

       
        int opcionConcierto = scanner.nextInt();
        if (opcionConcierto < 1 || opcionConcierto > conciertos.length) {
            System.out.println("Opcion invalida.");
            return;
        }
        String eventoSeleccionado = conciertos[opcionConcierto - 1];

        
        System.out.println("Seleccione el tipo de boleto:");
        System.out.println("1. General");
        System.out.println("2. VIP");
        int tipoBoleto = scanner.nextInt();

        int cantidad;
        double total = 0;

        if (tipoBoleto == 1) {
            
            System.out.println("Ingrese el precio del boleto general:");
            double precioGeneral = scanner.nextDouble();
            System.out.println("Cuantos boletos desea comprar");
            cantidad = scanner.nextInt();

            BoletoGeneral boletoGeneral = new BoletoGeneral(eventoSeleccionado, precioGeneral);
            total = boletoGeneral.calcularTotal(cantidad);

            System.out.println("Boleto seleccionado: General");
            System.out.println("Evento: " + boletoGeneral.getEvento());

        } else if (tipoBoleto == 2) {
            
            System.out.println("Cuantos boletos desea comprar");
            cantidad = scanner.nextInt();

            BoletoVIP boletoVIP = new BoletoVIP();
            total = boletoVIP.calcularTotal(cantidad);

            System.out.println("Boleto seleccionado: VIP");
            System.out.println("Evento: " + eventoSeleccionado);

        } else {
            System.out.println("Opcion invalida.");
            return;
        }

        
        System.out.println("Total a pagar: $" + total);

        scanner.close();
    }
}