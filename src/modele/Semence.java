package modele;

public class Semence {
	
	protected int id;
	protected String typeSemence;
	protected int taille;
	protected String fertiliteSol;
	protected String datePlantation;
	protected int champ_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTypeSemence() {
		return typeSemence;
	}
	public void setTypeSemence(String typeSemence) {
		this.typeSemence = typeSemence;
	}
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public String getFertiliteSol() {
		return fertiliteSol;
	}
	public void setFertiliteSol(String fertiliteSol) {
		this.fertiliteSol = fertiliteSol;
	}
	
	public String getDatePlantation() {
		return datePlantation;
	}
	public void setDatePlantation(String datePlantation) {
		this.datePlantation = datePlantation;
	}

}
