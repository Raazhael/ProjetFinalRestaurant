package Metier;



/**
 * La caisse est consid�r�e comme un singleton (une seule caisse dans notre restaurant)
 */
public class Caisse {

	private Caisse instance = null;
	
	// Singleton...
	public Caisse getInstance(){
		if(instance==null){
			instance = new Caisse();
			return instance;
		} else {
			return instance;
		}
	}
	
	public void afficherLstCommandes(){
		//TODO Struts...
	}
	
	// Une fois que la commande a �t� pay�e on passe la valeur de cette commande � "pay�e".
	public void validerPayementCommande(Commande commande){
		commande.setPaye(true);
	}
	
	
}
