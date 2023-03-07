package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNumero2;
	private JTextField textNumero1;
	private JLabel lblNumeroDois;
	private JButton btnDivisao;
	private JButton btnMultiplicacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNumero1 = new JTextField();
		textNumero1.setBounds(251, 11, 86, 20);
		contentPane.add(textNumero1);
		textNumero1.setColumns(10);

		textFieldNumero2 = new JTextField();
		textFieldNumero2.setBounds(251, 57, 86, 20);

		contentPane.add(textFieldNumero2);
		System.out.println(textFieldNumero2);
		textFieldNumero2.setColumns(10);

		JLabel lblNumeroUm = new JLabel("Primeiro número");
		lblNumeroUm.setBounds(35, 14, 141, 14);
		contentPane.add(lblNumeroUm);

		lblNumeroDois = new JLabel("Segundo número");
		lblNumeroDois.setBounds(33, 60, 161, 14);
		contentPane.add(lblNumeroDois);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double numero1 = Double.parseDouble(textNumero1.getText());
				Double numero2 = Double.parseDouble(textFieldNumero2.getText());

				Double soma = (numero1 + numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + soma);

			}
		});
		btnSoma.setBounds(48, 133, 89, 23);
		contentPane.add(btnSoma);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero1 = Double.parseDouble(textNumero1.getText());
				Double numero2 = Double.parseDouble(textFieldNumero2.getText());

				Double subtracao = (numero1 - numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + subtracao);

			}

		});

		btnSubtracao.setBounds(48, 209, 89, 23);
		contentPane.add(btnSubtracao);

		btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero1 = Double.parseDouble(textNumero1.getText());
				Double numero2 = Double.parseDouble(textFieldNumero2.getText());

				Double divisao = (numero1 / numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + divisao);

			}
		});
		btnDivisao.setBounds(251, 133, 89, 23);
		contentPane.add(btnDivisao);

		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numero1 = Double.parseDouble(textNumero1.getText());
				Double numero2 = Double.parseDouble(textFieldNumero2.getText());

				Double multiplicacao = (numero1 * numero2);

				JOptionPane.showMessageDialog(null, "Valor: " + multiplicacao);

			
			}
		});
		btnMultiplicacao.setBounds(251, 209, 89, 23);
		contentPane.add(btnMultiplicacao);
	}
}
