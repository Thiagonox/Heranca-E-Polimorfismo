package test.exercicio02;

import domain.exercicio01.Animal;
import domain.exercicio01.Cachorro;
import domain.exercicio01.Cavalo;
import domain.exercicio01.Preguica;

public class EmitirSom {
    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo("Pé de Pano", (short) 10);
        Cachorro cachorro = new Cachorro("Rex", (short) 5);
        Preguica preguica = new Preguica("Sid", (short) 15);

        emitirSomAnimal(cachorro);
        emitirSomAnimal(cavalo);
        emitirSomAnimal(preguica);
    }

    public static void emitirSomAnimal(Animal animal) {
        animal.emitirSom();
    }
}
