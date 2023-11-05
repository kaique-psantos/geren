package br.com.projectgerir.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kaiqu
 */
public class ConnectionFactory {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://aws.connect.psdb.cloud/dbgerir?sslMode=VERIFY_IDENTITY";
    private static String USER = "fk0fwp8qde8vyx576h73";
    private static String PASS = "pscale_pw_jZC1LndmW9wk01RoT13nKFNGfedkttPmxhPbUgimnaL";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
           
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados (ConnectionFactory.getConnection()) ", ex);  
        }
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
