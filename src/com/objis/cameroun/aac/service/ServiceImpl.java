package com.objis.cameroun.aac.service;

import java.util.List;

import com.objis.cameroun.aac.dao.DaoImpl;
import com.objis.cameroun.aac.dao.IDao;

import com.objis.cameroun.aac.domaine.Producteur;

public class ServiceImpl implements IService {
	
private IDao dao;
	

	public ServiceImpl() {
		
		dao = new DaoImpl();
	}

	@Override
	public int enregistrerProducteursService(Producteur producteur) {
		
		return dao.enregistrerProducteursDao(producteur) ;

	}

	@Override
	public List<Producteur> listProducteursService(){
		
		
		return dao.listProducteursDao();
	}
	

}
