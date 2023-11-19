package br.com.projectgerir.view;


import br.com.projectgerir.view.popUp.TelaAddBanco;
import br.com.projectgerir.view.popUp.TelaAddCategoria;
import br.com.projectgerir.view.popUp.TelaAddFornecedor;
import br.com.projectgerir.model.DAO.DespesaDAO;
import br.com.projectgerir.model.bean.Banco;
import br.com.projectgerir.model.bean.Categoria;
import br.com.projectgerir.model.bean.Despesa;
import br.com.projectgerir.model.bean.Fornecedor;
import static br.com.projectgerir.controller.ComboBox.readBanco;
import static br.com.projectgerir.controller.ComboBox.readCategoria;
import static br.com.projectgerir.controller.ComboBox.readFornecedor;
import static br.com.projectgerir.util.Utilitarios.converterData;
import static br.com.projectgerir.util.Utilitarios.inserirIcon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author kaiqu
 */
public class TelaAddDespesa extends javax.swing.JFrame {

    /**
     * Creates new form TelaAddDespesa
     * @throws java.sql.SQLException
     */
    public TelaAddDespesa() throws SQLException {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        inserirIcon(this);
        
        cbBanco = readBanco(cbBanco);
        cbCategoria = readCategoria(cbCategoria);
        cbFornecedor =  readFornecedor(cbFornecedor);
      
    }
    

    public static JComboBox<Object> getCbBanco(){
        return cbBanco;
    }
    public static void setCbBanco(JComboBox<Object> cbBanco) {
        TelaAddDespesa.cbBanco = cbBanco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbFornecedor = new javax.swing.JComboBox<>();
        cbBanco = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnAddFornecedor = new javax.swing.JButton();
        btnAddBanco = new javax.swing.JButton();
        btnAddCategoria = new javax.swing.JButton();
        btnAdicionarDespesa = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtDataPagamento = new javax.swing.JFormattedTextField();
        imgTelaAddDespesa3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERIR - Adicionar Despesa");
        setBackground(new java.awt.Color(19, 7, 46));

        jPanel5.setBackground(new java.awt.Color(19, 7, 46));

        jPanel2.setBackground(new java.awt.Color(19, 7, 46));
        jPanel2.setForeground(new java.awt.Color(19, 7, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbFornecedor.setBorder(null);
        cbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFornecedorActionPerformed(evt);
            }
        });
        jPanel2.add(cbFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 490, 39));

        cbBanco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbBanco.setBorder(null);
        cbBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBancoActionPerformed(evt);
            }
        });
        jPanel2.add(cbBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 180, 200, 39));

        cbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbCategoria.setBorder(null);
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 180, 210, 39));

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDescricao.setBorder(null);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 590, 38));

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtValor.setBorder(null);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 260, 140, 37));

        btnAddFornecedor.setBorder(null);
        btnAddFornecedor.setBorderPainted(false);
        btnAddFornecedor.setContentAreaFilled(false);
        btnAddFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddFornecedor.setFocusPainted(false);
        btnAddFornecedor.setFocusable(false);
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 180, 40, 40));

        btnAddBanco.setBorder(null);
        btnAddBanco.setBorderPainted(false);
        btnAddBanco.setContentAreaFilled(false);
        btnAddBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBanco.setFocusPainted(false);
        btnAddBanco.setFocusable(false);
        btnAddBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBancoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 40, 40));

        btnAddCategoria.setBorder(null);
        btnAddCategoria.setBorderPainted(false);
        btnAddCategoria.setContentAreaFilled(false);
        btnAddCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCategoria.setDefaultCapable(false);
        btnAddCategoria.setFocusPainted(false);
        btnAddCategoria.setFocusable(false);
        btnAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 40, 40));

        btnAdicionarDespesa.setBorder(null);
        btnAdicionarDespesa.setBorderPainted(false);
        btnAdicionarDespesa.setContentAreaFilled(false);
        btnAdicionarDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarDespesa.setFocusPainted(false);
        btnAdicionarDespesa.setFocusable(false);
        btnAdicionarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDespesaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdicionarDespesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 373, 230, 60));

        btnVoltar.setBorder(null);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusable(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 160, 50));

        txtDataPagamento.setBorder(null);
        try {
            txtDataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPagamentoActionPerformed(evt);
            }
        });
        jPanel2.add(txtDataPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 160, 37));

        imgTelaAddDespesa3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgTelaAddDespesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projectgerir/images/TelaDespesaV3.png"))); // NOI18N
        jPanel2.add(imgTelaAddDespesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1250, 750));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFornecedorActionPerformed

    private void cbBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBancoActionPerformed

    
    }//GEN-LAST:event_cbBancoActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAddBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBancoActionPerformed
        TelaAddBanco telaAddBanco = new TelaAddBanco();
        telaAddBanco.setVisible(true);
        
    }//GEN-LAST:event_btnAddBancoActionPerformed

    private void btnAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoriaActionPerformed
        TelaAddCategoria telaAddCategoria = new TelaAddCategoria();
        telaAddCategoria.setVisible(true);
    }//GEN-LAST:event_btnAddCategoriaActionPerformed

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        TelaAddFornecedor telaAddFornecedor = new TelaAddFornecedor();
        telaAddFornecedor.setVisible(true);
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnAdicionarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDespesaActionPerformed
        
        String dataFormatadaMySQL = converterData(txtDataPagamento);
        
        Banco banco = (Banco) cbBanco.getSelectedItem();
        Categoria categoria = (Categoria) cbCategoria.getSelectedItem();
        Fornecedor fornecedor = (Fornecedor) cbFornecedor.getSelectedItem();
        Despesa despesa = new Despesa();
        try{
            despesa.setIdBanco(banco.getId());
            despesa.setIdCategoria(categoria.getId());
            despesa.setIdFornecedor(fornecedor.getId());
            despesa.setDescricaoDespesa(txtDescricao.getText());
            despesa.setValor(Double.parseDouble(txtValor.getText()));
            despesa.setDataPagamento(dataFormatadaMySQL);
            
            DespesaDAO dDao = new DespesaDAO();
            dDao.create(despesa);
        }catch(java.sql.SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Digite uma data válida!");
        }catch(java.lang.NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O Valor da despesa não foi\ndigitado corretamente");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar adicionar despesa " + ex);
            
        }
        
        txtDescricao.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnAdicionarDespesaActionPerformed

    private void txtDataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaAddDespesa().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "erro ao gerar Tela Add Despesa: " + ex);
                    Logger.getLogger(TelaAddDespesa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBanco;
    private javax.swing.JButton btnAddCategoria;
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnAdicionarDespesa;
    private javax.swing.JButton btnVoltar;
    public static javax.swing.JComboBox<Object> cbBanco;
    public static javax.swing.JComboBox<Object> cbCategoria;
    public static javax.swing.JComboBox<Object> cbFornecedor;
    private javax.swing.JLabel imgTelaAddDespesa3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JFormattedTextField txtDataPagamento;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    
}
