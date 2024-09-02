package appjava1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        int soma = 0;
        while (true) {
            System.out.print("Informe um valor (para encerrar digite um nº negativo): ");
            valor = entrada.nextInt();

            if (valor < 0){
                break;
            }
            soma += valor;
        }
        System.out.println("A soma dos valores é: "+ soma);
        entrada.close();
        
}
}