package tarefa08;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * 12) Elaborar um programa que efetue a leitura de valores positivos inteiros
		 * até que um valor negativo seja informado. Ao final devem ser apresentados o
		 * maior e o menor valores informados pelo usuário.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		while (true) {
			System.out.print("Digite um valor positivo ou um valor negativo para sair: ");
			int valor = sc.nextInt();

			if (valor < 0) {
				break;
			}

			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
		}

		if (maior != Integer.MIN_VALUE) {
			System.out.println("Maior valor informado: " + maior);
			System.out.println("Menor valor informado: " + menor);
		} else {
			System.out.println("Nenhum valor positivo foi informado.");
		}

		sc.close();
	}

}
