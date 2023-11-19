package br.com.projectgerir.model.DAO;

import br.com.projectgerir.connection.ConnectionFactory;
import br.com.projectgerir.model.bean.Despesa;
import br.com.projectgerir.model.bean.DespesaPesquisaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<DespesaPesquisaModel> readDespesaAll(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<DespesaPesquisaModel> despesas = new ArrayList<>();
        
        try{
           stmt = con.prepareStatement("SELECT d.idDESPESA, d.DESCRICAO, d.DATA, d.VALOR, b.NOME_BANCO, c.NOME_CATEGORIA, d.idCATEGORIA, f.NOME_FORNECEDOR, d.idFORNECEDOR, d.idUSUARIO FROM despesa AS d JOIN banco AS b ON d.idBANCO = b.idBANCO JOIN categoria AS c ON d.idCATEGORIA = c.idCATEGORIA JOIN fornecedor AS f ON d.idFORNECEDOR = f.idFORNECEDOR");
           rs = stmt.executeQuery();
           
           while(rs.next()){
                DespesaPesquisaModel despesa = new DespesaPesquisaModel();
                
                despesa.setId(rs.getInt("idDESPESA"));
                despesa.setNomeBanco(rs.getString("NOME_BANCO"));
                despesa.setNomeCategoria(rs.getString("NOME_CATEGORIA"));
                despesa.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                despesa.setDescricaoDespesa(rs.getString("DESCRICAO"));
                despesa.setDataPagamento(rs.getString("DATA"));
                despesa.setValor(rs.getDouble("VALOR"));
                
                despesas.add(despesa);
           }   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return despesas;
    }
    
    public List<DespesaPesquisaModel> readDespesaData(String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<DespesaPesquisaModel> despesas = new ArrayList<>();
        
        try{
           stmt = con.prepareStatement("SELECT d.idDESPESA, d.DESCRICAO, d.DATA, d.VALOR, b.NOME_BANCO, c.NOME_CATEGORIA, d.idCATEGORIA, f.NOME_FORNECEDOR, d.idFORNECEDOR, d.idUSUARIO FROM despesa AS d JOIN banco AS b ON d.idBANCO = b.idBANCO JOIN categoria AS c ON d.idCATEGORIA = c.idCATEGORIA JOIN fornecedor AS f ON d.idFORNECEDOR = f.idFORNECEDOR WHERE d.DATA BETWEEN ? AND ? ORDER BY DATA");
           stmt.setString(1, dataInicial);
           stmt.setString(2, dataFinal);
           rs = stmt.executeQuery();
           
           while(rs.next()){
                DespesaPesquisaModel despesa = new DespesaPesquisaModel();
                
                despesa.setId(rs.getInt("idDESPESA"));
                despesa.setNomeBanco(rs.getString("NOME_BANCO"));
                despesa.setNomeCategoria(rs.getString("NOME_CATEGORIA"));
                despesa.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                despesa.setDescricaoDespesa(rs.getString("DESCRICAO"));
                despesa.setDataPagamento(rs.getString("DATA"));
                despesa.setValor(rs.getDouble("VALOR"));
                
                despesas.add(despesa);
           }   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return despesas;
    }
    
    public List<DespesaPesquisaModel> readDespesaCategoria(int idCategoria, String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<DespesaPesquisaModel> despesas = new ArrayList<>();
        
        try{
           stmt = con.prepareStatement("SELECT d.idDESPESA, d.DESCRICAO, d.DATA, d.VALOR, b.NOME_BANCO, c.NOME_CATEGORIA, d.idCATEGORIA, f.NOME_FORNECEDOR, d.idFORNECEDOR, d.idUSUARIO FROM despesa AS d JOIN banco AS b ON d.idBANCO = b.idBANCO JOIN categoria AS c ON d.idCATEGORIA = c.idCATEGORIA JOIN fornecedor AS f ON d.idFORNECEDOR = f.idFORNECEDOR WHERE d.idCATEGORIA = ? AND d.DATA BETWEEN ? AND ? ORDER BY DATA");
           stmt.setInt(1, idCategoria);
           stmt.setString(2, dataInicial);
           stmt.setString(3, dataFinal);
           rs = stmt.executeQuery();
           
           while(rs.next()){
                DespesaPesquisaModel despesa = new DespesaPesquisaModel();
                
                despesa.setId(rs.getInt("idDESPESA"));
                despesa.setNomeBanco(rs.getString("NOME_BANCO"));
                despesa.setNomeCategoria(rs.getString("NOME_CATEGORIA"));
                despesa.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                despesa.setDescricaoDespesa(rs.getString("DESCRICAO"));
                despesa.setDataPagamento(rs.getString("DATA"));
                despesa.setValor(rs.getDouble("VALOR"));
                
                despesas.add(despesa);
           }   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return despesas;
    }

    public List<DespesaPesquisaModel> readDespesaFornecedor(int idFornecedor, String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<DespesaPesquisaModel> despesas = new ArrayList<>();
        
        try{
           stmt = con.prepareStatement("SELECT d.idDESPESA, d.DESCRICAO, d.DATA, d.VALOR, b.NOME_BANCO, c.NOME_CATEGORIA, d.idCATEGORIA, f.NOME_FORNECEDOR, d.idFORNECEDOR, d.idUSUARIO FROM despesa AS d JOIN banco AS b ON d.idBANCO = b.idBANCO JOIN categoria AS c ON d.idCATEGORIA = c.idCATEGORIA JOIN fornecedor AS f ON d.idFORNECEDOR = f.idFORNECEDOR WHERE d.idFORNECEDOR = ? AND d.DATA BETWEEN ? AND ? ORDER BY DATA");
           stmt.setInt(1, idFornecedor);
           stmt.setString(2, dataInicial);
           stmt.setString(3, dataFinal);
           rs = stmt.executeQuery();
           
           while(rs.next()){
                DespesaPesquisaModel despesa = new DespesaPesquisaModel();
                
                despesa.setId(rs.getInt("idDESPESA"));
                despesa.setNomeBanco(rs.getString("NOME_BANCO"));
                despesa.setNomeCategoria(rs.getString("NOME_CATEGORIA"));
                despesa.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                despesa.setDescricaoDespesa(rs.getString("DESCRICAO"));
                despesa.setDataPagamento(rs.getString("DATA"));
                despesa.setValor(rs.getDouble("VALOR"));
                
                despesas.add(despesa);
           }   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return despesas;
    }
     
    public List<DespesaPesquisaModel> readDespesa2Filtros(int idCategoria, int idFornecedor, String dataInicial, String dataFinal){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<DespesaPesquisaModel> despesas = new ArrayList<>();
        
        try{
           stmt = con.prepareStatement("SELECT d.idDESPESA, d.DESCRICAO, d.DATA, d.VALOR, b.NOME_BANCO, c.NOME_CATEGORIA, d.idCATEGORIA, f.NOME_FORNECEDOR, d.idFORNECEDOR, d.idUSUARIO FROM despesa AS d JOIN banco AS b ON d.idBANCO = b.idBANCO JOIN categoria AS c ON d.idCATEGORIA = c.idCATEGORIA JOIN fornecedor AS f ON d.idFORNECEDOR = f.idFORNECEDOR WHERE d.idCATEGORIA = ? AND d.idFORNECEDOR = ? AND d.DATA BETWEEN ? AND ? ORDER BY DATA");
           stmt.setInt(1, idCategoria);
           stmt.setInt(2, idFornecedor);
           stmt.setString(3, dataInicial);
           stmt.setString(4, dataFinal);
           rs = stmt.executeQuery();
           
           while(rs.next()){
                DespesaPesquisaModel despesa = new DespesaPesquisaModel();
                
                despesa.setId(rs.getInt("idDESPESA"));
                despesa.setNomeBanco(rs.getString("NOME_BANCO"));
                despesa.setNomeCategoria(rs.getString("NOME_CATEGORIA"));
                despesa.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                despesa.setDescricaoDespesa(rs.getString("DESCRICAO"));
                despesa.setDataPagamento(rs.getString("DATA"));
                despesa.setValor(rs.getDouble("VALOR"));
                
                despesas.add(despesa);
           }   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao relizar Query: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return despesas;
    }
}
