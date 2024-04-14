/**
 * 
 */
package controller;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class OperacaoController {
	public int operacaoValor(int numero) throws Exception {
		if (numero < 0) {
			throw new Exception("O numero não pode ser negativo.");
		}

		if (numero % 2 == 0) {
			return numero * numero;
		} else {
			return numero * numero * numero;
		}
	}
}
