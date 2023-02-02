/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3.javadoc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Marc
 */
public class Control implements ActionListener {

    private VentanaPagar VentanaDePago;
    private VentanaMonedero VentanaDeMonedero;
    private VentanaCompra VentanaDeCompra;

    public Control(VentanaCompra Ventana1, VentanaMonedero Ventana2, VentanaPagar Ventana3) {
        this.VentanaDeCompra = Ventana1;
        this.VentanaDeMonedero = Ventana2;
        this.VentanaDePago = Ventana3;
    }

    double dineropagado;
    int coste;

    Productos Leche_Pascual = new Productos(5, "Leche Pascual");
    Productos Crema_avellanas = new Productos(3, "Crema de avellanas");
    Productos CocaLao = new Productos(4, "Coca-Lao");
    Productos Cereales_avena = new Productos(7, "Cereales de avena");
    Productos Mantelada = new Productos(4, "Mantelada");
    Productos Mermequilla = new Productos(4, "Mermequilla");
    Productos Azucar_salado = new Productos(6, "Azucar salado");
    Productos Cafe_descafeinado = new Productos(15, "Café descafeinado");
    Productos Tostadas_pan = new Productos(5, "Tostadas de pan");
    Productos Pan_tostado = new Productos(6, "Pan tostado");
    Productos Sushi = new Productos(12, "Pescado crudo (sushi)");
    Productos Hamburguesa = new Productos(8, "Hamburguesa");
    Productos Pizza = new Productos(10, "Pizza");
    Productos Pizza_hamburguesa = new Productos(20, "Pizza de hamburguesa");
    Productos[] matProductos = {Leche_Pascual, Crema_avellanas, CocaLao, Cereales_avena, Mantelada, Mermequilla, Azucar_salado, Cafe_descafeinado, Tostadas_pan, Pan_tostado, Sushi, Hamburguesa, Pizza, Pizza_hamburguesa};

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Añadir al carrito":
                for (int i = 0; i < matProductos.length; i++) {
                    if (matProductos[i].nombre.equalsIgnoreCase(VentanaDeCompra.getItemseleccionado())) {
                        VentanaDePago.subtotal += matProductos[i].precio;
                    }
                }
                VentanaDePago.añadiralcarrito(VentanaDeCompra.getItemseleccionado());
                break;
            case "Borrar elemento seleccionado":
                if (VentanaDePago.getItemseleccionado() == null) {
                    JOptionPane.showMessageDialog(null, "No puedes eliminar algo que no tienes");
                } else {
                    for (int i = 0; i < matProductos.length; i++) {
                        if (matProductos[i].nombre.equalsIgnoreCase(VentanaDePago.getItemseleccionado())) {
                            VentanaDePago.eliminardecarrito(VentanaDePago.getItemseleccionado());
                            VentanaDePago.subtotal -= matProductos[i].precio;
                            VentanaDePago.setDinero(VentanaDePago.subtotal + "");
                            break;
                        }
                    }
                }
                break;
            case "Nueva compra":
                int opcion = JOptionPane.showOptionDialog(VentanaDePago, "Se borrarán todos los datos de esta compra, ¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (opcion == JOptionPane.YES_OPTION) {
                    VentanaDeCompra.resetear();
                    VentanaDePago.resetear();
                    VentanaDeMonedero.resetear();
                    dineropagado = 0;
                    coste = 0;
                } else if (opcion == JOptionPane.NO_OPTION) {
                }
                break;
            case "Borrar area de texto":
                VentanaDePago.setTextAreaTexto("");
                break;
            case "Pagar":
                if (VentanaDeMonedero.isVisible()) {
                    VentanaDeMonedero.hide();
                } else {
                    VentanaDeMonedero.show();
                }
                break;
            case "Pagardesdemonedero":
                dineropagado += VentanaDeMonedero.dardineroacaja(dineropagado);
                VentanaDeMonedero.dispose();
                coste = VentanaDePago.getcoste(coste);
                VentanaDePago.imprimirtexto("Me has dado un total de " + dineropagado + "$");
                if (dineropagado == coste) {
                    VentanaDePago.imprimirtexto("Vaya, me has dado el dinero justo, pues eso es todo, \ngracias por tu compra!");
                    dineropagado = 0;
                    JOptionPane.showMessageDialog(VentanaDePago, "Saliendo de la tienda...");
                    VentanaDeCompra.resetear();
                    VentanaDePago.resetear();
                    VentanaDeMonedero.resetear();
                    dineropagado = 0;
                    coste = 0;

                } else if (dineropagado < coste) {
                    VentanaDePago.imprimirtexto("Me has dado " + dineropagado + "$, pero aún te faltan " + (coste - dineropagado) + "$");
                } else {
                    if (VentanaDePago.quedateelcambio()) {
                        VentanaDePago.imprimirtexto("Vaya, ¿puedo quedarme con el cambio? Muchisimas gracias!");
                        JOptionPane.showMessageDialog(VentanaDePago, "Saliendo de la tienda...");
                        VentanaDeCompra.resetear();
                        VentanaDePago.resetear();
                        VentanaDeMonedero.resetear();
                        dineropagado = 0;
                        coste = 0;
                    } else {
                        VentanaDePago.imprimirtexto("Me has dado de más, aquí tienes el cambio");
                        VentanaDePago.imprimirtexto("*Te devuelve un total de " + (dineropagado - coste) + "$*");
                        JOptionPane.showMessageDialog(VentanaDePago, "Saliendo de la tienda...");
                        VentanaDeCompra.resetear();
                        VentanaDePago.resetear();
                        VentanaDeMonedero.resetear();
                        dineropagado = 0;
                        coste = 0;
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
    }

}
