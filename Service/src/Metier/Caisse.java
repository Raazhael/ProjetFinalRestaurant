package Metier;

import java.util.ArrayList;
import java.util.List;

/**
 * La caisse est considérée comme un singleton (une seule caisse dans notre restaurant)
 * @author ajc
 *
 */
public class Caisse {
	private Caisse instance = null;
	private List<Commande> lstCommandes = new ArrayList<Commande>();
	// Singleton...
	public Caisse getInstance(){
		if(instance==null){
			instance = new Caisse();
			return instance;
		} else {
			return instance;
		}
	}
	
	
	
	
}
