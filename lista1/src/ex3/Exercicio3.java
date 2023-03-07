package ex3;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		String notaUm = JOptionPane.showInputDialog("Digite a primeira nota");
		String notaDois = JOptionPane.showInputDialog("Digite a segunda nota");
		String notaTres = JOptionPane.showInputDialog("Digite a terceira nota");

		Double nota1 = 0.0;
		Double nota2 = 0.0;
		Double nota3 = 0.0;

		nota1 = Double.valueOf(notaUm);

		nota2 = Double.valueOf(notaDois);

		nota3 = Double.valueOf(notaTres);

		calculaMedia(nota1, nota2, nota3);

	}

	public static void calculaMedia(Double nota1, Double nota2, Double nota3) {
		Double mediaFinal = (nota1 + nota2 + nota3) / 3;

		if (mediaFinal >= 6) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado, média: " + mediaFinal);
		}

		if (mediaFinal >= 4 && mediaFinal < 6) {
			JOptionPane.showMessageDialog(null, "Aluno de recuperação, média: " + mediaFinal);
		}

		if (mediaFinal < 4) {
			JOptionPane.showMessageDialog(null, "Aluno reprovado,média: " + mediaFinal);
		}
	}

}
