package tarefa08;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * 11) Elaborar um programa que possibilite calcular a área total de uma
		 * residência (sala, cozinha, banheiro, quartos, área de serviço, quintal,
		 * garagem, etc.). O programa deve solicitar a entrada do nome, a largura e o
		 * comprimento de um determinado cômodo. Em seguida, deve apresentar a área do
		 * cômodo lido e também uma mensagem solicitando do usuário a confirmação de
		 * continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa
		 * deve apresentar o valor total acumulado da área residencial.
		 */

		Scanner sc = new Scanner(System.in);

		double areaTotal = 0.0;
		String continuar;

		do {

			System.out.print("Digite o nome do cômodo: ");
			String nomeComodo = sc.nextLine();

			System.out.print("Digite a largura do cômodo em metros: ");
			double largura = sc.nextDouble();

			System.out.print("Digite o comprimento do cômodo em metros: ");
			double comprimento = sc.nextDouble();

			double areaComodo = largura * comprimento;
			areaTotal += areaComodo;

			System.out.println("Área do cômodo " + nomeComodo + ": " + areaComodo + " metros quadrados");

			sc.nextLine();
			System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
			continuar = sc.nextLine();
		} while (continuar.equalsIgnoreCase("SIM"));

		System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

		sc.close();
	}

}
