package ex1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Exercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDesativado;
	private JTextField textAtivado;
	private JButton btnCadastrar;
	private JButton btnExibir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {

		ArrayList<Double> listaNumeros = new ArrayList<Double>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textAtivado = new JTextField();
		textAtivado.setBounds(144, 10, 109, 20);
		contentPane.add(textAtivado);
		textAtivado.setColumns(10);

		textFieldDesativado = new JTextField();
		textFieldDesativado.setEnabled(false);
		textFieldDesativado.setBounds(145, 73, 108, 20);
		contentPane.add(textFieldDesativado);
		textFieldDesativado.setColumns(10);

		JLabel lblCadastro = new JLabel("Cadastro de número");
		lblCadastro.setBounds(10, 13, 108, 14);
		contentPane.add(lblCadastro);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 76, 86, 14);
		contentPane.add(lblResultado);

		btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBounds(41, 151, 118, 33);

		btnCadastrar.addActionListener(new ActionListener() {
//ação do botao de cadastrar
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < 5; i++) {
					Double numeros = Double.parseDouble(textAtivado.getText());

					listaNumeros.add(numeros);

				}
				
System.out.println(listaNumeros.size());
			}

		});
		contentPane.add(btnCadastrar);

		btnExibir = new JButton("EXIBIR");
		btnExibir.setBounds(234, 151, 118, 33);
		contentPane.add(btnExibir);
	}

}
