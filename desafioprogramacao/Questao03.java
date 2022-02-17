package desafioprogramacao;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

    public void Anagrama() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a palavra: ");
        String palavra = entrada.nextLine();
        char[] p1 = palavra.toCharArray();

        int i = 0, contador = 0;
        System.out.println("             " + "i" + " - " + "c : ");

        do {
            for (i = 0; i <= p1.length - 1; i++) {
                // troca
                Troca_Posicao(p1, i, contador);
                System.out.print("TROCA:       " + i + " - " + contador + " : ");
                Mostra(p1);
                // destroca
                Troca_Posicao(p1, i, contador);
            }
            contador++;
        } while (contador <= (p1.length - 1));
    }

    private static void Troca_Posicao(char[] p1, int i, int contador) {
        char aux;
        aux = p1[contador];
        p1[contador] = p1[i];
        p1[i] = aux;
    }

    private static void Mostra(char[] p1) {
        for (int i = 0; i < p1.length; i++) {
            System.out.print(p1[i] + " ");
        }
        System.out.println("");
    }
}
