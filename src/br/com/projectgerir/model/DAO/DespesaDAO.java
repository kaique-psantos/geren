/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projectgerir.model.DAO;

import br.com.projectgerir.connection.ConnectionFactory;
import br.com.projectgerir.model.bean.Banco;
import br.com.projectgerir.model.bean.Despesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class DespesaDAO {
    public void create(Despesa d) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try{ 
            stmt = con.prepareStatement("INSERT INTO despesa (idBANCO, idCATEGORIA, idFORNECEDOR, DESCRICAO, VALOR, DATA) VALUES(?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, d.getIdBanco());
            stmt.setInt(2, d.getIdCategoria());
            stmt.setInt(3, d.getIdFornecedor());
            stmt.setString(4, d.getDescricaoDespesa());
            stmt.setDouble(5, d.getValor());
            stmt.setString(6, d.getDataPagamento());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }catch(java.sql.SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Digite uma data válida!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar Despesa: " + ex);
            System.out.println(ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }      
    }
}
