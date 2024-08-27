package test.exercicio06;

import domain.exercicio06.Funcionario;
import domain.exercicio06.FuncionarioEnsinoBasico;
import domain.exercicio06.FuncionarioEnsinoMedio;
import domain.exercicio06.FuncionarioEnsinoSuperior;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "123");
        FuncionarioEnsinoBasico funcionarioBasico = new FuncionarioEnsinoBasico("João", "123", "Escola Municipal Maria José");
        FuncionarioEnsinoMedio funcionarioMedio = new FuncionarioEnsinoMedio("Maria", "456", "Escola Municipal Maria José", "Escola Estadual Maria José");
        FuncionarioEnsinoSuperior funcionarioSuperior = new FuncionarioEnsinoSuperior("José", "789", "Escola Básica", "Escola Média", "Universidade");

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Código Funcional: " + funcionario.getCodigoFuncional());
        System.out.println("Renda: " + funcionario.calcularRenda());
        System.out.println("--------------------------");

        System.out.println("Nome: " + funcionarioBasico.getNome());
        System.out.println("Código Funcional: " + funcionarioBasico.getCodigoFuncional());
        System.out.println("Renda: " + funcionarioBasico.calcularRenda());
        System.out.println("--------------------------");

        System.out.println("Nome: " + funcionarioMedio.getNome());
        System.out.println("Código Funcional: " + funcionarioMedio.getCodigoFuncional());
        System.out.println("Renda: " + funcionarioMedio.calcularRenda());
        System.out.println("--------------------------");

        System.out.println("Nome: " + funcionarioSuperior.getNome());
        System.out.println("Código Funcional: " + funcionarioSuperior.getCodigoFuncional());
        System.out.println("Renda: " + funcionarioSuperior.calcularRenda());
        System.out.println("--------------------------");
    }
}
