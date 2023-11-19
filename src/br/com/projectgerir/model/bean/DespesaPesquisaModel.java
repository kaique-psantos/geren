package br.com.projectgerir.model.bean;

/**
 *
 * @author kaiqu
 */
public class DespesaPesquisaModel {
    private int id;
    private String nomeBanco;
    private String nomeCategoria;
    private String nomeFornecedor;
    private String descricaoDespesa;
    private String dataPagamento;
    private double valor;

    @Override
    public String toString() {
        return "DespesaPesquisa{" + "id=" + id + ", nomeBanco=" + nomeBanco + ", nomeCategoria=" + nomeCategoria + ", nomeFornecedor=" + nomeFornecedor + ", descricaoDespesa=" + descricaoDespesa + ", dataPagamento=" + dataPagamento + ", valor=" + valor + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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
    
    
}
