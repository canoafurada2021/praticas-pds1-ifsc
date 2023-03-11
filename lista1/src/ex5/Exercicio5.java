package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLado1;
	private JTextField textFieldLado2;
	private JTextField textFieldLado3;
	private JLabel lblLado1;
	private JLabel lblLado2;
	private JLabel lblLado3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldLado3 = new JTextField();
		textFieldLado3.setBounds(157, 177, 86, 20);
		contentPane.add(textFieldLado3);
		textFieldLado3.setColumns(10);

		textFieldLado2 = new JTextField();
		textFieldLado2.setBounds(157, 108, 86, 20);
		contentPane.add(textFieldLado2);
		textFieldLado2.setColumns(10);

		textFieldLado1 = new JTextField();
		textFieldLado1.setBounds(157, 50, 86, 20);
		contentPane.add(textFieldLado1);
		textFieldLado1.setColumns(10);

		JLabel lblVerificaTriangulo = new JLabel("Verificador de tipo de triângulo");
		lblVerificaTriangulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblVerificaTriangulo.setBounds(100, 11, 239, 14);
		contentPane.add(lblVerificaTriangulo);

		lblLado1 = new JLabel("Medida do lado 1");
		lblLado1.setBounds(61, 53, 86, 14);
		contentPane.add(lblLado1);

		lblLado2 = new JLabel("Medida do lado 2");
		lblLado2.setBounds(61, 111, 86, 14);
		contentPane.add(lblLado2);

		lblLado3 = new JLabel("Medida do lado 3 ");
		lblLado3.setBounds(61, 180, 86, 14);
		contentPane.add(lblLado3);

		JButton btnResultado = new JButton("Verificar");
		btnResultado.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Double medida1 = Double.parseDouble(textFieldLado1.getText());
				Double medida2 = Double.parseDouble(textFieldLado2.getText());
				Double medida3 = Double.parseDouble(textFieldLado3.getText());
				
				 

				if (Double.compare(medida1, medida2) == 0 && Double.compare(medida1, medida3) == 0
						&& Double.compare(medida2, medida3) == 0) {
					JOptionPane.showMessageDialog(null, "Triângulo equilátero!");
				} else if (Double.compare(medida1, medida2) == 0 || Double.compare(medida1, medida3) == 0
						|| Double.compare(medida2, medida3) == 0 || Double.compare(medida3, medida2) == 0) {
					JOptionPane.showMessageDialog(null, "Triângulo isósceles!");
				
				} else {
					JOptionPane.showMessageDialog(null, "Triângulo escaleno!");

				}

			}

		});
		btnResultado.setBounds(157, 227, 89, 23);

		contentPane.add(btnResultado);
	}
}
