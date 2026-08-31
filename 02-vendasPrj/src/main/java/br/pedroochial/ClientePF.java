
package br.pedroochial;

public class ClientePF extends Clientes {

    public ClientePF(String nome, String cpf) {
       super(nome, cpf);
    }
@Override
    public String toString(){
         return "nome" + this.getNome() +
                "cpf" + this.getCpf() ;
    }
}

