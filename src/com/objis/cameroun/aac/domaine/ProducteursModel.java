package com.objis.cameroun.aac.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ProducteursModel extends AbstractTableModel {
	
	private final String[] entetes = {"Nom", "Prenom","Speculation","Rendement"};

    private List<Producteur> producteurs;
    
    public ProducteursModel(List<Producteur> producteurs) {  
        this.producteurs = producteurs; 
    }
    
    
	public List<Producteur> getProducteurs() {
		return producteurs;
	}

	public void setProducteurs(List<Producteur> producteurs) {
		this.producteurs = producteurs;
	}

	@Override
	public int getColumnCount() {
		
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		
		return producteurs.size();
	}
	
    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

         //   case 0:
                // ID
               // return producteurs.get(rowIndex).getIdProducteur();

            case 0:
                // Nom
                return producteurs.get(rowIndex).getNom();
            case 1:
                // Prenom
                return producteurs.get(rowIndex).getPrenom();
            case 2:
                // Speculation
                return producteurs.get(rowIndex).getSpeculation();
            case 3:
                // Rendement
                return producteurs.get(rowIndex).getRendement();
            case 4:
                
            default:
                throw new IllegalArgumentException();
        }
	}

}
