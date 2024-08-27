package domain.exercicio06;

import domain.exercicio08.Comissao;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;
    private Comissao comissao;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public FuncionarioEnsinoMedio(String nome, String matricula, Comissao comissao) {
        super(nome, matricula, comissao);
        this.comissao = comissao;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.5;
    }
}