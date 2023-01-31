/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.javadoc;

/**
 *
 * @author Marc
 */
public class Ejercicio3Javadoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaCompra Ventana1 = new VentanaCompra();
        VentanaMonedero Ventana2 = new VentanaMonedero();
        VentanaPagar Ventana3 = new VentanaPagar();
        Control control = new Control(Ventana1, Ventana2, Ventana3);
        Ventana1.setOidor(control);
        Ventana2.setOidor(control);
        Ventana3.setOidor(control);
        Ventana1.setVisible(true);
        Ventana3.setVisible(true);
    }
    
}
