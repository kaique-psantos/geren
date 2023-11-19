package br.com.projectgerir.controller;

import br.com.projectgerir.model.DAO.BancoDAO;
import br.com.projectgerir.model.DAO.CategoriaDAO;
import br.com.projectgerir.model.DAO.FornecedorDAO;
import br.com.projectgerir.model.bean.Banco;
import br.com.projectgerir.model.bean.Categoria;
import br.com.projectgerir.model.bean.Fornecedor;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author kaiqu
 */
public class ComboBox {
    public static JComboBox readBanco(JComboBox cbBanco){
        cbBanco.removeAllItems();
        BancoDAO bDao = new BancoDAO();
        
        try{
            for(Banco b: bDao.read()  ){
                cbBanco.addItem(b);   
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar lista de Categorias: " + ex);
        }
        
        return cbBanco;
    }
    
    public static JComboBox readCategoria(JComboBox cbCategoria) {
        cbCategoria.removeAllItems();
        CategoriaDAO cDao = new CategoriaDAO();
        
        try{
            for(Categoria c: cDao.read()  ){
                cbCategoria.addItem(c);   
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar lista de Bancos: " + ex);
        }
        
        return cbCategoria;
    }
    public static JComboBox readFornecedor(JComboBox cbFornecedor){
        cbFornecedor.removeAllItems();
        FornecedorDAO fDao = new FornecedorDAO();
        
        try{
            for(Fornecedor f: fDao.read()  ){
                cbFornecedor.addItem(f);   
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar lista de Fornecedores: " + ex);
        }
        return cbFornecedor;
    }
}
