package br.pedroochial;

import java.util.ArrayList;

    public class Venda{

        private Clientes cliente;
        private ArrayList< ItensVenda> itens;

            public Venda (){
                this.itens = new ArrayList<ItensVenda>();
            }

public void inserir(int Qtde, Produto prod) {
    ItensVenda item = new ItensVenda(Qtde, prod);
    this.itens.add(item);
}

public void inserir(Produto prod) {
    this.inserir(1, prod);
}

public double valorTotal() {
    double total = 0;
    for (int i = 0; i < this.itens.size(); i++) {
        ItensVenda item = this.itens.get(i);
        total = total + item.getValor();
    }
    return total;
}
        @Override
            public String toString (){
                 return "Cliente: " + this.cliente +
                 " Itens: " + this.itens;
            }

            }
