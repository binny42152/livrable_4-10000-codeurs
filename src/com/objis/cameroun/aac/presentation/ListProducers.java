package com.objis.cameroun.aac.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


import com.objis.cameroun.aac.domaine.Producteur;
import com.objis.cameroun.aac.domaine.ProducteursModel;
import com.objis.cameroun.aac.service.IService;
import com.objis.cameroun.aac.service.ServiceImpl;

import javax.swing.JTable;

public class ListProducers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ProducteursModel producteursModel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ListProducers() {
		setTitle("LISTE PRODUCERS");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//appel de la couche service
				IService service = new ServiceImpl();
				
				//appel de la methode listeAgriculteurService la couche service
				
				List<Producteur> producteurs;
				
				producteurs = service.listProducteursService();
				
				System.out.println(producteurs.size());
				
				
				producteursModel = new ProducteursModel(producteurs);
		
		table = new JTable(producteursModel);
		
		table.setBounds(10, 246, 414, -234);
	   //	contentPane.add(table);
		
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
	}
}
