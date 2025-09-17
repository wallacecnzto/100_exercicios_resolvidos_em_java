package Ex09;

/*
* Escreva um programa que calcule o perímetro e a área de um retângulo, utilizando as fórmulas P = 2(l + c) e A = lc,
* onde l é a largura e c é o comprimento
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura;
        double comprimento;
        double perimetro;
        double area;

        System.out.println("Digite a largura e comprimento do retângulo: ");
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();

        perimetro = 2 * (largura + comprimento);
        area = largura * comprimento;

        System.out.printf("PERÍMETRO = %.2f\n", perimetro);
        System.out.printf("ÁREA = %.2f", area);

        sc.close();
    }
}
