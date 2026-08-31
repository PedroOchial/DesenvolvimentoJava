package br.pedroochial;

public class ClientePJ extends Clientes{

    private String cnpj;

    public ClientePJ (String nome, String Codigo, String cnpj) {
       super(nome, Codigo);
        this.cnpj = cnpj;
    }
    @Override
        public String toString(){
         return "nome" + this.getNome() +
                "CNPJ" + this.cnpj;
    }

}




