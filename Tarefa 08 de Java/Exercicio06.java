package tarefa08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6) Elaborar um programa que apresente como resultado o valor de uma potência
		 * de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B
		 * é o valor da base e E o valor do expoente. Observe que neste exercício não
		 * pode ser utilizado o operador de exponenciação do portuguol (^).
		 */

		Scanner sc = new Scanner(System.in);

	
		System.out.print("Digite o valor da base: ");
		double base = sc.nextDouble();

		System.out.print("Digite o valor do expoente: ");
		int expoente = sc.nextInt();

		double resultado = calcularPotencia(base, expoente);

		System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

		sc.close();
	}

	public static double calcularPotencia(double base, int expoente) {
		double resultado = 1.0;

		if (expoente == 0) {
			return 1.0; 
		} else if (expoente > 0) {
			for (int i = 0; i < expoente; i++) {
				resultado *= base;
			}
		} else {
	
			base = 1 / base;
			expoente = -expoente;
			for (int i = 0; i < expoente; i++) {
				resultado *= base;
			}
		}

		return resultado;

	}

}
