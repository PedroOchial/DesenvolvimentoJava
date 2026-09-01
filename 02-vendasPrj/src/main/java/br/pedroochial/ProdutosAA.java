package br.pedroochial;

public class ProdutosAA extends Produto {

    private double impostoAlcool;

    public ProdutosAA(int codigo, String nome, double preco, double impostoAlcool) {
        super(codigo, nome, preco);
        this.impostoAlcool = impostoAlcool;
    }

    public double getImpostoAlcool() {
        return this.impostoAlcool;
    }

    public void setImpostoAlcool(double impostoAlcool) {
        this.impostoAlcool = impostoAlcool;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + (super.getPreco() * this.impostoAlcool / 100);
    }

    @Override
    public String toString() {
        return "nome" + this.getNome() +
                "codigo" + this.getCodigo() +
                "preco" + this.getPreco() +
                "impostoAlcool" + this.impostoAlcool;
    }
}
