package Ex08;

/*
* Escreva um programa que calcule o delta de uma equação de segundo grau (Δ = b² - 4ac).
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double delta;
        double a;
        double b;
        double c;

        System.out.println("Digite o valor de A, B e C: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) - (4 * a * c);

        System.out.printf("DELTA = %.2f", delta);

        sc.close();
    }
}
