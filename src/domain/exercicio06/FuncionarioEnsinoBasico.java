package domain.exercicio06;

import domain.exercicio08.Comissao;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;
    private Comissao comissao;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    public FuncionarioEnsinoBasico(String nome, String matricula, Comissao comissao) {
        super(nome, matricula);
        this.comissao = comissao;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.1;
    }
}