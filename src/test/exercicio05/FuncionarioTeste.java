package test.exercicio05;

import domain.exercicio05.FuncionarioEnsinoBasico;
import domain.exercicio05.FuncionarioEnsinoMedio;
import domain.exercicio05.FuncionarioEnsinoSuperior;
import domain.exercicio05.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        FuncionarioEnsinoBasico funcionarioBasico = new FuncionarioEnsinoBasico("João", "123", "Escola Municipal Maria José");
        FuncionarioEnsinoMedio funcionarioMedio = new FuncionarioEnsinoMedio("Maria", "456", "Escola Municipal Maria José", "Escola Estadual Maria José");
        FuncionarioEnsinoSuperior funcionarioSuperior = new FuncionarioEnsinoSuperior("José", "789", "Escola Básica", "Escola Média", "Universidade Paulista");

        System.out.println("Nome: " + funcionarioBasico.getNome());
        System.out.println("Código Funcional: " + funcionarioBasico.getCodigoFuncional());
        System.out.println("Ensino Básico: " + funcionarioBasico.getEscolaBasico());
        System.out.println("--------------------------");

        System.out.println("Nome: " + funcionarioMedio.getNome());
        System.out.println("Código Funcional: " + funcionarioMedio.getCodigoFuncional());
        System.out.println("Ensino Básico: " + funcionarioMedio.getEscolaBasico());
        System.out.println("Ensino Médio: " + funcionarioMedio.getEscolaMedio());
        System.out.println("--------------------------");

        System.out.println("Nome: " + funcionarioSuperior.getNome());
        System.out.println("Código Funcional: " + funcionarioSuperior.getCodigoFuncional());
        System.out.println("Ensino Básico: " + funcionarioSuperior.getEscolaBasico());
        System.out.println("Ensino Médio: " + funcionarioSuperior.getEscolaMedio());
        System.out.println("Ensino Superior: " + funcionarioSuperior.getUniversidade());
        System.out.println("--------------------------");
    }
}
