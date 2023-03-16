package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ex3.Aluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldClasseMacaco;
	private JTextField textFieldOrdemMacaco;
	private JTextField textFieldBiomaMacaco;
	private JTextField textFieldCorMacaco;
	private JTextField textFieldClassePassaro;
	private JTextField textFieldOrdemPassaro;
	private JTextField textFieldBiomaPassaro;
	private JTextField textFieldAlimentoPassaro;
	private ArrayList<Macaco> macacos;
	private ArrayList<Passaro> passaros;

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
		passaros = new ArrayList<Passaro>();
		macacos = new ArrayList<Macaco>();

		Macaco macaquinho = new Macaco();
		Passaro passarinho = new Passaro();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Cadastro de animais");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblTitulo.setBounds(128, 11, 124, 14);
		contentPane.add(lblTitulo);

		textFieldClasseMacaco = new JTextField();
		textFieldClasseMacaco.setBounds(26, 62, 86, 20);
		contentPane.add(textFieldClasseMacaco);
		textFieldClasseMacaco.setColumns(10);

		JLabel lblMacaco = new JLabel("Macaco");
		lblMacaco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblMacaco.setBounds(45, 11, 46, 14);
		contentPane.add(lblMacaco);

		textFieldOrdemMacaco = new JTextField();
		textFieldOrdemMacaco.setBounds(26, 109, 86, 20);
		contentPane.add(textFieldOrdemMacaco);
		textFieldOrdemMacaco.setColumns(10);

		textFieldBiomaMacaco = new JTextField();
		textFieldBiomaMacaco.setBounds(26, 152, 86, 20);
		contentPane.add(textFieldBiomaMacaco);
		textFieldBiomaMacaco.setColumns(10);

		textFieldCorMacaco = new JTextField();
		textFieldCorMacaco.setBounds(26, 201, 86, 20);
		contentPane.add(textFieldCorMacaco);
		textFieldCorMacaco.setColumns(10);

		JButton btnNewButton = new JButton("Cadastrar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String classe = textFieldClasseMacaco.getText();
				String bioma = textFieldBiomaMacaco.getText();
				String ordem = textFieldOrdemMacaco.getText();
				String cor = textFieldCorMacaco.getText();

				if (!classe.isEmpty()) {
					macaquinho.setClasseAnimal(classe);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a classe do animal!");
				}

				if (!bioma.isEmpty()) {
					macaquinho.setBioma(bioma);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o bioma do animal!");
				}

				if (!ordem.isEmpty()) {
					macaquinho.setOrdem(ordem);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a ordem do animal!");
				}

				if (!cor.isEmpty()) {
					macaquinho.setCor(cor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a cor do animal!");
				}

				macacos.add(macaquinho);
				JOptionPane.showMessageDialog(null, "Macaco cadastrado!");
				textFieldClasseMacaco.setText(null);
				textFieldBiomaMacaco.setText(null);
				textFieldOrdemMacaco.setText(null);
				textFieldCorMacaco.setText(null);

			}
		});
		btnNewButton.setBounds(26, 227, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(26, 183, 46, 14);
		contentPane.add(lblCor);

		JLabel lblBiomaMacaco = new JLabel("Bioma");
		lblBiomaMacaco.setBounds(26, 134, 46, 14);
		contentPane.add(lblBiomaMacaco);

		JLabel lblNewLabel_1 = new JLabel("Ordem");
		lblNewLabel_1.setBounds(26, 93, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Classe animal");
		lblNewLabel_2.setBounds(26, 36, 75, 14);
		contentPane.add(lblNewLabel_2);

		textFieldClassePassaro = new JTextField();
		textFieldClassePassaro.setBounds(266, 62, 86, 20);
		contentPane.add(textFieldClassePassaro);
		textFieldClassePassaro.setColumns(10);

		textFieldOrdemPassaro = new JTextField();
		textFieldOrdemPassaro.setBounds(266, 109, 86, 20);
		contentPane.add(textFieldOrdemPassaro);
		textFieldOrdemPassaro.setColumns(10);

		textFieldBiomaPassaro = new JTextField();
		textFieldBiomaPassaro.setBounds(266, 152, 86, 20);
		contentPane.add(textFieldBiomaPassaro);
		textFieldBiomaPassaro.setColumns(10);

		textFieldAlimentoPassaro = new JTextField();
		textFieldAlimentoPassaro.setBounds(266, 201, 86, 20);
		contentPane.add(textFieldAlimentoPassaro);
		textFieldAlimentoPassaro.setColumns(10);

		JButton btnCadastroPassaro = new JButton("Cadastrar");
		btnCadastroPassaro.setBounds(263, 227, 89, 23);
		btnCadastroPassaro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String classe = textFieldClassePassaro.getText();
				String bioma = textFieldBiomaPassaro.getText();
				String ordem = textFieldOrdemPassaro.getText();
				String alimento = textFieldAlimentoPassaro.getText();

				if (!classe.isEmpty()) {
					passarinho.setClasseAnimal(classe);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a classe do animal!");
				}

				if (!bioma.isEmpty()) {
					passarinho.setBioma(bioma);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o bioma do animal!");
				}

				if (!ordem.isEmpty()) {
					passarinho.setOrdem(ordem);
				} else {
					JOptionPane.showMessageDialog(null, "Digite a ordem do animal!");
				}

				if (!alimento.isEmpty()) {
					passarinho.setAlimento(alimento);
				} else {
					JOptionPane.showMessageDialog(null, "Digite o alimento do animal!");
				}

				passaros.add(passarinho);
				JOptionPane.showMessageDialog(null, "Pássaro cadastrado!");
				textFieldClassePassaro.setText(null);
				textFieldBiomaPassaro.setText(null);
				textFieldOrdemPassaro.setText(null);
				textFieldAlimentoPassaro.setText(null);

			}
			
		});
		contentPane.add(btnCadastroPassaro);

		JLabel lblClassePassaro = new JLabel("Classe animal");
		lblClassePassaro.setBounds(266, 36, 75, 14);
		contentPane.add(lblClassePassaro);

		JLabel lblOrdemPassaro = new JLabel("Ordem");
		lblOrdemPassaro.setBounds(266, 93, 46, 14);
		contentPane.add(lblOrdemPassaro);

		JLabel lblBiomaPassaro = new JLabel("Bioma");
		lblBiomaPassaro.setBounds(266, 134, 46, 14);
		contentPane.add(lblBiomaPassaro);

		JLabel lblAlimentoPassaro = new JLabel("Alimento");
		lblAlimentoPassaro.setBounds(266, 183, 46, 14);
		contentPane.add(lblAlimentoPassaro);

		JLabel lblNewLabel = new JLabel("Passaro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(282, 11, 46, 14);
		contentPane.add(lblNewLabel);

		JButton btnMostraPassaros = new JButton("Mostrar passaros");
		btnMostraPassaros.setBounds(144, 89, 89, 23);
		btnMostraPassaros.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, passaros.toString());
			}
			
		});
		
		contentPane.add(btnMostraPassaros);

		JButton btnMostraMacacos = new JButton("Mostrar macacos");
		btnMostraMacacos.setBounds(144, 151, 89, 23);
		btnMostraMacacos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, macacos.toString());
			}
			
		});
		
		contentPane.add(btnMostraMacacos);
	}
}
