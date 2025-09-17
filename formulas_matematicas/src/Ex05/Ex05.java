package Ex05;

/*
* Escreva um programa que calcule o IMC de um indivíduo, utilizando a fórmula IMC = peso / altura²
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite sua atura: ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2.0);

        System.out.printf("IMC = %.2f", imc);

        sc.close();
    }
}
