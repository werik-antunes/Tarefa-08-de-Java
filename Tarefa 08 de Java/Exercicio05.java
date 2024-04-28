package tarefa08;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * 5) Apresentar os resultados das potências de 3, variando do expoente 0 até o
		 * expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e
		 * elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado
		 * o operador de exponenciação do portuguol (^).
		 * 
		 */
		System.out.println("Potências de 3:");
		for (int expoente = 0; expoente <= 15; expoente++) {
			long resultado = calcular(expoente);
			System.out.println("3^" + expoente + " = " + resultado);
		}
	}

	public static long calcular(int expoente) {
		if (expoente == 0) {
			return 1; 
		}

		long resultado = 3;
		for (int i = 1; i < expoente; i++) {
			resultado *= 3;
		}

		return resultado;
	}

}
