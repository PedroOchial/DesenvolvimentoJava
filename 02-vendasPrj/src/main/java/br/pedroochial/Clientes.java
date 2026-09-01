package br.pedroochial;

public abstract class Clientes {

    private String nome;
    private String codigo;

    public Clientes(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public abstract String getID();

    public String getNome() {
        return this.nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String toString() {
        return "nome" + this.nome + "codigo" + this.codigo;
    }
}
