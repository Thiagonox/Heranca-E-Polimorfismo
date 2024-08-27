package test.exercicio10;

import domain.exercicio06.Funcionario;
import domain.exercicio06.FuncionarioEnsinoBasico;
import domain.exercicio06.FuncionarioEnsinoMedio;
import domain.exercicio06.FuncionarioEnsinoSuperior;
import domain.exercicio08.Gerente;
import domain.exercicio08.Supervisor;
import domain.exercicio08.Vendedor;

public class EmpresaTeste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new FuncionarioEnsinoBasico("João", "001", new Vendedor());
        funcionarios[1] = new FuncionarioEnsinoBasico("Maria", "002", new Vendedor());
        funcionarios[2] = new FuncionarioEnsinoMedio("Pedro", "003", new Supervisor());
        funcionarios[3] = new FuncionarioEnsinoMedio("Ana", "004", new Vendedor());
        funcionarios[4] = new FuncionarioEnsinoMedio("Carlos", "005", new Vendedor());
        funcionarios[5] = new FuncionarioEnsinoSuperior("Lucas", "006", new Vendedor());
        funcionarios[6] = new FuncionarioEnsinoBasico("Clara", "007", new Vendedor());
        funcionarios[7] = new FuncionarioEnsinoMedio("Felipe", "008", new Vendedor());
        funcionarios[8] = new FuncionarioEnsinoMedio("Sofia", "009", new Supervisor());
        funcionarios[9] = new FuncionarioEnsinoSuperior("Julia", "010", new Gerente());

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
