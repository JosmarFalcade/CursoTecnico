package appjava1;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        do{
            System.out.println("Voce quer sair?");
            System.out.println("Diga as palavras magicas: ");
            valor = entrada.nextLine();
        }while(!valor.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!");
        entrada.close();

        
    }

}
