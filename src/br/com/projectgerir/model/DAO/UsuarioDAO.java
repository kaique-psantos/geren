package br.com.projectgerir.model.DAO;

import br.com.projectgerir.model.bean.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import br.com.projectgerir.connection.ConnectionFactory;
import java.sql.PreparedStatement;

/**
 *
 * @author danta
 */
public class UsuarioDAO {

    Connection con;
    
    
    public boolean autenticacaoUsuario(br.com.projectgerir.model.bean.Usuario usuario) {
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        try {
            String sql = "SELECT * FROM usuario WHERE USER = ? AND SENHA = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getSenha());

            rs = stmt.executeQuery();
          
            return rs.next();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuario" + erro);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
   

}
