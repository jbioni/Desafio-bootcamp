package base;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		String texto;
		texto = pegaTexto();
		
		qtdPalavras(texto);

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
	 * 
	 * @param texto variável que receberá o texto digitado pelo usuário
	 * Chamei o método trim() que remove o espaço em branco no ínicio e no final da string. 
	 * Após isso, chamei o método split() que retorna um array da String
	 * separando as palavras por espaço e depois conta a qtd de frases do texto
	 * usando uma dada expressão, nessa caso o (" "). 
	 */
	public static void qtdPalavras(String texto) {

		System.out.println("TOTAL DE PALAVRAS = " + texto.trim().split(" ").length);

	}

}
