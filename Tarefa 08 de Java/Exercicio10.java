package tarefa08;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * 10) Elaborar um programa que apresente os resultados da soma e da média
		 * aritmética dos valores pares situados na faixa numérica de 50 a 70.
		 * 
		 */

		int soma = 0;
		double media = 0.0;
		int contador = 0;

		for (int i = 50; i <= 70; i++) {
			if (i % 2 == 0) {
				soma += i;
				contador++;
			}
		}

		if (contador != 0) {
			media = (double) soma / contador;
		}

		System.out.println("Soma dos valores pares: " + soma);
		System.out.println("Média aritmética dos valores pares: " + media);
	}
}
