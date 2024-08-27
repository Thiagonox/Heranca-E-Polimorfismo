package test.exercicio07;

import domain.exercicio06.Funcionario;
import domain.exercicio06.FuncionarioEnsinoBasico;
import domain.exercicio06.FuncionarioEnsinoMedio;
import domain.exercicio06.FuncionarioEnsinoSuperior;

public class EmpresaTeste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new FuncionarioEnsinoBasico("João", "001", "Escola ABC");
        funcionarios[1] = new FuncionarioEnsinoBasico("Maria", "001", "Escola XYZ");
        funcionarios[2] = new FuncionarioEnsinoBasico("José", "001", "Escola ABC");
        funcionarios[3] = new FuncionarioEnsinoMedio("Ana", "002", "Escola XYZ", "Colégio GHI");
        funcionarios[4] = new FuncionarioEnsinoMedio("Carlos", "002", "Escola ABC", "Colégio JKL");
        funcionarios[5] = new FuncionarioEnsinoSuperior("Lucas", "003", "Escola XYZ", "Colégio MNO", "Universidade PQR");
        funcionarios[6] = new FuncionarioEnsinoBasico("Clara", "001", "Escola ABC");
        funcionarios[7] = new FuncionarioEnsinoMedio("Felipe", "002", "Escola XYZ", "Colégio STU");
        funcionarios[8] = new FuncionarioEnsinoMedio("Sofia", "002", "Escola ABC", "Colégio VWX");
        funcionarios[9] = new FuncionarioEnsinoSuperior("Julia", "003", "Escola XYZ", "Colégio YZ", "Universidade ABC");

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRenda();
            custoTotal += renda;
            if (funcionario instanceof FuncionarioEnsinoBasico && !(funcionario instanceof FuncionarioEnsinoMedio)) {
                custoEnsinoBasico += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio && !(funcionario instanceof FuncionarioEnsinoSuperior)) {
                custoEnsinoMedio += renda;
            } else if (funcionario instanceof FuncionarioEnsinoSuperior) {
                custoGraduacao += renda;
            }
        }

        System.out.println("Custo total: " + custoTotal);
        System.out.println("Custo com funcionários de ensino básico: " + custoEnsinoBasico);
        System.out.println("Custo com funcionários de ensino médio: " + custoEnsinoMedio);
        System.out.println("Custo com funcionários graduados: " + custoGraduacao);
    }
}
