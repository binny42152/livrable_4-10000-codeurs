package com.objis.cameroun.aac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.objis.cameroun.aac.domaine.Producteur;

public class DaoImpl implements IDao {
	
	

	@Override
	public int enregistrerProducteursDao(Producteur producteur) {
		
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet  statement et preparation de la requete
			

			String sql = "insert into `producteur`(`nom`,`prenom`,`speculation`,`rendement`)" 
					+"values (?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.setString(1, producteur.getNom());
			ps.setString(2, producteur.getPrenom());
			ps.setString(3, producteur.getSpeculation());
			ps.setInt(4, producteur.getRendement());
			
			
		
			// Etape 3 : exécution requête
			ps.executeUpdate();
			return 1;
			
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
			
		} 
		
		
		
		

	}

	@Override
	public List<Producteur> listProducteursDao() {
		//création d'une collection des agriulteurs
		List<Producteur> maListProducteur= new ArrayList<Producteur>();
	
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT * FROM producteur ";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				//recuperation des valeurs d'une ligne de la table agriculteur, pour initialiser dans un objet agriculteur
				Producteur producteur =  new Producteur();
				
				producteur.setNom(rs.getString("nom"));
				producteur.setPrenom(rs.getString("prenom"));
				producteur.setSpeculation(rs.getString("speculation"));
				producteur.setRendement(rs.getInt("rendement"));
				
				
				//ajout de l'agriculteur dans List maListAgriculteur
				maListProducteur.add(producteur); // cette instruction permet d'inserer l'objet agriculteur dans ma liste agriculteur
				
			}
			
			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return maListProducteur;
		

	}
	

}
