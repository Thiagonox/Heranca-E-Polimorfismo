package test.exercicio04;

import domain.exercicio01.Animal;
import domain.exercicio04.Zoologico;

public class ZoologicoTeste {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(new Leao("Leão"));
        zoologico.adicionarAnimal(new Tigre("Tigre"));
        zoologico.adicionarAnimal(new Onca("Onça"));
        zoologico.adicionarAnimal(new Guepardo("Guepardo"));
        zoologico.adicionarAnimal(new Lobo("Lobo"));
        zoologico.adicionarAnimal(new Raposa("Raposa"));
        zoologico.adicionarAnimal(new Urso("Urso"));
        zoologico.adicionarAnimal(new Hiena("Hiena"));
        zoologico.adicionarAnimal(new Crocodilo("Crocodilo"));
        zoologico.adicionarAnimal(new Jacare("Jacaré"));

        for (Animal animal : zoologico.jaulas) {
            if (animal != null) {
                System.out.println("Nome: " + animal.getNome());
                animal.emitirSom();
                if (animal instanceof Leao) {
                    ((Leao) animal).correr();
                } else if (animal instanceof Tigre) {
                    ((Tigre) animal).correr();
                } else if (animal instanceof Onca) {
                    ((Onca) animal).correr();
                } else if (animal instanceof Guepardo) {
                    ((Guepardo) animal).correr();
                } else if (animal instanceof Lobo) {
                    ((Lobo) animal).correr();
                } else if (animal instanceof Raposa) {
                    ((Raposa) animal).correr();
                } else if (animal instanceof Urso) {
                    ((Urso) animal).correr();
                } else if (animal instanceof Hiena) {
                    ((Hiena) animal).correr();
                } else if (animal instanceof Crocodilo) {
                    ((Crocodilo) animal).correr();
                } else if (animal instanceof Jacare) {
                    ((Jacare) animal).correr();
                }
                System.out.println("--------------------------");
            }
        }
    }

    static class Leao extends Animal {
        public Leao(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Leão correndo...");
        }
    }

    static class Tigre extends Animal {
        public Tigre(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Tigre correndo...");
        }
    }

    static class Onca extends Animal {
        public Onca(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Onça correndo...");
        }
    }

    static class Guepardo extends Animal {
        public Guepardo(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Guepardo correndo...");
        }
    }

    static class Lobo extends Animal {
        public Lobo(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Uivo");
        }

        public void correr() {
            System.out.println("Lobo correndo...");
        }
    }

    static class Raposa extends Animal {
        public Raposa(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Latido");
        }

        public void correr() {
            System.out.println("Raposa correndo...");
        }
    }

    static class Urso extends Animal {
        public Urso(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Urso correndo...");
        }
    }

    static class Hiena extends Animal {
        public Hiena(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Risada");
        }

        public void correr() {
            System.out.println("Hiena correndo...");
        }
    }

    static class Crocodilo extends Animal {
        public Crocodilo(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Crocodilo correndo...");
        }
    }

    static class Jacare extends Animal {
        public Jacare(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("Rugido");
        }

        public void correr() {
            System.out.println("Jacaré correndo...");
        }
    }
}