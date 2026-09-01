package br.pedroochial;

public class ClientePF extends Clientes {

    private String cpf;

    public ClientePF(String nome, String codigo, String cpf) {
        super(nome, codigo);
        this.cpf = cpf;
    }

    @Override
    public String getID() {
        return this.getCpf();
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "nome" + this.getNome() + "cpf" + this.cpf;
    }
}
