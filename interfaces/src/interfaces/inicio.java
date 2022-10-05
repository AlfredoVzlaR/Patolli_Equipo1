/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public class inicio extends javax.swing.JFrame {
    
    private ImageIcon imagen; 
    private Icon icon;
    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(fondo, "src/img/patolli.jpg");
        this.pintarImagen(titulo, "src/img/titulo.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        btnCrearJuego = new javax.swing.JButton();
        btnEntrarPartida = new javax.swing.JButton();
        btnReglas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearJuego.setBackground(new java.awt.Color(51, 153, 255));
        btnCrearJuego.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnCrearJuego.setText("Crear juego");
        btnCrearJuego.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCrearJuego.setBorderPainted(false);
        btnCrearJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearJuegoActionPerformed(evt);
            }
        });

        btnEntrarPartida.setBackground(new java.awt.Color(0, 153, 255));
        btnEntrarPartida.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnEntrarPartida.setText("Entrar a partida");
        btnEntrarPartida.setToolTipText("");
        btnEntrarPartida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        btnEntrarPartida.setBorderPainted(false);
        btnEntrarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarPartidaActionPerformed(evt);
            }
        });

        btnReglas.setBackground(new java.awt.Color(0, 153, 255));
        btnReglas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnReglas.setText("Reglas del juego");
        btnReglas.setToolTipText("");
        btnReglas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        btnReglas.setBorderPainted(false);
        btnReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglasActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 255));
        btnSalir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("");
        btnSalir.setActionCommand("");
        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReglas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnCrearJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReglas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearJuegoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracion().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnCrearJuegoActionPerformed

    private void btnReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reglas().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnReglasActionPerformed

    private void btnEntrarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarPartidaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }
    
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icon = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearJuego;
    private javax.swing.JButton btnEntrarPartida;
    private javax.swing.JButton btnReglas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
