package appjava1;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("Sair")) {
            System.out.println("Voce escolheu:");
            valor = entrada.nextLine();
        }
        System.out.println("Voce saiu!");

        entrada.close();

    }

}