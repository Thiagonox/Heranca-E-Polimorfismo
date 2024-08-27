package domain.exercicio09;

import domain.exercicio08.Comissao;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.00;
    private final Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public double calcularRenda() {
        return rendaBasica + comissao.calcularComissao();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: " + comissao.calcularComissao() + ", Salário Total: " + calcularRenda();
    }
}
