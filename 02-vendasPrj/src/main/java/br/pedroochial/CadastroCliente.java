package br.pedroochial;
import java.util.ArrayList;

public class CadastroCliente {

    private ArrayList<Clientes> clientes;

    public CadastroCliente() {
        this.clientes = new ArrayList<Clientes>();
    }

    public void inserir(Clientes cliente) {
        this.clientes.add(cliente);
    }

    public Clientes buscar(int posicao) {
        return this.clientes.get(posicao);
    }

    public int quantidade() {
        return this.clientes.size();
    }

    @Override
    public String toString() {
        return "Clientes cadastrados: " + this.clientes;
    }
}
