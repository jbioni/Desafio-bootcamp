package base;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {
		String texto;
		texto = pegaTexto();

		maior(texto);

	}

	/**
	 * 
	 * @return retorna o texto que será usado para etrair a qtd de plavras.
	 */
	private static String pegaTexto() {
		String texto;

		Scanner leTexto = new Scanner(System.in);
		System.out.println("Digite um texto qualquer: ");

		texto = leTexto.nextLine();

		return texto;
	}
    /**
     * Retorna a maior palavra encontrada da frase digitada pelo
	 * usuário.
     * @param texto
     */
	public static void maior(String texto) {

		String[] palavras = texto.trim().split(" ");
		String palavraMaior = palavras[0];

		for (int i = 1; i < palavras.length; i++) {

			if (palavraMaior.length() < palavras[i].length()) {

				palavraMaior = palavras[i];
			}

		}

		System.out.println("Maior Palavra = " + palavraMaior);

	}

}
