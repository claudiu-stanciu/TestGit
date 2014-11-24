package interfc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Interfata {

	private JFrame frame;

	private final JButton btnCev = new JButton("cev2");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfata window = new Interfata();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JTextPane txtpn = new JTextPane();
		txtpn.setText("bfgbf");
		txtpn.setBounds(132, 107, 97, 22);
		frame.getContentPane().add(txtpn);
		
		JButton btnCeva = new JButton("Ceva");
		btnCeva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtpn.setText("ceva2");
			}
		});
		btnCeva.setBounds(132, 173, 97, 25);
		frame.getContentPane().add(btnCeva);
		btnCev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtpn.setText("Ceva");
			}
		});
		btnCev.setBounds(132, 215, 148, 36);
		frame.getContentPane().add(btnCev);
		
		
	}
		public void actionPerformed(ActionEvent e) {
		}
	}
