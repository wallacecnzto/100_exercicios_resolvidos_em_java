package Ex06;

/*
* Crie um programa que calcule e exiba o perímetro de um círculo, solicitando o raio ao usuário.
* P = 2 * Pi * r
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double perimetro;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        perimetro = 2 * Math.PI * raio;

        System.out.printf("PERÍMETRO DO CÍRCULO = %.2f", perimetro);

        sc.close();
    }
}
