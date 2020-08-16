package base;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		int num;
		num = pegaNum();
		
		fibo(num);
	}
    
	/**
     * 
     * @return retorna o número para ser usado no finbonacci.
     */
	private static int pegaNum() {
		int num;

		Scanner leNum = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");

		num = leNum.nextInt();
				
		return num;
	}
	/**
	 * retorna o fibonacci.
	 * @param num numero que vai ser usado para o fibonacci.
	 */
	private static void fibo(int num) {
		for (int anterior = 1, posterior = 1, contador = 0; contador < num; posterior += anterior, anterior = posterior
				- anterior, contador++) {
			System.out.print(anterior + " ");
		}

	}
		
		
		
	}
	


