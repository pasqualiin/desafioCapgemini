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
public class DesafioProgramacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variável que recebe a opção do menu
        int opcao = 0;
        
        //construtores
        Questao01 q1 = new Questao01();
        Questao02 q2 = new Questao02();
        Questao03 q3 = new Questao03();

        //Repetição do menu
        while (opcao != 4) {

            Scanner entrada = new Scanner(System.in);
            System.out.print("Questão 01 - Algoritmo Escada \nQuestão 02 - Algoritmo Senha \nQuestão 03 - Anagrama \n 04 - Sair \nInforme o Número da Questão: ");
            opcao = entrada.nextInt();

            //menu com as opções para executar o algoritmo de cada questão
            switch (opcao) {
                case 1:
                    System.out.println("Questão 01 - Algoritmo Escada");
                    q1.Escada();
                    break;

                case 2:
                    System.out.println("Questão 02 - Algoritmo Senha");
                    q2.VerificaSenha();
                    break;

                case 3:
                    System.out.println("Questão 03 - Anagrama");
                    q3.Anagrama();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Escolha uma Opção Válida");
            }
        }
    }

}
