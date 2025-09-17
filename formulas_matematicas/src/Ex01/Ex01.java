package Ex01;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
        * Escreva um programa que solicite ao usuário dois números e exiba a soma, subtração, multiplicação e divisão
        * entre eles.
        * */
        double num1;
        double num2;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("SUBTRAÇÃO = %.2f\n", subtracao);
        System.out.printf("MULTIPLICAÇÃO = %.2f\n", multiplicacao);
        System.out.printf("DIVISÃO = %.2f", divisao);

        sc.close();
    }
}
