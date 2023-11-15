package br.com.projectgerir.model.bean;

/**
 *
 * @author kaiqu
 */
public class Fornecedor {
    private int id;
    private String nomeFornecedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    @Override
    public String toString() {
        return getNomeFornecedor();
    }
}
