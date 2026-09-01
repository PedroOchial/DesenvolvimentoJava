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

    public Clientes pesquisar(String id) {
        for (int i = 0; i < this.clientes.size(); i++) {
            Clientes c = this.clientes.get(i);
            if (c.getID().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public int quantidade() {
        return this.clientes.size();
    }

    @Override
    public String toString() {
        return "Clientes cadastrados: " + this.clientes;
    }
}
