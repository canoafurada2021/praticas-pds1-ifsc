package ex1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String precoStr = JOptionPane.showInputDialog("Digite o preço por litro");
		String quantidadeLitroStr = JOptionPane.showInputDialog("Digite a quantidade por litro ");
		Double precoLitro = 0.0;
		Integer quantidadeLitroInteger = 0;

		if (precoStr.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira um valor!");

		} else {
			precoLitro = Double.valueOf(precoStr);
		}

		if (quantidadeLitroStr.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira um valor!");

		} else {
			quantidadeLitroInteger = Integer.valueOf(quantidadeLitroStr);

		}

		totalPagamento(precoLitro, quantidadeLitroInteger);
	}

	public static void totalPagamento(Double precoLitro, Integer quantidadeLitro) {

		double calc = precoLitro * quantidadeLitro;

		JOptionPane.showMessageDialog(null, "Valor total do pagamento" + calc);

	}

}
