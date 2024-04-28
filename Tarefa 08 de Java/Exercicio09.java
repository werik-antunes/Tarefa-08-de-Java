package tarefa08;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * 9) Elaborar um programa que efetue a leitura de 10 valores numéricos e
		 * apresente no final o total do somatório e a média aritmética dos valores
		 * lidos.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int total = 0;
		double media = 0.0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º valor: ");
			int valor = sc.nextInt();
			total += valor; 
		}

		media = (double) total / 10;

		System.out.println("Total do somatório: " + total);
		System.out.println("Média aritmética: " + media);

		sc.close();
	}

}
