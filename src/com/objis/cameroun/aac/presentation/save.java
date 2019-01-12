package com.objis.cameroun.aac.presentation;

import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.aac.domaine.Producteur;
import com.objis.cameroun.aac.service.IService;
import com.objis.cameroun.aac.service.ServiceImpl;

public class save {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sct = new Scanner(System.in);
		System.out.println("ENREGISTREZ UN PRODUCTEUR");
		System.out.println("Entrez votre nom");
		String nom = sc.nextLine();
		System.out.println("Entrez votre prenom");
		String prenom = sc.nextLine();
		System.out.println("Entrez votre spéculation");
		String spe = sc.nextLine();
		
		System.out.println("Votre rendement");
		int rdt = sct.nextInt();
		
		Producteur pro = new Producteur();
		
		pro.setNom(nom);
		pro.setPrenom(prenom);
		pro.setSpeculation(spe);
		pro.setRendement(rdt);
		
		System.out.println(pro);
		
		
		//appel de la couche service
						
		IService service = new ServiceImpl();
						
	 //appel de la méthode enregistrerAgriculteurService de la couche service
						
		service.enregistrerProducteursService(pro);
						
						
	//liste de tous les agriculteurs de la BD
						
	//déclaration d'une collection des agriulteurs
	List<Producteur> producteurs;
						
	//appel de la méthode listrAgriculteurService de la couche service
	producteurs = service.listProducteursService();
			
						
	for(Producteur producteur : producteurs)
	{
	  System.out.println(producteur);
						  
	}

	}

}
