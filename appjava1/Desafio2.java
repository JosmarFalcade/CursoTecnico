package appjava1;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o ano: ");
        entrada.nextInt();

        int bissexto = entrada;

        if (bissexto == 0){
            System.out.println("É ano bissexto!");
        }else{
            System.out.println("Não é ano bissexto!");
        }
        entrada.close();
    }

}
