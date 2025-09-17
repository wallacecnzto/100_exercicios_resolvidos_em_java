package Ex10;

/*
* Escreva um programa que calcule o perímetro e a área de um triângulo, utilizando as fórmulas
* P = a + b + c e A = (b * h) / 2, onde a, b e c são os lados do triângulo e h é a altura relativa ao lado b.
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ladoADoTriangulo;
        double ladoBDoTriangulo;
        double ladoCDoTriangulo;
        double alturaH;
        double perimetro;
        double area;

        System.out.println("Digite os lados A, B e C e também a altura do triângulo: ");
        ladoADoTriangulo = sc.nextDouble();
        ladoBDoTriangulo = sc.nextDouble();
        ladoCDoTriangulo = sc.nextDouble();
        alturaH = sc.nextDouble();

        perimetro = ladoADoTriangulo + ladoBDoTriangulo + ladoCDoTriangulo;
        area = (ladoBDoTriangulo * alturaH) / 2;

        System.out.printf("PERÍMETRO DO TRIÂNGULO: %.2f\n", perimetro);
        System.out.printf("AREA DO TRIÂNGULO: %.2f", area);

        sc.close();

    }
}
