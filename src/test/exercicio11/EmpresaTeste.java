package test.exercicio11;

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
        funcionarios[0] = new FuncionarioEnsinoBasico("João", "001", new Gerente());
        funcionarios[1] = new FuncionarioEnsinoBasico("Maria", "002", new Vendedor());
        funcionarios[2] = new FuncionarioEnsinoMedio("Pedro", "003", new Supervisor());
        funcionarios[3] = new FuncionarioEnsinoMedio("Ana", "004", new Vendedor());
        funcionarios[4] = new FuncionarioEnsinoMedio("Carlos", "005", new Vendedor());
        funcionarios[5] = new FuncionarioEnsinoSuperior("Lucas", "006", new Vendedor());
        funcionarios[6] = new FuncionarioEnsinoBasico("Clara", "007", new Vendedor());
        funcionarios[7] = new FuncionarioEnsinoMedio("Felipe", "008", new Vendedor());
        funcionarios[8] = new FuncionarioEnsinoMedio("Sofia", "009", new Supervisor());
        funcionarios[9] = new FuncionarioEnsinoSuperior("Julia", "010", new Gerente());

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}