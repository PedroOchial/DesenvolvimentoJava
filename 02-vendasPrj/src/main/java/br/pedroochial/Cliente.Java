package br.pedroochial.pucrs.poo;


public class Cliente {

    private String nome;
    private String cpf;

        public Pessoa ( String nome, String cpf){
          this.nome = nome;
          this.cpf = cpf;
  }
          public String getNome(){
            return this.nome;
          }
          public String getCpf(){
            return this.cpf;
          }

    @Override
        public String toString(){
            return "nome" + this.nome + "cpf" + this.cpf;
        }
}
