/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletos;

/**
 *
 * @author alejo
 */
public class BoletoGeneral {
    private String evento;
    private double precio;

    
    public BoletoGeneral(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    
    public double calcularTotal(int cantidad) {
        return cantidad * precio;
    }

    
    public String getEvento() {
        return evento;
    }
}