package domain.exercicio01;

public class Cachorro extends Animal {
    public Cachorro(String nome, short idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void correr() {
        System.out.println("Cachorro correndo...");
    }
}
