package base;

public class Desafio01 {

	public static void main(String[] args) {

		pagamentoDoMonge();
	}

	/**
	 * Cálculo Pagamento em grãos de Trigo num Tabuleiro com 64 casas
	 *Rainha e Monge
	 */
	public static void pagamentoDoMonge() {

		double qtd = 1;
		double somado = 1;

		for (int casa = 1; casa <= 64; casa++) {
			System.out.println("| Casa: |" + casa + " | Quantidade: |" + qtd + "  | Somado: |" + somado);
			qtd = qtd * 2;
			somado = somado + qtd;
		}
	}

}
