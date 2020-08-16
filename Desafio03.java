package base;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		String texto;
		texto = pegaTexto();
		int resultado;
		resultado = pegaApenasA(texto);
		System.out.println("O resultado é: " + resultado);

	}
    /**
     * 
     * @return retorna o texto que será usado para etrair a qtd de letras 'a'.
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
     * @param texto onde será procurando a qtd de letras 'a'.
     * @return retorna o total de letras 'a' contidos no texto digitado pelo usuário.
     * charAt() retorna o caracter no índice especificado.
     * valueOf() retorna a representação de texto do char, se for um 'a'. 
     */
	private static int pegaApenasA(String texto) {
		int totalA = 0;

		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);

			if (String.valueOf(letra).equalsIgnoreCase("a")) {
				totalA += 1;

			}
		}

		return totalA;

	}

}
