package br.pedroochial;

public class ProdutoEE extends Produto {

private int diasGarantia;

public ProdutoEE(int codigo, String nome, double preco,int diasGarantia){
    super(codigo ,nome, preco);
    this.diasGarantia = diasGarantia;
}
public int getDiasGarantia(){
    return this.diasGarantia;
}
@Override
public String toString(){
     return "nome" + this.getNome() +
            "codigo" + this.getCodigo() +
            "preco" + this.getPreco() +
             "Dias de garantia" + this.diasGarantia;

}


}
