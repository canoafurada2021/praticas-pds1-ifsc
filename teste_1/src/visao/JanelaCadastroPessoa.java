package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeFuncionario;
	private JLabel lblNewLabel_1;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setBackground(new Color(177, 245, 232));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 170, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(77, 71, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtCpf = new JTextField();
		txtCpf.setBounds(154, 111, 123, 29);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(93, 115, 62, 17);
		contentPane.add(lblNewLabel);

		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setBounds(154, 64, 123, 29);
		contentPane.add(txtNomeFuncionario);
		txtNomeFuncionario.setColumns(10);

		JButton btnSalvar = new JButton("Enviar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Pega as variáveis inseridas no campo de texto
				// e armazena em variaveis para utilização
				String nome = txtNomeFuncionario.getText();
				String cpf = txtCpf.getText();

				
				//melhorar validação para que erros tipo:
				//adicionar funcionario mesmo com campos vazios não ocorra
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
				}

				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF preenchido!");
				}

				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				
				FuncionarioDAO banquinhozinho = new FuncionarioDAO();
				
				
			}
		});
		btnSalvar.setBounds(172, 165, 89, 23);
		contentPane.add(btnSalvar);
	}
}
