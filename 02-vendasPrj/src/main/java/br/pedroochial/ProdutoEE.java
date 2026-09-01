package br.pedroochial;

import java.time.LocalDate;

public class ProdutoEE extends Produto {

    private int diasGarantia;

    public ProdutoEE(int codigo, String nome, double preco, int diasGarantia) {
        super(codigo, nome, preco);
        this.diasGarantia = diasGarantia;
    }

    public int getDiasGarantia() {
        return this.diasGarantia;
    }

    public String getGarantia() {
        LocalDate hoje = LocalDate.now();
        LocalDate vencimento = hoje.plusDays(this.diasGarantia);
        return this.getNome() + " - Garantia: " + this.diasGarantia +
                " dias - Data atual: " + hoje + " - Vencimento: " + vencimento;
    }

    @Override
    public String toString() {
        return "nome" + this.getNome() +
                "codigo" + this.getCodigo() +
                "preco" + this.getPreco() +
                "Dias de garantia" + this.diasGarantia;
    }
}
