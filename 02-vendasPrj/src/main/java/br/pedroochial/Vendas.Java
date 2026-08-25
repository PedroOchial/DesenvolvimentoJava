package br.pedroochial.pucrs.poo;

import java.util.ArrayList;

    public class Venda{

        private Cliente cliente;
        private ArrayList< ItemVenda> itens;

            public Venda (){
                this.itens = new ArrayList<ItemVenda>();
            }

         public void inserir (int Qtde, Produto prod ){
            ItemVenda item = new ItemVenda(Qtde, prod);   // cria o objeto ItemVenda
                this.itens.add(item);                          // adiciona na lista que já exis
            }
            public double valorTotal(){
                for (int i = 0; i < this.itens.size(); i ++){
                    return itens;
                }
                ]
            }

         }




        }
}
