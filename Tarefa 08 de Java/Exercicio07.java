package tarefa08;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7) Escreva um programa que apresente a série de Fibonacci até o décimo quinto
		 * termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13,
		 * 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o
		 * seu anterior subseqüente, para que seja formado o próximo valor da seqüência.
		 * Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é
		 * 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
		 * 
		 */

		int limite = 15; 
		
		System.out.println("Série de Fibonacci até o décimo quinto termo:");
		int anterior = 1;
		int atual = 1;
		System.out.print(anterior + ", " + atual);

		for (int i = 3; i <= limite; i++) {
			int proximo = anterior + atual;
			System.out.print(", " + proximo);
			anterior = atual;
			atual = proximo;
		}
	}

}
