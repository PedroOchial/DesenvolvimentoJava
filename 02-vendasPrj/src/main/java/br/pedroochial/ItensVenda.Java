package br.pedroochial.pucrs.poo;

    public class ItemVenda{

    private int quantidade;
    private Produto prod;

        public ItemVenda(int quantidade, Produto prod){
            this.quantidade = quantidade;
            this.prod = prod;
        }
        public double getValor() {
             return this.quantidade * this.prod.getPreco();
        }

     @Override
        public String toString(){
            return "Quantidade " + this.quantidade + "Produto " + this.prod + "Valor " + this.getValor();
           }
        }




