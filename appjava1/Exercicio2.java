package appjava1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int maiorvalor = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            valor = entrada.nextInt();

            if (valor > maiorvalor) {
                maiorvalor = valor;
            }
        }
        System.out.println("O maior nº é: " + maiorvalor);
    }

}
