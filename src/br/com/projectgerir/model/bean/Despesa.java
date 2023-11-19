package br.com.projectgerir.model.bean;

/**
 *
 * @author kaiqu
 */
public class Despesa {
    private int id;
    private int idBanco;
    private int idCategoria;
    private int idFornecedor;
    private String descricaoDespesa;
    private String dataPagamento;
    private double valor;
    private int idUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getDescricaoDespesa() {
        return descricaoDespesa;
    }

    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Despesa{" + "id=" + id + ", idBanco=" + idBanco + ", idCategoria=" + idCategoria + ", idFornecedor=" + idFornecedor + ", descricaoDespesa=" + descricaoDespesa + ", dataPagamento=" + dataPagamento + ", valor=" + valor + ", idUsuario=" + idUsuario + '}';
    }
    
    
    
}
