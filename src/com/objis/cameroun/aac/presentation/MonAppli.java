package com.objis.cameroun.aac.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MonAppli {

	private JFrame frmMaFentre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonAppli window = new MonAppli();
					window.frmMaFentre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MonAppli() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaFentre = new JFrame();
		frmMaFentre.setTitle("MA FEN\u00CBTRE");
		frmMaFentre.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Utilisateur\\Documents\\icon\\20723872-farm-tractor-symbol.jpg"));
		frmMaFentre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaFentre.setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		frmMaFentre.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Producers");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("List");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ListProducers frame = new ListProducers();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmProducers = new JMenuItem("Save");
		mntmProducers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SaveProducers frame = new SaveProducers();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmProducers);
		frmMaFentre.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setIcon(new ImageIcon("C:\\Users\\Utilisateur\\Documents\\icon\\icons8-beet-50.png"));
		label.setBounds(10, 11, 414, 218);
		frmMaFentre.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setIcon(new ImageIcon("C:\\Users\\Utilisateur\\Documents\\icon\\icons8-beet-50.png"));
		label_1.setBounds(97, 11, 327, 218);
		frmMaFentre.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setIcon(new ImageIcon("C:\\Users\\Utilisateur\\Documents\\icon\\icons8-beet-50.png"));
		label_2.setBounds(179, 0, 245, 229);
		frmMaFentre.getContentPane().add(label_2);
	}
}
