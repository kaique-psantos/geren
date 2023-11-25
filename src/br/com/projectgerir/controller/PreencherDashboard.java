package br.com.projectgerir.controller;

import br.com.projectgerir.connection.ConnectionFactory;
import br.com.projectgerir.view.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaiqu
 */
public class PreencherDashboard {
    public static void preencher(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        String salario = null, imposto = null, insumos = null, servicosPublicos = null;
        
        try {
            
            //PREENCHE AS DESPESAS POR CATEGORIAS PRINCIPAIS
            stmt = con.prepareStatement("SELECT FORMAT(SUM(CASE WHEN d.idCATEGORIA = 18 THEN d.VALOR ELSE 0 END), 2, 'de_DE') AS Salario, FORMAT(SUM(CASE WHEN d.idCATEGORIA = 23 THEN d.VALOR ELSE 0 END), 2, 'de_DE') AS Imposto, FORMAT(SUM(CASE WHEN d.idCATEGORIA = 19 THEN d.VALOR ELSE 0 END), 2, 'de_DE') AS Insumos, FORMAT(SUM(CASE WHEN d.idCATEGORIA = 21 THEN d.VALOR ELSE 0 END), 2, 'de_DE') AS ServicosPublicos FROM despesa d WHERE d.idCATEGORIA IN (18, 23, 19, 21)");
            rs = stmt.executeQuery();
            while(rs.next()){
                TelaPrincipal.txtSalario.setText("R$ " + rs.getString("Salario"));
                TelaPrincipal.txtImposto.setText("R$ " + rs.getString("Imposto"));
                TelaPrincipal.txtInsumos.setText("R$ " + rs.getString("Insumos"));
                TelaPrincipal.txtServicosPublicos.setText("R$ " + rs.getString("ServicosPublicos"));
            }
            
            //PREENCHE O VALOR TOTAL DE DESPESAS E O VALOR TOTAL DE REGISTROS
            stmt = con.prepareStatement("SELECT FORMAT(SUM(d.VALOR), 2, 'de_DE') AS ValorTotalDespesas, COUNT(*) AS NumeroTotalDespesas FROM despesa d");
            rs = stmt.executeQuery();
            while(rs.next()){
                TelaPrincipal.txtTotalDespesas.setText("R$ " + rs.getString("ValorTotalDespesas"));
                TelaPrincipal.txtTotalRegistros.setText(rs.getString("NumeroTotalDespesas"));
                        
                        
            }
            
            //PREENCHE O TOTAL DE DESPESAS MES A MES
            stmt = con.prepareStatement("SELECT FORMAT(SUM(CASE WHEN MONTH(DATA) = 1 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Janeiro, FORMAT(SUM(CASE WHEN MONTH(DATA) = 2 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Fevereiro, FORMAT(SUM(CASE WHEN MONTH(DATA) = 3 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Marco, FORMAT(SUM(CASE WHEN MONTH(DATA) = 4 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Abril, FORMAT(SUM(CASE WHEN MONTH(DATA) = 5 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Maio, FORMAT(SUM(CASE WHEN MONTH(DATA) = 6 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Junho, FORMAT(SUM(CASE WHEN MONTH(DATA) = 7 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Julho, FORMAT(SUM(CASE WHEN MONTH(DATA) = 8 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Agosto, FORMAT(SUM(CASE WHEN MONTH(DATA) = 9 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Setembro, FORMAT(SUM(CASE WHEN MONTH(DATA) = 10 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Outubro, FORMAT(SUM(CASE WHEN MONTH(DATA) = 11 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Novembro, FORMAT(SUM(CASE WHEN MONTH(DATA) = 12 THEN VALOR ELSE 0 END), 2, 'de_DE') AS Dezembro FROM despesa;");
            rs = stmt.executeQuery();
            while(rs.next()){
               TelaPrincipal.txtJaneiro.setText("R$ " + rs.getString("Janeiro"));
               TelaPrincipal.txtFevereiro.setText("R$ " + rs.getString("Fevereiro"));
               TelaPrincipal.txtMarco.setText("R$ " + rs.getString("Marco"));
               TelaPrincipal.txtAbril.setText("R$ " + rs.getString("Abril"));
               TelaPrincipal.txtMaio.setText("R$ " + rs.getString("Maio"));
               TelaPrincipal.txtJunho.setText("R$ " + rs.getString("Junho"));
               TelaPrincipal.txtJulho.setText("R$ " + rs.getString("Julho"));
               TelaPrincipal.txtAgosto.setText("R$ " + rs.getString("Agosto"));
               TelaPrincipal.txtSetembro.setText("R$ " + rs.getString("Setembro"));
               TelaPrincipal.txtOutubro.setText("R$ " + rs.getString("Outubro"));
               TelaPrincipal.txtNovembro.setText("R$ " + rs.getString("Novembro"));
               TelaPrincipal.txtDezembro.setText("R$ " + rs.getString("Dezembro"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PreencherDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }   

    }
}
