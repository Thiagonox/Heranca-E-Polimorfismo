package test.exercicio09;

import domain.exercicio08.Gerente;
import domain.exercicio08.Supervisor;
import domain.exercicio08.Vendedor;
import domain.exercicio09.Funcionario;

public class ComissaoTeste {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", 1, new Gerente());
        Funcionario funcionario2 = new Funcionario("Maria", 2, new Supervisor());
        Funcionario funcionario3 = new Funcionario("Pedro", 3, new Vendedor());

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
    }
}
