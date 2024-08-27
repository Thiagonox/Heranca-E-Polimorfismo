package test.exercicio01;

import domain.exercicio01.Cavalo;

public class CavaloTeste {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("Pé de Pano", (short) 10);
        System.out.println("Nome: " + cavalo.getNome());
        System.out.println("Idade: " + cavalo.getIdade());
        cavalo.emitirSom();
        cavalo.correr();
    }
}
