package br.com.senac.model;

public class ProdutoModel {

    private int id;
    private String descricao;

    private float valor;

    public int getId() {
        return id;
    }

    private CategoriaModel categoria;

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
