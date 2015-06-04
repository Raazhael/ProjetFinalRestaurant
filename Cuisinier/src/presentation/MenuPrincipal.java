package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setLocationRelativeTo(null);
					frame.setUndecorated(true);
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnQuitter.setBounds(1485, 828, 89, 23);
		contentPane.add(btnQuitter);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 47, 1584, 186);
		contentPane.add(panel);
		
		JLabel lblListeDesCommandes = new JLabel("Liste des commandes :");
		lblListeDesCommandes.setBounds(0, 28, 145, 14);
		contentPane.add(lblListeDesCommandes);
		
		JLabel lblCommandes = new JLabel("Commandes");
		lblCommandes.setForeground(new Color(102, 51, 255));
		lblCommandes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCommandes.setBounds(709, 11, 136, 31);
		contentPane.add(lblCommandes);
	}
}
