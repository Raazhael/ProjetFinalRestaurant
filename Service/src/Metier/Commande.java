package Metier;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	private int numTable = -1;
	private int numPersonne = -1;
	private List<Plat> lstPlats = new ArrayList<Plat>();
	
	public void sauvegarder(){
		//TODO sauvegarder dans la BDD
	}
	public void ajouterPlat(Plat plat){
		getLstPlats().add(plat);
	}
	
	public void annulerPlat(Plat plat){
		getLstPlats().remove(plat);
	}

	public int getNumTable() {
		return numTable;
	}

	public void setNumTable(int numTable) {
		this.numTable = numTable;
	}

	public int getNumPersonne() {
		return numPersonne;
	}

	public void setNumPersonne(int numPersonne) {
		this.numPersonne = numPersonne;
	}
	
	public List<Plat> getLstPlats() {
		return lstPlats;
	}

	public void setLstPlats(List<Plat> lstPlats) {
		this.lstPlats = lstPlats;
	}
	
	/**
	 * Création d'une commande, faut-il directement instancier avec un nombre de personnes et un numero de table?
	 */	
	public Commande(){
		
	}
	
	public Commande(int numTable, int numPersonne){
		setNumTable(numTable);
		setNumPersonne(numPersonne);
	}
	
}
