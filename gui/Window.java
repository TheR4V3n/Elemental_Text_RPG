package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import characters.Player;
import combat.Combat;

import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.CYAN);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnElementAttack = new JButton(Player.player.getActiveElemental().getAttack(0).typeName);
		btnElementAttack.setForeground(Color.CYAN);
		btnElementAttack.setBackground(Color.GREEN);
		btnElementAttack.setBounds(295, 327, 150, 23);
		frame.getContentPane().add(btnElementAttack);
		
		JButton btnCreatureAttack = new JButton(Player.player.getActiveElemental().getAttack(1).typeName);
		btnCreatureAttack.setForeground(Color.CYAN);
		btnCreatureAttack.setBackground(Color.GREEN);
		btnCreatureAttack.setBounds(295, 293, 150, 23);
		frame.getContentPane().add(btnCreatureAttack);
		
		final JTextArea textPlayer = new JTextArea();
		textPlayer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textPlayer.setToolTipText("adsfdgfhyju");
		textPlayer.setText("");
		textPlayer.setBackground(Color.MAGENTA);
		textPlayer.setBounds(10, 11, 234, 271);
		frame.getContentPane().add(textPlayer);
		
		final JTextArea textEnemy = new JTextArea();
		textEnemy.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textEnemy.setToolTipText("adsyju");
		textEnemy.setText("");
		textEnemy.setBackground(Color.MAGENTA);
		textEnemy.setBounds(254, 11, 220, 271);
		frame.getContentPane().add(textEnemy);
		
		JButton btnRefresh = new JButton("Next");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPlayer.setText(Combat.printPlayerStats());
				textPlayer.setCaretPosition(textPlayer.getText().length() - 1);
				textEnemy.setText(Combat.printEnemyStats());
				textEnemy.setCaretPosition(textPlayer.getText().length() - 1);
			}
		});
		btnRefresh.setBackground(Color.CYAN);
		btnRefresh.setForeground(Color.GREEN);
		btnRefresh.setBounds(81, 310, 89, 23);
		frame.getContentPane().add(btnRefresh);
	}
	
}