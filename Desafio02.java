package base;

import java.util.Scanner;

public class Desafio02 {
    
	public static void main(String[] args) {

		Scanner leTeclado = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");

		double N = leTeclado.nextDouble();

		sequencia(N);

	}
	/**
	 * 
	 * @param N define o nuúmero que será calculado na sequência.
	 */
	private static void sequencia(double N) {

		double A = 0;

		for (int x = 0; x <= N; x++) {
			A = (A + (N - x) / (x + 1));
		}
		System.out.println("A = " + A);
	}

}
