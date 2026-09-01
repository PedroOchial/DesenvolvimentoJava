package br.pedroochial;

public class ClientePJ extends Clientes {

    private String cnpj;

    public ClientePJ(String nome, String codigo, String cnpj) {
        super(nome, codigo);
        this.cnpj = cnpj;
    }

    @Override
    public String getID() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return "nome" + this.getNome() + "CNPJ" + this.cnpj;
    }
}
