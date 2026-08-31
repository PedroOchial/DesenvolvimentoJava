package br.pedroochial;

public class ClientePJ extends Clientes{

    private String cnpj;

    public ClientePJ (String nome, String cpf, String cnpj) {
       super(nome, cpf);
        this.cnpj = cnpj;
    }
    @Override
        public String toString(){
         return "nome" + this.getNome() +
                "cpf" + this.getCpf() +
                "CNPJ" + this.cnpj;
    }

}




