/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioprogramacao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Questao01 {

    public void Escada() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = numero - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
