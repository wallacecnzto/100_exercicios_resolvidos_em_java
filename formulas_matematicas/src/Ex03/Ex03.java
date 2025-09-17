package Ex03;

/*
* Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário.
* */

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double mediaAritmetica;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        System.out.printf("MÉDIA ARITMÉTICA = %.2f", mediaAritmetica);

        sc.close();
    }
}
