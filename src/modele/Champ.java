package modele;

public class Champ {
	
	protected int id;
	protected String nom;
	protected String distanceFerme;
	
	public String getDistanceFerme() {
		return distanceFerme;
	}
	public void setDistanceFerme(String distanceFerme) {
		this.distanceFerme = distanceFerme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
