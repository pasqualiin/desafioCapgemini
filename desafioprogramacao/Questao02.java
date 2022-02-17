/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioprogramacao;

import java.util.Scanner;

public class Questao02 {

    public void VerificaSenha() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a senha: ");
        String senha = entrada.nextLine();

        if (senha.length() < 6) {
            System.out.println("Sua senha tem apenas " + senha.length() + " caracteres. Acrescente mais " + (6 - senha.length()) + " caracteres para torná-la segura!");
        }
    }
}
