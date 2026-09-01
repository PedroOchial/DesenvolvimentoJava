package br.pedroochial;

public class Estudante extends ClientePF {

    private String instituicao;
    private String matricula;

    public Estudante(String nome, String codigo, String cpf, String instituicao, String matricula) {
        super(nome, codigo, cpf);
        this.instituicao = instituicao;
        this.matricula = matricula;
    }

    public String getInstituicao() {
        return this.instituicao;
    }

    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return "nome" + this.getNome() +
                "cpf" + this.getCpf() +
                "codigo" + this.getCodigo() +
                "instituicao" + this.instituicao +
                "matricula" + this.matricula;
    }
}
