package test.exercicio01;

import domain.exercicio01.Preguica;

public class PreguicaTeste {
    public static void main(String[] args) {
        Preguica preguica = new Preguica("Sid", (short) 15);
        System.out.println("Nome: " + preguica.getNome());
        System.out.println("Idade: " + preguica.getIdade());
        preguica.emitirSom();
        preguica.subirArvore();
    }
}
