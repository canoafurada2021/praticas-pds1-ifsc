package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Exercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldNota1;
	private JTextField textFieldNota2;
	private JTextField textFieldNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio6 frame = new Exercicio6();
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
	public Exercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome do aluno");
		lblNome.setBounds(28, 41, 71, 39);
		contentPane.add(lblNome);

		JLabel lblCalculaMedia = new JLabel("Calculadora de média");
		lblCalculaMedia.setBounds(162, 10, 160, 19);
		lblCalculaMedia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(lblCalculaMedia);

		JLabel lblNota1 = new JLabel("Nota 1: ");
		lblNota1.setBounds(28, 91, 46, 14);
		contentPane.add(lblNota1);

		JLabel lblNota2 = new JLabel("Nota 2: ");
		lblNota2.setBounds(28, 130, 46, 14);
		contentPane.add(lblNota2);

		JLabel lblNota3 = new JLabel("Nota 3: ");
		lblNota3.setBounds(28, 169, 46, 14);
		contentPane.add(lblNota3);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(124, 50, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		textFieldNota1 = new JTextField();
		textFieldNota1.setBounds(124, 88, 86, 20);
		contentPane.add(textFieldNota1);
		textFieldNota1.setColumns(10);

		textFieldNota2 = new JTextField();
		textFieldNota2.setBounds(124, 127, 86, 20);
		contentPane.add(textFieldNota2);
		textFieldNota2.setColumns(10);

		textFieldNota3 = new JTextField();
		textFieldNota3.setBounds(124, 166, 86, 20);
		contentPane.add(textFieldNota3);
		textFieldNota3.setColumns(10);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(279, 93, 102, 36);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double nota1 = Double.parseDouble(textFieldNota1.getText());
				Double nota2 = Double.parseDouble(textFieldNota2.getText());
				Double nota3 = Double.parseDouble(textFieldNota3.getText());
				String nome = textFieldNome.getText();


				JOptionPane.showMessageDialog(null, "ESTUDANTE: " + nome);
				 calculaMedia(nota1, nota2, nota3);

			}

		});

		contentPane.add(btnCalcular);
	}

	public static void calculaMedia(Double nota1, Double nota2, Double nota3) {
		Double media = (nota1 + nota2 + nota3) / 3;

		JOptionPane.showMessageDialog(null, "Média final do aluno(a): " + media);
	}
}
