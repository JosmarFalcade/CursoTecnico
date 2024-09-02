import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;  // Inicializa com o menor valor possível de um inteiro

        // Recebe 10 números inteiros do usuário
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Verifica se o número atual é maior que o maior valor armazenado
            if (numero > maior) {
                maior = numero;
            }
        }

        // Imprime o maior valor
        System.out.println("O maior valor digitado foi: " + maior);

        scanner.close();
    }
}

