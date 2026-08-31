package br.pedroochial.pucrs.poo;

import java.util.ArrayList;

    public class Venda{

        private Cliente cliente;
        private ArrayList< ItemVenda> itens;

            public Venda (){
                this.itens = new ArrayList<ItemVenda>();
            }

         public void inserir(Produto prod){ // for each
            this.inserir(qtde : 1,  prod);
         }

         public void inserir (int qtde, Produto prod){
            itens.add(new ItensVenda(qtde,prod));
//jjj
            }


}
