package domain.exercicio01;

public class Cavalo extends Animal {
    public Cavalo(String nome, short idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchar");
    }

    public void correr() {
        System.out.println("Cavalo correndo...");
    }
}
