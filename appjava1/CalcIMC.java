package appjava1;

import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        float altura, peso, imc;
        String resultado = null;

        Scanner ler = new Scanner(System.in);
        System.out.println("Calculadora de IMC: ");
        System.out.print("Digite a altura: ");
        altura = ler.nextFloat();
        System.out.print("Digite o peso: ");
        peso = ler.nextFloat();

        // imc = peso / (altura*altura);
        imc = calcIMC(altura, peso);
        ler.close();

        if (imc < 16) {
            resultado = "Magreza grave";
        } else if (imc < 16.9) {
            resultado = "Magreza moderada";
        } else if (imc < 18.5) {
            resultado = "Magreza leve";
        } else if (imc < 24.9) {
            resultado = "Peso ideal";
        } else if (imc < 29.9) {
            resultado = "Sobrepeso";
        } else if (imc < 34.9) {
            resultado = "Obesidade grau 1";
        } else if (imc < 39.9) {
            resultado = "Obesidade grau 2";
        } else {
            resultado = "o peso do Bruno";
        }
        System.out.println("Seu imc é: " + imc + "\nVoce está com " + resultado);
    }

    /**
     * Função calcIMC calcula o IMC de um individuo
     * Recebe os seguintes parâmetros:
     * @param altura
     * @param peso
     * @return
     */

    public static float calcIMC(float altura, float peso) {

        return (float) (peso / Math.pow(altura, 2));
    }

}
