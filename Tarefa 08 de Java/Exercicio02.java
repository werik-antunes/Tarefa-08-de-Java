package tarefa08;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 2) Apresentar o total da soma obtida dos cem primeiros números inteiros
		 * (1+2+3+4+...+98+99+100).
		 * 
		 */
        int total = 0;

        for (int i = 1; i <= 100; i++) {
            total += i;
        }

        System.out.println("O total da soma dos cem primeiros números inteiros é: " + total);
    
	}

}
