package Data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class DAO {
		
	/**
	 * Attributs
	 */
	protected static DAO instance = null;
	protected EntityManagerFactory emf;
	protected EntityManager em;
	protected EntityTransaction tx;
	
	/**
	 * Méthodes
	 */
	
	// Retourne le singleton DAO
	public static DAO getInstance(){
		if (instance==null){
			instance = new DAO();
			return instance;
		}
		else {
			return instance;
		}
	}
	
	// Retourne l'entity manager factory
	public EntityManagerFactory getEMF(){
		if (null==emf){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
			this.emf=emf;
			return emf;
		}
		else {
			return this.emf;
		}
	}
	
	// Retourne l'entity manager
	public EntityManager getEM(){
		if (null==em){
			EntityManager em = DAO.getInstance().getEMF().createEntityManager();
			this.em=em;
			return em;
		}
		else {
			return this.em;
		}
	}
		
	// Retourne la connexion
	public EntityTransaction getTX(){
		if (null==em){
			EntityTransaction tx = DAO.getInstance().getEM().getTransaction();
			this.tx=tx;
			return tx;
		}
		else {
			return this.tx;
		}
	}
	
	public void deleteTable(String table){
		try {
			DAO.getInstance().getEM().createNativeQuery("delete from "+table).executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	public void selectAllFormations(){
		System.out.println("---------------------------------------------------------");
		System.out.println("Voici les formation existantes");
		@SuppressWarnings("rawtypes")
		List a = DAO.getInstance().getEM().createQuery("select f.titre from Formation f order by f.titre asc").getResultList();
		for (int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}
	
	public void selectAllStagiaires(){
		System.out.println("---------------------------------------------------------");
		System.out.println("Voici les stagiaires existants");
		@SuppressWarnings("rawtypes")
		List a = DAO.getInstance().getEM().createQuery("select s.nom from Stagiaire s order by s.nom asc").getResultList();
		for (int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}
	
	public void select(String choix){
		List a = DAO.getInstance().getEM().createQuery("select f from Formation f where f.titre = '"+choix+"'").getResultList();
		for (int i=0; i<a.size(); i++){
			Formation formation = (Formation) a.get(i);
			System.out.println("Titre = " + formation.getTitre());
			System.out.println("Date = " + formation.getDate());
			System.out.println("Nombre de participants = " + formation.getNbrStagiaires());
		}
	}
	
	public void getStagiaire(Object o){
		DAO.getInstance().getTX().begin();
		DAO.getInstance().getEM().persist(o);
		DAO.getInstance().getTX().commit();
	}
	*/
}
