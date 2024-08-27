package domain.exercicio05;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }
}