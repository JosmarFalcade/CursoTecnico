package appjava1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a Código: ");
        int fruta = entrada.nextInt();

        if (fruta >= 10 && fruta <= 100) {
            switch (fruta) {
                case 10:
                    System.out.println("Laranja!");
                    break;
                case 20:
                    System.out.println("Maçã!");
                    break;
                case 30:
                    System.out.println("Banana!");
                    break;
                case 40:
                    System.out.println("Uva!");
                    break;
                case 50:
                    System.out.println("Ameixa!");
                    break;
                default:
                    System.out.println("Codigo errado");
                    break;
            }
        } else {
            System.out.println("O código informado está fora do limite. ");
        }
        entrada.close();
    }

}
