package br.pedroochial;

import java.util.ArrayList;

public class CadastroProduto {

    private ArrayList<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new ArrayList<Produto>();
    }

    public void inserir(Produto produto) {
        this.produtos.add(produto);
    }

    public Produto buscar(int posicao) {
        return this.produtos.get(posicao);
    }

    public int quantidade() {
        return this.produtos.size();
    }

    @Override
    public String toString() {
        return "Produtos cadastrados: " + this.produtos;
    }
}
