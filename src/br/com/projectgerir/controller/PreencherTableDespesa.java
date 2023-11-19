package br.com.projectgerir.controller;

import br.com.projectgerir.model.DAO.DespesaDAO;
import br.com.projectgerir.model.bean.DespesaPesquisaModel;
import static br.com.projectgerir.view.TelaPesquisaDespesa.tableDespesas;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kaiqu
 */
public class PreencherTableDespesa {
    public static void readTableDespesa2Filtros(int idCategoria, int idFornecedor, String dataInicial, String  dataFinal){
        DefaultTableModel modelo = (DefaultTableModel) tableDespesas.getModel();
        modelo.setNumRows(0);
        DespesaDAO dDao = new DespesaDAO();
        
        for(DespesaPesquisaModel d : dDao.readDespesa2Filtros(idCategoria, idFornecedor,dataInicial, dataFinal)){
            modelo.addRow(new Object[]{
                d.getNomeBanco(),
                d.getNomeCategoria(),
                d.getNomeFornecedor(),
                d.getDescricaoDespesa(),
                d.getDataPagamento(),
                d.getValor() 
            });
        }   
    }

    public static void readTableDespesaCategoria(int idCategoria, String dataInicial, String  dataFinal){
        DefaultTableModel modelo = (DefaultTableModel) tableDespesas.getModel();
        modelo.setNumRows(0);
        DespesaDAO dDao = new DespesaDAO();
        
        for(DespesaPesquisaModel d : dDao.readDespesaCategoria(idCategoria,dataInicial, dataFinal)){
            modelo.addRow(new Object[]{
                d.getNomeBanco(),
                d.getNomeCategoria(),
                d.getNomeFornecedor(),
                d.getDescricaoDespesa(),
                d.getDataPagamento(),
                d.getValor() 
            });
        }   
    }

    public static void readTableDespesaFornecedor(int idFornecedor, String dataInicial, String  dataFinal){
        DefaultTableModel modelo = (DefaultTableModel) tableDespesas.getModel();
        modelo.setNumRows(0);
        DespesaDAO dDao = new DespesaDAO();
        
        for(DespesaPesquisaModel d : dDao.readDespesaFornecedor(idFornecedor,dataInicial, dataFinal)){
            modelo.addRow(new Object[]{
                d.getNomeBanco(),
                d.getNomeCategoria(),
                d.getNomeFornecedor(),
                d.getDescricaoDespesa(),
                d.getDataPagamento(),
                d.getValor() 
            });
        }   
    }
    
    public static void readTableDespesaData(String dataInicial, String  dataFinal){
        DefaultTableModel modelo = (DefaultTableModel) tableDespesas.getModel();
        modelo.setNumRows(0);
        DespesaDAO dDao = new DespesaDAO();
        
        for(DespesaPesquisaModel d : dDao.readDespesaData(dataInicial, dataFinal)){
            modelo.addRow(new Object[]{
                d.getNomeBanco(),
                d.getNomeCategoria(),
                d.getNomeFornecedor(),
                d.getDescricaoDespesa(),
                d.getDataPagamento(),
                d.getValor() 
            });
        }   
    }
}
