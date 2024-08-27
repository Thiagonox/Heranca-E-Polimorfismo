package domain.exercicio04;
import domain.exercicio01.Animal;

public class Zoologico {
    public Animal[] jaulas = new Animal[10];

    public void adicionarAnimal(Animal animal) {
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] == null) {
                jaulas[i] = animal;
                break;
            }
        }
    }
}
