package Actions;

import com.opensymphony.xwork2.ActionSupport;

public class Action2 extends ActionSupport {
	private String nom;

	public String execute() throws Exception {
		System.out.println("aa");
		return "success";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}