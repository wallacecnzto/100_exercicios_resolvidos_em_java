package Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
        * Escreva um programa que calcule a média aritmética de dois números.
        * */
        double num1;
        double num2;
        double mediaAritmetica;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        mediaAritmetica = num1 / num2;

        System.out.printf("MÉDIA ARITMÉTICA: %.2f", mediaAritmetica);

        sc.close();
    }
}
