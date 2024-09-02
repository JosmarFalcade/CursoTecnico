package jair;

/**  Criar um algorimo para receber as notas de 5 alunos de 4 bimestres,
 * e a frequencia do alunoe apresentar o resultado final considerando média 
 * >= 7 e frequencia >= 75% **/
import java.util.Scanner;

public class NotasEscolaresVM {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String alunos[][]= new String[5][2];
        float notas [][] = new float[5][6];
    
        System.out.println(" .: Notas Escolares :.");
        for (int i = 0; i < 5; i++){
            System.out.print("Informe o "+ (i+1)+ "° aluno: ");
            alunos[i][0] = ler.next();
            for(int j= 0;j < 4; j++){
                System.out.print("Digite a "+ (j+1)+"° nota: ");
                notas[i][j]= ler.nextFloat();
                notas[i][5]+= notas[i][j];//Acumula/ soma 4 notas
            }// fim notas
            notas[i][5] = notas[i][5]/4; // calulo de media das notas
            System.out.println("Informe a frequencia do aluno - " + alunos[i][0] +":" );
            notas[i][4]=ler.nextFloat();
            if (notas[i][4]< 75) {
                alunos[i][1] ="Rep. falta";
            }else if (notas[i][5] < 7) {
                alunos[i][1] ="Rep. notas";
            }else{
                alunos[i][1] = " :) Aprovado (: ";
            }
            System.out.println(" ---------");
        } // Fim do for
        System.out.println("-- Resultados --");
        for( int i= 0; i < 5; i++){
            System.out.println("O auluno -" + alunos[1][0] + "\n Média de -"+ notas[i][5]+ "\nResultado -" + alunos[i][1]+"."); 
        }
        System.out.println(".:Sistema de notas Encerrado:.")
        System.out.println("Alterado no VS online")
    }
}