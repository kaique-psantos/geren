/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projectgerir.view.popUp;

import br.com.projectgerir.model.DAO.BancoDAO;
import br.com.projectgerir.model.bean.Banco;
import br.com.projectgerir.view.TelaAddDespesa;
import static br.com.projectgerir.view.TelaAddDespesa.readBanco;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class TelaAddBanco extends javax.swing.JFrame{

    /**
     * Creates new form TelaCadastroUsuarioSDI
     */
    public TelaAddBanco() {
        initComponents();
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
        btnAddBanco = new javax.swing.JButton();
        txtNomeBanco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADICIONAR BANCO");
        setBackground(new java.awt.Color(19, 7, 46));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(19, 7, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddBanco.setContentAreaFilled(false);
        btnAddBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBanco.setFocusable(false);
        btnAddBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBancoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 70, 40));

        txtNomeBanco.setBackground(new java.awt.Color(19, 7, 46));
        txtNomeBanco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeBanco.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeBanco.setBorder(null);
        txtNomeBanco.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNomeBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeBancoKeyPressed(evt);
            }
        });
        jPanel1.add(txtNomeBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 113, 230, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/imgTelaAddBanco.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 470, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //metodo modelo
    private void adicionarBanco(){
        Banco b = new Banco();
        BancoDAO bDao = new BancoDAO();
        
        b.setNomeBanco(txtNomeBanco.getText());
        
        try{
            bDao.create(b);
            txtNomeBanco.setText("");
            readBanco();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro so salvar o Banco: "+ex);
        }
    }
    
    private void btnAddBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBancoActionPerformed
        adicionarBanco();
    }//GEN-LAST:event_btnAddBancoActionPerformed

    private void txtNomeBancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeBancoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            adicionarBanco();
        }
    }//GEN-LAST:event_txtNomeBancoKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAddBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBanco;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNomeBanco;
    // End of variables declaration//GEN-END:variables
}
