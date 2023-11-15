package br.com.projectgerir.model.DAO;

import br.com.projectgerir.connection.ConnectionFactory;
import br.com.projectgerir.model.bean.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class CategoriaDAO {
    
    public void create(Categoria c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try{ 
            stmt = con.prepareStatement("INSERT INTO categoria (NOME_CATEGORIA) VALUES(?)");
            stmt.setString(1, c.getNomeCategoria());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro: Esta Categoria já existe, tente adicionar uma nova", 
                    "ERRO: CATEGORIA EXISTENTE", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar categoria: " + ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }      
    }
    
   public List<Categoria> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM categoria ORDER BY NOME_CATEGORIA asc");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                
                categoria.setId(rs.getInt("idCATEGORIA"));
                categoria.setNomeCategoria(rs.getString("NOME_CATEGORIA"));
                
                categorias.add(categoria);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
    }
    
//     public void update(Categoria c) throws SQLException{
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;    
//        
//        try{ 
//            stmt = con.prepareStatement("UPDATE produto SET NOME_CATEGORIA = ? WHERE id = ?");
//            stmt.setString(1, c.getNomeCategoria());
//            stmt.setInt(2, c.getId());
//
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);
//            
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt);
//        }      
//    }
//     
//    public void delete(Categoria c) throws SQLException{
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;    
//        
//        try{ 
//            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
//            stmt.setInt(1, c.getId());
//
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "DAO Erro ao Excluir: " + ex);
//            
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt);
//        }      
//    }
        
}

