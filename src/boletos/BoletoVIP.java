/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletos;

/**
 *
 * @author alejo
 */
public class BoletoVIP {
    private final double precio = 200.0; // Precio fijo

    
    public BoletoVIP() {
    }

    
    public double calcularTotal(int cantidad) {
        return cantidad * precio;
    }

    
    public double getPrecio() {
        return precio;
    }
}