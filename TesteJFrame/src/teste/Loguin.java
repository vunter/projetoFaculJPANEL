package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Loguin extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane1;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JTextField numero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loguin frame = new Loguin();
					frame.setVisible(true);
					//SegundaTela frame1 = new SegundaTela();
					//frame1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loguin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);

		txtSenha = new JTextField();
		txtSenha.setColumns(10);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");

		JLabel lblSenha = new JLabel("Senha:");

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkLogin(txtUsuario.getText(), txtSenha.getText())) {

					JOptionPane.showMessageDialog(null, "Bem vindo!", "Login", JOptionPane.INFORMATION_MESSAGE);
					contentPane.setVisible(false);
					contentPane1.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "Erro! Usuario ou Senha incorretos!", "Login",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		JLabel lblTeste = new JLabel("TESTE");
		lblTeste.setFont(new Font("Tahoma", Font.PLAIN, 44));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(79)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtUsuario, Alignment.LEADING)
												.addComponent(txtSenha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														230, Short.MAX_VALUE)
												.addComponent(lblUsurio, Alignment.LEADING)
												.addComponent(lblSenha, Alignment.LEADING))
										.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(120).addComponent(lblTeste)))
						.addContainerGap(65, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING,
						gl_contentPane.createSequentialGroup().addContainerGap(142, Short.MAX_VALUE)
								.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addGap(137)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblTeste).addGap(49)
						.addComponent(lblUsurio).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(26).addComponent(lblSenha).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(btnEntrar).addContainerGap(14, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("123");
	}

	public class SegundaTela {
		public SegundaTela() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane1 = new JPanel();
			contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane1);

			JButton btnMostre = new JButton("Mostre");
			btnMostre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Número: " + numero.getText());
				}
			});

			numero = new JTextField();
			numero.setColumns(10);

			JLabel lblNmero = new JLabel("N\u00FAmero");
			GroupLayout gl_contentPane = new GroupLayout(contentPane1);
			gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
							.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup().addGap(151).addComponent(btnMostre))
							.addGroup(gl_contentPane.createSequentialGroup().addGap(141)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNmero).addComponent(numero, GroupLayout.PREFERRED_SIZE,
													GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(197, Short.MAX_VALUE)));
			gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(
					Alignment.TRAILING,
					gl_contentPane.createSequentialGroup().addContainerGap(56, Short.MAX_VALUE).addComponent(lblNmero)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(numero,
									GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(79).addComponent(btnMostre).addGap(48)));
			contentPane1.setLayout(gl_contentPane);
		}

	}
}
