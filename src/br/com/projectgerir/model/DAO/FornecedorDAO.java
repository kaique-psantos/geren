package br.com.projectgerir.model.DAO;

import br.com.projectgerir.connection.ConnectionFactory;
import br.com.projectgerir.model.bean.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author kaiqu
 */
public class FornecedorDAO {
    public void create(Fornecedor f) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try{ 
            stmt = con.prepareStatement("INSERT INTO fornecedor (NOME_FORNECEDOR) VALUES(?)");
            stmt.setString(1, f.getNomeFornecedor());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }catch(SQLIntegrityConstraintViolationException ex){
            
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro: Este Fornecedor já existe, tente adicionar um novo", 
                    "ERRO: FORNECEDOR EXISTENTE", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar Fornecedor: " + ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }      
    }
    
    public List<Fornecedor> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fornecedores = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor ORDER BY NOME_FORNECEDOR asc");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setId(rs.getInt("idFORNECEDOR"));
                fornecedor.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                
                fornecedores.add(fornecedor);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fornecedores;

    }
}
