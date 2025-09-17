package Ex04;

/*
* Escreva um programa que calcule a média geométrica entre três números informados pelo usuário
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double multiplicacaoEntreNumeros;
        double mediaGeometrica;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextDouble();

        multiplicacaoEntreNumeros = num1 * num2 * num3;
        mediaGeometrica = Math.cbrt(multiplicacaoEntreNumeros);

        System.out.printf("MÉDIA GEOMÉTRICA = %.2f", mediaGeometrica);

        sc.close();
    }
}
