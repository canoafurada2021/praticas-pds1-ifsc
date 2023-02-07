package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeFuncionario;
	private JLabel lblNewLabel_1;
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 170, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(77, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(269, 64, 108, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(93, 115, 62, 17);
		contentPane.add(lblNewLabel);
		
		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setBounds(154, 64, 111, 29);
		contentPane.add(txtNomeFuncionario);
		txtNomeFuncionario.setColumns(10);
	}

}
