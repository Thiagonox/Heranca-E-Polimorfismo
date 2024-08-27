package domain.exercicio03;

import domain.exercicio01.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando: " + animal.getNome());
        animal.emitirSom();
    }
}
