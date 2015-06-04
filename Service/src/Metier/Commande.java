package Metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Data.DAO;

@Entity
@Table(name="commande")
public class Commande {
	
	@Id
	@Column(name = "numTable", nullable = false)
	private int numTable = -1;
	
	@Column(name = "numPersonne", nullable = false)
	private int numPersonne = -1;
	
	@Column(name = "paye", nullable = false)
	private boolean paye = false;
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch=FetchType.LAZY)
    @JoinTable(name="commande_plat", joinColumns={@JoinColumn(name = "nom")})
	private List<Plat> lstPlats = new ArrayList<Plat>();
	
	public void sauvegarder(){
		DAO.getInstance().getTX().begin();
		DAO.getInstance().getEM().persist(this);
		DAO.getInstance().getTX().commit();	
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
	
	public boolean isPaye() {
		return paye;
	}
	public void setPaye(boolean paye) {
		this.paye = paye;
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
