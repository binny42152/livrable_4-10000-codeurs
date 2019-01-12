package com.objis.cameroun.aac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {
	
	// Information d'acc�s � la base de donn�es
	public static String url = "jdbc:mysql://localhost/bdaaa";
	public static String login = "root";//nom d'utilisateur de la base des donn�es
	public static String passwd = "";//mot de pass
	public static Connection connection;
	
	/**
	 * Methode connection
	 * Elle ne prend rien en parametre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				System.out.println("ok connection");
				
			}catch (SQLException e) {
				
				System.out.println("Probleme de connection");
				
			}
			
		}
		
		return connection;
		
	}

}
