package appjava1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int ContDiv = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");

        int numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {
            if (numero % i == 0) {
                ContDiv ++;
            }
        }
        switch (ContDiv) {
            case 1:
                System.out.println("Numero Especial!");
                break;
            case 2:
                System.out.println("É primo!");
                break;

            default:
                System.out.println("Não é primo!");
                break;
        }
    }
}
