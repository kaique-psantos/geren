package br.com.projectgerir.model.DAO;

import br.com.projectgerir.connection.ConnectionFactory;
import br.com.projectgerir.model.bean.Banco;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class BancoDAO {
    public void create(Banco b) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try{ 
            stmt = con.prepareStatement("INSERT INTO banco (NOME_BANCO) VALUES(?)");
            stmt.setString(1, b.getNomeBanco());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro: Este Banco já existe, tente adicionar um novo", 
                    "ERRO: BANCO EXISTENTE", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar Banco: " + ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }      
    }
    
    public List<Banco> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Banco> bancos = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM banco ORDER BY NOME_BANCO asc");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Banco banco = new Banco();
                
                banco.setId(rs.getInt("idBANCO"));
                banco.setNomeBanco(rs.getString("NOME_BANCO"));
                
                bancos.add(banco);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return bancos;
    }
}
