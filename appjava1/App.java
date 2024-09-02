package appjava1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double nota = 9.1;

        Scanner entrada = new Scanner(System.in);
        System.out.print ("Informe a nota: ");
        nota = entrada.nextDouble();
        double media = 7.0; 

        if (nota >= 0 && nota <= 10) {
                if (nota>= 9.1){
                    System.out.print ( "Conceito A\n");
                    System.out.print ( "Hall da Fama!");
                }
            else if (nota >= media){
                System.out.println ("Aprovado!");
            }
            else if (nota >= 3 && nota < media){
                System.out.println("Recuperação!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
        entrada.close();
    }
}
