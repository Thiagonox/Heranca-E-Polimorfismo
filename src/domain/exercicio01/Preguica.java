package domain.exercicio01;

public class Preguica extends Animal {
    public Preguica(String nome, short idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Zzzz");
    }

    public void subirArvore() {
        System.out.println("Preguiça subindo na árvore...");
    }
}
