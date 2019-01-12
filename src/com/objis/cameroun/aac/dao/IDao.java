package com.objis.cameroun.aac.dao;

import java.util.List;

import com.objis.cameroun.aac.domaine.Producteur;

public interface IDao {
	
	public int enregistrerProducteursDao(Producteur producteur);
	public List<Producteur> listProducteursDao();

}
