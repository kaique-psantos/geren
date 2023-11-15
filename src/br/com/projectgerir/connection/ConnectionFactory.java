package br.com.projectgerir.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://aws.connect.psdb.cloud/dbgerir?sslMode=VERIFY_IDENTITY";
    private static final String USER = "fk0fwp8qde8vyx576h73";
    private static final String PASS = "pscale_pw_jZC1LndmW9wk01RoT13nKFNGfedkttPmxhPbUgimnaL";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
           
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados (ConnectionFactory.getConnection()) " +  ex);
        }
        return null;
    }
    
    public static void closeConnection(Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao tentar fechar conexão com o banco de dados (ConnectionFactory.closeConnection(con) ", ex);
        }
    }  
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try {   
            if(stmt != null){
               stmt.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao tentar fechar conexão com o banco de dados (ConnectionFactory.closeConnection(con, stmt)) ", ex);
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        try {   
           if(rs != null){
               rs.close();
           }
        } catch (SQLException ex) {
                throw new RuntimeException("Erro ao tentar fechar conexão com o banco de dados (ConnectionFactory.closeConnection(con, stmt)) ", ex);
            }
    }
    
    
    
}
