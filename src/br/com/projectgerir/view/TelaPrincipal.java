package br.com.projectgerir.view;

import static br.com.projectgerir.util.Utilitarios.inserirIcon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author kaiqu
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        inserirIcon(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAddDespesa = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        imgTelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERIR - PRINCIPAL");

        jPanel1.setBackground(new java.awt.Color(19, 7, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuario.setAutoscrolls(true);
        btnUsuario.setBorder(null);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setFocusable(false);
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
        });
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 50));

        btnSair.setBorder(null);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 50, 40));

        btnAddDespesa.setBorder(null);
        btnAddDespesa.setContentAreaFilled(false);
        btnAddDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddDespesa.setFocusable(false);
        btnAddDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDespesaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddDespesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 180, 40));

        btnPesquisar.setBorder(null);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setFocusable(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 90, 40));

        imgTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/imgTelaPrincipalV2.png"))); // NOI18N
        jPanel1.add(imgTelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 4, 1301, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDespesaActionPerformed
        TelaAddDespesa telaAddDespesa;
        try {
            telaAddDespesa = new TelaAddDespesa();
            telaAddDespesa.setVisible(true);
            this.dispose(); 
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
    }//GEN-LAST:event_btnAddDespesaActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // Abrir a tela de login (supondo que o nome da classe seja TelaLogin)
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        
        // Fechar a janela atual
        this.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        TelaPesquisaDespesa telaPesquisaDespesa = new TelaPesquisaDespesa();
        telaPesquisaDespesa.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // Abrir a tela de login (supondo que o nome da classe seja TelaLogin)
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        
        // Fechar a janela atual
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDespesa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel imgTelaPrincipal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
