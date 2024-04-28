package tarefa08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um
		 * número qualquer.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a sua tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close();
	}

}
