package ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Exercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldNascimento;
	private JTextField textFieldCpf;
	private JTextField textFieldMatricula;
	private JLabel lblNomeAluno;
	private JLabel lblNascimentoAluno;
	private JLabel lblCpfAluno;
	private JLabel lblMatriculaAluno;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnConsultaAlunos;
	private JButton btnNewButton_3;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {

		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();

		Aluno aluninho = new Aluno();
		Professor prof = new Professor();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(80, 46, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		textFieldNascimento = new JTextField();
		textFieldNascimento.setBounds(80, 77, 86, 20);
		contentPane.add(textFieldNascimento);
		textFieldNascimento.setColumns(10);

		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(80, 108, 86, 20);
		contentPane.add(textFieldCpf);
		textFieldCpf.setColumns(10);

		textFieldMatricula = new JTextField();
		textFieldMatricula.setBounds(80, 140, 86, 20);
		contentPane.add(textFieldMatricula);
		textFieldMatricula.setColumns(10);

		JButton btnCadastroAluno = new JButton("Cadastrar aluno");
		btnCadastroAluno.setBounds(43, 181, 144, 23);
		btnCadastroAluno.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String nomeAluno = textFieldNome.getText();
				String dataNascimento = textFieldNascimento.getText();
				String cpf = textFieldCpf.getText();
				String matricula = textFieldMatricula.getText();

				if (!dataNascimento.isEmpty()) {
					Date nacimento = new Date(dataNascimento);
					aluninho.setDataNasc(nacimento);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a data de nascimento!");
				}

				if (!nomeAluno.isEmpty()) {
					aluninho.setNome(nomeAluno);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o nome do aluno!");
				}

				if (!cpf.isEmpty()) {
					Long cpfAluno = Long.valueOf(cpf);
					aluninho.setCpf(cpfAluno);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o cpf do aluno!");
				}

				if (!matricula.isEmpty()) {
					Long matriculaAluno = Long.valueOf(matricula);
					aluninho.setMatricula(matriculaAluno);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o número da matrícula!");

				}

				alunos.add(aluninho);
				JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
				textFieldNome.setText(null);
				textFieldCpf.setText(null);
				textFieldNascimento.setText(null);
				textFieldMatricula.setText(null);
			}

		});
		contentPane.add(btnCadastroAluno);

		JLabel lblCadastroAluno = new JLabel("Cadastro aluno");
		lblCadastroAluno.setBounds(10, 21, 86, 14);
		contentPane.add(lblCadastroAluno);

		lblNomeAluno = new JLabel("Nome");
		lblNomeAluno.setBounds(10, 49, 46, 14);
		contentPane.add(lblNomeAluno);

		lblNascimentoAluno = new JLabel("nascimento");
		lblNascimentoAluno.setBounds(10, 80, 60, 14);
		contentPane.add(lblNascimentoAluno);

		lblCpfAluno = new JLabel("CPF");
		lblCpfAluno.setBounds(10, 117, 46, 14);
		contentPane.add(lblCpfAluno);

		lblMatriculaAluno = new JLabel("Matricula");
		lblMatriculaAluno.setBounds(10, 143, 46, 14);
		contentPane.add(lblMatriculaAluno);

		lblNewLabel_5 = new JLabel("Cadastro professor");
		lblNewLabel_5.setBounds(268, 21, 98, 14);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(268, 49, 46, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Nascimento");
		lblNewLabel_7.setBounds(268, 80, 65, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("CPF");
		lblNewLabel_8.setBounds(268, 111, 26, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("Siape");
		lblNewLabel_9.setBounds(268, 142, 46, 14);
		contentPane.add(lblNewLabel_9);

		btnNewButton_1 = new JButton("Cadastrar professor");
		btnNewButton_1.setBounds(280, 181, 144, 23);
		contentPane.add(btnNewButton_1);

		textField_4 = new JTextField();
		textField_4.setBounds(338, 46, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(338, 77, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(338, 108, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(338, 139, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		btnConsultaAlunos = new JButton("Consultar alunos");
		btnConsultaAlunos.setBounds(43, 227, 144, 23);
		btnConsultaAlunos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, forAlunos(alunos));
			}

		});
		contentPane.add(btnConsultaAlunos);

		btnNewButton_3 = new JButton("Consultar professores");
		btnNewButton_3.setBounds(280, 227, 144, 23);
		contentPane.add(btnNewButton_3);
	}

	public ArrayList<Aluno> forAlunos(ArrayList<Aluno> alunos) {
		for (Aluno aluno : alunos) {
	
			aluno.getNome();
			aluno.getCpf();
			aluno.getMatricula();
			aluno.getDataNasc();
		}
		return alunos;
	}
}
