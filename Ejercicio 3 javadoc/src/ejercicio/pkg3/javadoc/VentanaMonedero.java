/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.pkg3.javadoc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Marc
 */
public class VentanaMonedero extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMonedero
     */
    public VentanaMonedero() {
        initComponents();
        fondo.setBackground(Color.gray);
    }

    double dineroselected;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        fondo.setBackground(new java.awt.Color(102, 51, 0));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 220, 20));

        jButton1.setText("Cambiar color de monedero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, -1));

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton2.setText("0,01$");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 70));

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton3.setText("0,02$");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        fondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 6, -1, 70));

        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton4.setText("0,05$");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fondo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 6, -1, 70));

        jButton5.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton5.setText("0,10$");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        fondo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 6, -1, 70));

        jButton6.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton6.setText("0,20$");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        fondo.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, -1, 70));

        jButton7.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton7.setText("0,50$");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        fondo.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 6, -1, 70));

        jButton8.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton8.setText("1,00$");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        fondo.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, 70));

        jButton9.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton9.setText("2,00$");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        fondo.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 94, -1, 70));

        jButton10.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton10.setText("5,00$");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        fondo.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 94, -1, 70));

        jButton11.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton11.setText("10,0$");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        fondo.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 94, -1, 70));

        jButton12.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton12.setText("20,0$");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        fondo.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 94, -1, 70));

        jButton13.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton13.setText("50,0$");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        fondo.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 94, -1, 70));

        jButton14.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton14.setText("100$");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        fondo.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 182, -1, 70));

        jButton15.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton15.setText("200$");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        fondo.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 182, -1, 70));

        jButton16.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton16.setText("500$");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        fondo.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 182, -1, 70));

        pagar.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        pagar.setText("Pagar");
        pagar.setActionCommand("Pagardesdemonedero");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        fondo.add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 220, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Dinero seleccionado:");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 220, -1));

        dinero.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        dinero.setForeground(new java.awt.Color(51, 51, 51));
        dinero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero.setText("0");
        dinero.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 164, 17));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("$");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fondo.getBackground() == Color.gray) {
            fondo.setBackground(Color.red);
        } else if (fondo.getBackground() == Color.red) {
            fondo.setBackground(Color.green);
        } else {
            fondo.setBackground(Color.gray);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        pasartextoadinero(evt);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMonedero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMonedero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMonedero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMonedero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMonedero().setVisible(true);
            }
        });
    }

    /**
     * 
     * Establece la escucha para los botones especificados dentro del m??todo, y env??a su actioncommand a la clase "Control"
     * @param control 
     */
    void setOidor(Control control) {
        pagar.addActionListener(control);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dinero;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton pagar;
    // End of variables declaration//GEN-END:variables

    /**
     * Convierte el par??metro Actioncommand en la variable "dineroselected"
     * haciendo que no pueda tener m??s de 2 decimales
     * @param e 
     */
    private void pasartextoadinero(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String text = button.getText();
        text = text.substring(0, text.length() - 1);
        text = text.replace(",", ".");
        dineroselected += Double.parseDouble(text);
        dinero.setText(String.format("%.2f", dineroselected));

    }
    
    /**
     * Establece el parametro "dineropagado" en el texto de la etiqueta "dinero"
     * y resetea la variable "dineroselected" y la etiqueta "dinero" 
     * @param dineropagado
     * @return 
     */
    double dardineroacaja(double dineropagado) {
        dineropagado = Double.parseDouble(dinero.getText().replace(",", "."));
        dineroselected = 0;
        dinero.setText("0,00");
        return dineropagado;
    }

    /**
     * Devuelve la ventana a como estaba nada m??s iniciar el programa
     */
    void resetear() {
        dineroselected = 0;
        dinero.setText("0");
        fondo.setBackground(Color.GRAY);
        this.hide();
    }
}
