package domain.exercicio06;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double rendaBasica = 1000.00;

    public Funcionario(String nome, String codigoFunciona) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularRenda() {
        return rendaBasica;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public String toString() {
        return "Nome: " + nome + ", Salário Total: " + calcularRenda();
    }
}

