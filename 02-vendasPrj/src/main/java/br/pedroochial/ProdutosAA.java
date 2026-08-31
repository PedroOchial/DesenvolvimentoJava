package br.pedroochial;

public class ProdutosAA extends Produto  {
    private double taxaImposto;

    public ProdutosAA (int codigo, String nome, double preco, double taxaImposto ){
        super(codigo ,nome, preco);
        this.taxaImposto = taxaImposto;
    }

    public double getTaxaImposto(){
        return this.taxaImposto;
    }

    public double getValorImposto() {
        return this.getPreco() * (this.taxaImposto / 100);
    }


@Override
public String toString(){
     return "nome" + this.getNome() +
            "codigo" + this.getCodigo() +
            "preco" + this.getPreco() +
            "taxa de Imposto" + this.taxaImposto +
            "Valor do Imposto" + this.getValorImposto();

    }
}
