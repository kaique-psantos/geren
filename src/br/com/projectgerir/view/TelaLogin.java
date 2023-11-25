package br.com.projectgerir.view;

import br.com.projectgerir.model.DAO.UsuarioDAO;
import br.com.projectgerir.model.bean.Usuario;
import static br.com.projectgerir.util.Utilitarios.inserirIcon;
import br.com.projectgerir.view.popUp.TelaEsqueceuSenha;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author kaiqu
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        inserirIcon(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEsqueceuSenha = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtUsuario1 = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        imgTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN - GERIR");
        setBackground(new java.awt.Color(19, 7, 46));

        jPanel1.setBackground(new java.awt.Color(19, 7, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEsqueceuSenha.setBorder(null);
        btnEsqueceuSenha.setContentAreaFilled(false);
        btnEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEsqueceuSenha.setFocusable(false);
        btnEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 280, 20));

        btnLogin.setBorder(null);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 380, 60));

        txtUsuario1.setBackground(new java.awt.Color(19, 7, 46));
        txtUsuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario1.setBorder(null);
        txtUsuario1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuario1KeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 360, 30));

        txtSenha.setBackground(new java.awt.Color(19, 7, 46));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 360, 30));

        imgTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/imgTelaLogin.png"))); // NOI18N
        jPanel1.add(imgTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1301, 704));

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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
            String nome_usuario, senha_usuario;
            nome_usuario = txtUsuario1.getText();
            senha_usuario = new String(txtSenha.getPassword());

            Usuario usuario = new Usuario();
            usuario.setUser(nome_usuario);
            usuario.setSenha(senha_usuario);
            
            UsuarioDAO usuarioD = new UsuarioDAO();
            boolean autenticacaoUsuario = usuarioD.autenticacaoUsuario(usuario);
            
            if(autenticacaoUsuario){
                TelaPrincipal p = new TelaPrincipal();
                p.setVisible(true);
                this.dispose();
            }
            else{ 
              JOptionPane.showMessageDialog(null, "Credenciais inválidos. Verifique seu usuário ou senha.", "Login", JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuSenhaActionPerformed
        TelaEsqueceuSenha telaEsqueceuSenha = new TelaEsqueceuSenha(this, rootPaneCheckingEnabled);
        telaEsqueceuSenha.setVisible(true);
    }//GEN-LAST:event_btnEsqueceuSenhaActionPerformed

    private void txtUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuario1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           //PULAR PARA O CAMPO SENHA
        }
    }//GEN-LAST:event_txtUsuario1KeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           String nome_usuario, senha_usuario;
            nome_usuario = txtUsuario1.getText();
            senha_usuario = new String(txtSenha.getPassword());

            Usuario usuario = new Usuario();
            usuario.setUser(nome_usuario);
            usuario.setSenha(senha_usuario);
            
            UsuarioDAO usuarioD = new UsuarioDAO();
            boolean autenticacaoUsuario = usuarioD.autenticacaoUsuario(usuario);
            
            if(autenticacaoUsuario){
                TelaPrincipal p = new TelaPrincipal();
                p.setVisible(true);
                this.dispose();
            }
            else{ 
              JOptionPane.showMessageDialog(null, "Credenciais inválidos. Verifique seu usuário ou senha.", "Login", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEsqueceuSenha;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel imgTelaLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
