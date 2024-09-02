package appjava1;

import java.util.Scanner;

public class NotasEscolares {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        // vetor float de 5 posições
        float notas[] = new float[5];
        String aluno, resultado;

        System.out.println("Notas Escolares:");
        System.out.print("Informe o nome do aluno: ");
        aluno = ler.nextLine();
        aluno = aluno.toUpperCase();

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a " + (i + 1) + "º nota:");
            notas[i] = ler.nextFloat();
            notas[4] += notas[i];

        }
        notas[4] = notas[4] / 4; // calcula a média

        if (notas[4] >= 7) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        System.out.println("O aluno "+aluno+" teve a média "+notas[4]+" e foi " +resultado+ ".");
        ler.close();
    }
    System.out.println(".:Sistema de notas Encerrado:.")
    System.out.println("Alterado no VS online")
    System.out.println("Teste de push")

}
