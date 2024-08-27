package domain.exercicio01;

public abstract class Animal {
    private String nome;
    private short idade;

    public Animal(String nome, short idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();
}
