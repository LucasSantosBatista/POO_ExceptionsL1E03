/**
 * 
 */
package view;

import controller.OperacaoController;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {
		OperacaoController opCtrl = new OperacaoController();

		try {
			int resultadoPar = opCtrl.operacaoValor(4);
			System.out.println("Resultado para número par (quadrado): " + resultadoPar);

			int resultadoImpar = opCtrl.operacaoValor(3);
			System.out.println("Resultado para número ímpar (cubo): " + resultadoImpar);

			int resultadoNegativo = opCtrl.operacaoValor(-5);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}