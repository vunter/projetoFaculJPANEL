package teste;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SeuFrame extends JFrame {

	private JPanel panel1;
	private JPanel panel2;
	private JButton botao1;
	private JButton botao2;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeuFrame frame = new SeuFrame();
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

	public SeuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel1 = new JPanel();
		panel2 = new JPanel();

		botao1 = new JButton("Trocar para panel2");
		botao1.setPreferredSize(new Dimension(200, 30));

		botao2 = new JButton("Trocar para panel1");
		botao2.setPreferredSize(new Dimension(200, 30));

		panel1.add(botao1);
		panel2.add(botao2);

		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panelTrocar = null;
				if (e.getSource() == botao1) {
					panelTrocar = panel2;
				} else {
					panelTrocar = panel1;
				}
				getContentPane().removeAll();
				getContentPane().add(panelTrocar);
				revalidate();
				repaint();
			}
		};

		botao1.addActionListener(actionListener);
		botao2.addActionListener(actionListener);

		getContentPane().add(panel1);
	}

}
