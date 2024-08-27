package test.exercicio01;

import domain.exercicio01.Cachorro;

public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", (short) 5);
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
        cachorro.emitirSom();
        cachorro.correr();
    }
}
