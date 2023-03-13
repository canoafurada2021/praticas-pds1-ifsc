package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			String valorLista = JOptionPane.showInputDialog("Digite o que será adicionado a lista");

			lista.add(valorLista);

		}
		JOptionPane.showMessageDialog(null, lista);
	}

}
