package br.com.projectgerir.view;


import static br.com.projectgerir.controller.PreencherDashboard.preencher;
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
        preencher();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        inserirIcon(this);;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnAddDespesa = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtUserLogado = new javax.swing.JLabel();
        txtNomeUsuarioLogado = new javax.swing.JLabel();
        txtTotalDespesas = new javax.swing.JLabel();
        txtTotalRegistros = new javax.swing.JLabel();
        txtServicosPublicos = new javax.swing.JLabel();
        txtImposto = new javax.swing.JLabel();
        txtInsumos = new javax.swing.JLabel();
        txtSalario = new javax.swing.JLabel();
        txtFevereiro = new javax.swing.JLabel();
        txtMarco = new javax.swing.JLabel();
        txtAbril = new javax.swing.JLabel();
        txtMaio = new javax.swing.JLabel();
        txtJunho = new javax.swing.JLabel();
        txtJulho = new javax.swing.JLabel();
        txtAgosto = new javax.swing.JLabel();
        txtSetembro = new javax.swing.JLabel();
        txtOutubro = new javax.swing.JLabel();
        txtNovembro = new javax.swing.JLabel();
        txtDezembro = new javax.swing.JLabel();
        txtJaneiro = new javax.swing.JLabel();
        imgTelaPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERIR - PRINCIPAL");

        jPanel1.setBackground(new java.awt.Color(19, 7, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtUserLogado.setForeground(new java.awt.Color(255, 255, 255));
        txtUserLogado.setText("main.user");
        jPanel1.add(txtUserLogado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 60, 20));

        txtNomeUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNomeUsuarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeUsuarioLogado.setText("Usuario Main");
        txtNomeUsuarioLogado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtNomeUsuarioLogado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 120, 40));

        txtTotalDespesas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtTotalDespesas.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalDespesas.setText("R$ 000.000,00");
        jPanel1.add(txtTotalDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 390, -1, -1));

        txtTotalRegistros.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotalRegistros.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRegistros.setText("00");
        jPanel1.add(txtTotalRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 100, 70));

        txtServicosPublicos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtServicosPublicos.setForeground(new java.awt.Color(255, 255, 255));
        txtServicosPublicos.setText("R$ 000.000,00");
        jPanel1.add(txtServicosPublicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, -1, -1));

        txtImposto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtImposto.setForeground(new java.awt.Color(255, 255, 255));
        txtImposto.setText("R$ 000.000,00");
        jPanel1.add(txtImposto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        txtInsumos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtInsumos.setForeground(new java.awt.Color(255, 255, 255));
        txtInsumos.setText("R$ 000.000,00");
        jPanel1.add(txtInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 250, -1, -1));

        txtSalario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(255, 255, 255));
        txtSalario.setText("R$ 000.000,00");
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        txtFevereiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFevereiro.setForeground(new java.awt.Color(255, 255, 255));
        txtFevereiro.setText("R$ 000.000,00");
        jPanel1.add(txtFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 420, -1, -1));

        txtMarco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarco.setForeground(new java.awt.Color(255, 255, 255));
        txtMarco.setText("R$ 000.000,00");
        jPanel1.add(txtMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 420, -1, -1));

        txtAbril.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAbril.setForeground(new java.awt.Color(255, 255, 255));
        txtAbril.setText("R$ 000.000,00");
        jPanel1.add(txtAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 420, -1, -1));

        txtMaio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaio.setForeground(new java.awt.Color(255, 255, 255));
        txtMaio.setText("R$ 000.000,00");
        jPanel1.add(txtMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        txtJunho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtJunho.setForeground(new java.awt.Color(255, 255, 255));
        txtJunho.setText("R$ 000.000,00");
        jPanel1.add(txtJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 500, -1, -1));

        txtJulho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtJulho.setForeground(new java.awt.Color(255, 255, 255));
        txtJulho.setText("R$ 000.000,00");
        jPanel1.add(txtJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 500, -1, -1));

        txtAgosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAgosto.setForeground(new java.awt.Color(255, 255, 255));
        txtAgosto.setText("R$ 000.000,00");
        jPanel1.add(txtAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 500, -1, -1));

        txtSetembro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSetembro.setForeground(new java.awt.Color(255, 255, 255));
        txtSetembro.setText("R$ 000.000,00");
        jPanel1.add(txtSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 590, -1, -1));

        txtOutubro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtOutubro.setForeground(new java.awt.Color(255, 255, 255));
        txtOutubro.setText("R$ 000.000,00");
        jPanel1.add(txtOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 590, -1, -1));

        txtNovembro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNovembro.setForeground(new java.awt.Color(255, 255, 255));
        txtNovembro.setText("R$ 000.000,00");
        jPanel1.add(txtNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 590, -1, -1));

        txtDezembro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDezembro.setForeground(new java.awt.Color(255, 255, 255));
        txtDezembro.setText("R$ 000.000,00");
        jPanel1.add(txtDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 590, -1, -1));

        txtJaneiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtJaneiro.setForeground(new java.awt.Color(255, 255, 255));
        txtJaneiro.setText("R$ 000.000,00");
        jPanel1.add(txtJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        imgTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/imgTelaPrincipalV3.png"))); // NOI18N
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
    private javax.swing.JLabel imgTelaPrincipal;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel txtAbril;
    public static javax.swing.JLabel txtAgosto;
    public static javax.swing.JLabel txtDezembro;
    public static javax.swing.JLabel txtFevereiro;
    public static javax.swing.JLabel txtImposto;
    public static javax.swing.JLabel txtInsumos;
    public static javax.swing.JLabel txtJaneiro;
    public static javax.swing.JLabel txtJulho;
    public static javax.swing.JLabel txtJunho;
    public static javax.swing.JLabel txtMaio;
    public static javax.swing.JLabel txtMarco;
    private javax.swing.JLabel txtNomeUsuarioLogado;
    public static javax.swing.JLabel txtNovembro;
    public static javax.swing.JLabel txtOutubro;
    public static javax.swing.JLabel txtSalario;
    public static javax.swing.JLabel txtServicosPublicos;
    public static javax.swing.JLabel txtSetembro;
    public static javax.swing.JLabel txtTotalDespesas;
    public static javax.swing.JLabel txtTotalRegistros;
    private javax.swing.JLabel txtUserLogado;
    // End of variables declaration//GEN-END:variables

}
