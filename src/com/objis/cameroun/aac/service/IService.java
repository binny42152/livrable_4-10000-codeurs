package com.objis.cameroun.aac.service;

import java.util.List;

import com.objis.cameroun.aac.domaine.Producteur;

public interface IService {
	
	public int enregistrerProducteursService(Producteur producteur);
	public List<Producteur> listProducteursService();

}
