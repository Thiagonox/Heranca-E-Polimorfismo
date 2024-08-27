package domain.exercicio06;

import domain.exercicio08.Comissao;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
    private String universidade;
    private Comissao comissao;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public FuncionarioEnsinoSuperior(String nome, String matricula, Comissao comissao) {
        super(nome, matricula, comissao);
        this.comissao = comissao;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2;
    }
}
