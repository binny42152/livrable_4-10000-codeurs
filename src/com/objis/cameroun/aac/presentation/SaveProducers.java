package com.objis.cameroun.aac.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.aac.domaine.Producteur;
import com.objis.cameroun.aac.service.IService;
import com.objis.cameroun.aac.service.ServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaveProducers extends JFrame {

	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField speculationTextField;
	private JTextField rendementTextField;


	/**
	 * Create the frame.
	 */
	public SaveProducers() {
		setTitle("ENREGISTRER PRODUCTEUR");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(10, 11, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(10, 51, 46, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblSpeculation = new JLabel("Speculation :");
		lblSpeculation.setBounds(10, 93, 69, 14);
		contentPane.add(lblSpeculation);
		
		JLabel lblRendement = new JLabel("Rendement :");
		lblRendement.setBounds(10, 152, 80, 14);
		contentPane.add(lblRendement);
		

		
		JButton btnFinish = new JButton("FINISH");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//recuperation des valeurs saisies par l'utilisateur
				
				String nom = nomTextField.getText();
				String prenom = prenomTextField.getText();
				String speculation = speculationTextField.getText();
				//String rendement = rendementTextField.getText();
				int rendement = Integer.parseInt(rendementTextField.getText());
				
				 // creation d'un objet agriculteur et initialisation de ses attributions
				
				Producteur producteur = new Producteur();
				producteur.setNom(nom);
				producteur.setPrenom(prenom);
				producteur.setSpeculation(speculation);
				producteur.setRendement(rendement);
								
				//Enregistrement de l'objet agriculteur dans la couche service
				
				//appel de la couche service
				
				IService service = new ServiceImpl();
				
				
						
				//appel de la methode enregistreAgriculteurService de la couche service
				
				int status ;
				
				status = service.enregistrerProducteursService(producteur);
				
				if(status == 1) {
					  JOptionPane.showMessageDialog(null, "Producteur " + producteur.getNom() + 
							  " enregistré dans la BD!");
					  
					  nomTextField.setText("");
					  prenomTextField.setText("");
					  speculationTextField.setText("");
					  rendementTextField.setText("");
					 
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement de l'agriculteur!!! ");
				  }
				
				
			}
		});
		btnFinish.setBounds(176, 206, 89, 23);
		contentPane.add(btnFinish);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(50, 8, 197, 20);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(66, 48, 181, 20);
		contentPane.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		speculationTextField = new JTextField();
		speculationTextField.setBounds(89, 90, 176, 20);
		contentPane.add(speculationTextField);
		speculationTextField.setColumns(10);
		
		rendementTextField = new JTextField();
		rendementTextField.setBounds(89, 149, 197, 20);
		contentPane.add(rendementTextField);
		rendementTextField.setColumns(10);
		
		
	}
}
