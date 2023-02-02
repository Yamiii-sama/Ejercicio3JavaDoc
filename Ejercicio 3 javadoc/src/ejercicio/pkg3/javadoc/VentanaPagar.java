/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.pkg3.javadoc;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Marc
 */
public class VentanaPagar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPagar
     */
    public VentanaPagar() {
        initComponents();
    }

    int subtotal;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        botonpagar = new javax.swing.JButton();
        Cambio = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Carrito = new javax.swing.JComboBox<>();
        BorrarSeleccionado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatexto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jMenuItem1.setText("Nueva compra");
        jMenuItem1.setComponentPopupMenu(jPopupMenu1);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Borrar area de texto");
        jMenuItem2.setComponentPopupMenu(jPopupMenu1);
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonpagar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        botonpagar.setForeground(new java.awt.Color(51, 51, 51));
        botonpagar.setText("Pagar");
        botonpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpagarActionPerformed(evt);
            }
        });
        jPanel1.add(botonpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 365, 85, -1));

        Cambio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Cambio.setForeground(new java.awt.Color(51, 51, 51));
        Cambio.setText("Quédate el cambio!");
        jPanel1.add(Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 403, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Carrito de la compra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 6, 187, -1));

        Carrito.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 38, 187, -1));

        BorrarSeleccionado.setForeground(new java.awt.Color(51, 51, 51));
        BorrarSeleccionado.setText("Borrar elemento seleccionado");
        BorrarSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarSeleccionadoActionPerformed(evt);
            }
        });
        jPanel1.add(BorrarSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 66, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total de selección");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 107, 179, -1));

        areatexto.setBackground(new java.awt.Color(255, 255, 255));
        areatexto.setColumns(20);
        areatexto.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        areatexto.setForeground(new java.awt.Color(51, 51, 51));
        areatexto.setRows(5);
        areatexto.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(areatexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 521, 420));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("$");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 144, -1, -1));

        dinero.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        dinero.setForeground(new java.awt.Color(0, 102, 0));
        dinero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero.setText("0");
        dinero.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 144, 164, 17));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 133, 187, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarSeleccionadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botonpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonpagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPagar().setVisible(true);
            }
        });
    }
    
    /**
     * 
     * Establece la escucha para los botones especificados dentro del método, y envía su actioncommand a la clase "Control"
     * @param control 
     */
    void setOidor(Control control) {
        BorrarSeleccionado.addActionListener(control);
        jMenuItem1.addActionListener(control);
        jMenuItem2.addActionListener(control);
        botonpagar.addActionListener(control);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarSeleccionado;
    private javax.swing.JCheckBox Cambio;
    private javax.swing.JComboBox<String> Carrito;
    private javax.swing.JTextArea areatexto;
    private javax.swing.JButton botonpagar;
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Añade el item seleccionado al ComboBox "Carrito",
     * establece el label "Dinero" al coste total de los productos del carrito 
     * y muestra un mensaje de confirmación
     * @param itemseleccionado 
     */
    void añadiralcarrito(String itemseleccionado) {
        Carrito.addItem(itemseleccionado);
        setDinero(subtotal + "");
        JOptionPane.showMessageDialog(rootPane, "Se ha añadido " + itemseleccionado + " al carrito.");
    }

    /**
     * Devuelve el item del combobox "Carrito" que está seleccionado en ese momento
     * @return 
     */
    String getItemseleccionado() {
        return (String) Carrito.getSelectedItem();
    }

    /**
     * Elimina "itemseleccionado" del combobox "Carrito"
     * @param itemseleccionado 
     */
    void eliminardecarrito(String itemseleccionado) {
        Carrito.removeItem(itemseleccionado);
    }

    /**
     * Establece el texto de la etiqueta "Dinero"
     * @param string 
     */
    public void setDinero(String string) {
        dinero.setText(string);
    }

    /**
     * Establece el texto del area de texto
     * @param texto 
     */
    void setTextAreaTexto(String texto) {
        areatexto.setText(texto);
    }

    /**
     * Establece el parámetro "coste" al texto que hay en la etiqueta "dinero"
     * @param coste
     * @return 
     */
    int getcoste(int coste) {
        coste = Integer.parseInt(dinero.getText());
        return coste;
    }

    /**
     * Añade a el area de texto el texto especificado
     * @param textoaimprimir 
     */
    void imprimirtexto(String textoaimprimir) {
        areatexto.append(textoaimprimir);
        areatexto.append("\n");
    }

    /**
     * Devuelve la ventana a como estaba nada más iniciar el programa
     * 
     */
    void resetear() {
        subtotal = 0;
        Carrito.removeAllItems();
        dinero.setText("0");
        Cambio.setSelected(false);
        areatexto.setText("");
    }

    /**
     * Devuelve true o false dependiendo si el Checkbox "Cambio" está seleccionado
     * @return 
     */
    boolean quedateelcambio() {
        return Cambio.isSelected();
    }
}
