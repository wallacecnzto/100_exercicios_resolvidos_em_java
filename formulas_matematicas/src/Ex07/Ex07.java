package Ex07;

/*
* Escreva um programa que calcule a área de um círculo a partir do raio, utilizando a fórmula A = πr²
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double areaDoCirculo;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        areaDoCirculo = Math.PI * (Math.pow(raio, 2.0));

        System.out.printf("ÁREA DO CÍRCULO = %.2f", areaDoCirculo);

        sc.close();

    }
}
