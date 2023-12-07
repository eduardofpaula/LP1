package trycatchLP1;

import java.util.Scanner;

public class tryCatchLP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("TABUADA");

            System.out.print("Digite o primeiro numero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo numero: ");
            int numero2 = scanner.nextInt();

            int result = numero1 * numero2;

            System.out.print("Qual o resultado da multiplicação entre " + numero1 + " e " + numero2 + " ?:");
            int result2 = scanner.nextInt();

            // Verifica se a resposta do usuário está correta
            if (result2 == result) {
                System.out.println("Você Acertou!");
            } else {
                System.out.println("Você Errou");
            }
        } catch (Exception e) {
            // Captura exceções caso ocorram durante a entrada do usuário
            System.out.println("Ocorreu um erro durante a entrada de dados");
        } finally {
            // Fecha o Scanner no bloco finally para evitar vazamento de recursos
            scanner.close();
        }
    }
}