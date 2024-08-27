package test.exercicio03;

import domain.exercicio01.Cachorro;
import domain.exercicio01.Cavalo;
import domain.exercicio01.Preguica;
import domain.exercicio03.Veterinario;

public class VeterinarioTeste {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        System.out.println("--------------------------");
        veterinario.examinar(new Cachorro("Rex", (short) 5));
        System.out.println("--------------------------");
        veterinario.examinar(new Cavalo("Pé de Pano", (short) 10));
        System.out.println("--------------------------");
        veterinario.examinar(new Preguica("Sid", (short) 15));
        System.out.println("--------------------------");
    }
}
