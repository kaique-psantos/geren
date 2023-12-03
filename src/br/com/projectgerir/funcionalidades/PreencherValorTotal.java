package br.com.projectgerir.funcionalidades;

import br.com.projectgerir.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class PreencherValorTotal {
    public static String valorPorData(String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String valorTotal = "0";
        
        try {   
            stmt = con.prepareStatement("SELECT FORMAT(SUM(VALOR), 2, 'de_DE') AS TotalDespesas FROM despesa WHERE DATA BETWEEN ? AND ?");
            stmt.setString(1, dataInicial);
            stmt.setString(2, dataFinal);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                valorTotal = rs.getString("TotalDespesas"); 
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar valor total");
            System.out.println("ERRO: " + ex);
            Logger.getLogger(PreencherValorTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valorTotal;
    }
    
    public static String valorPorCategoria(int idCategoria, String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String valorTotal = "0";
        
        try {   
            stmt = con.prepareStatement("SELECT FORMAT(SUM(VALOR), 2, 'de_DE') AS TotalDespesas FROM despesa WHERE idCATEGORIA = ? AND DATA BETWEEN ? AND ?");
            stmt.setInt(1, idCategoria);
            stmt.setString(2, dataInicial);
            stmt.setString(3, dataFinal);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                valorTotal = rs.getString("TotalDespesas"); 
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar valor total");
            System.out.println("ERRO: " + ex);
            Logger.getLogger(PreencherValorTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valorTotal;
    }
    
    public static String valorPorFornecedor(int idFornecedor, String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String valorTotal = "0";
        
        try {   
            stmt = con.prepareStatement("SELECT FORMAT(SUM(VALOR), 2, 'de_DE') AS TotalDespesas FROM despesa WHERE idFORNECEDOR = ? AND DATA BETWEEN ? AND ?");
            stmt.setInt(1, idFornecedor);
            stmt.setString(2, dataInicial);
            stmt.setString(3, dataFinal);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                valorTotal = rs.getString("TotalDespesas"); 
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar valor total");
            System.out.println("ERRO: " + ex);
            Logger.getLogger(PreencherValorTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valorTotal;
    }
    
    public static String valorPor2Filtros(int idFornecedor, int idCategoria, String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String valorTotal = "0";
        
        try {   
            stmt = con.prepareStatement("SELECT FORMAT(SUM(VALOR), 2, 'de_DE') AS TotalDespesas FROM despesa WHERE idFORNECEDOR = ? AND idCATEGORIA = ? AND DATA BETWEEN ? AND ?");
            stmt.setInt(1, idFornecedor);
            stmt.setInt(2, idCategoria);
            stmt.setString(3, dataInicial);
            stmt.setString(4, dataFinal);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                valorTotal = rs.getString("TotalDespesas"); 
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar valor total");
            System.out.println("ERRO: " + ex);
            Logger.getLogger(PreencherValorTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valorTotal;
    }
}
