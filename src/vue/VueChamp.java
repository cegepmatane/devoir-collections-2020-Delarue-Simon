package vue;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurChamp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Region;
import modele.Semence;

public class VueChamp extends Vue {

	protected ControleurChamp controleur;
	protected static VueChamp instance = null; 
	public static VueChamp getInstance() {if(null==instance)instance = new VueChamp();return VueChamp.instance;}; 
	
	private VueChamp() 
	{
		super("champ.fxml"); 
		super.controleur = this.controleur = new ControleurChamp();
		Logger.logMsg(Logger.INFO, "new VueChamp()");
	}
		
	public void activerControles()
	{
		super.activerControles();
	}
	
	public void afficherChamp(modele.Champ champ)
	{
		TextArea affichageDescriptionChamp = (TextArea)lookup("#description-champ");
		String description;
		description = "Distance entre la ferme et le champ : "+champ.getDistanceFerme()+"\n";
		description += "Fertilité du sol : "+champ.getFertiliteSol()+"\n";
		description += "Taille du champ : "+champ.getTaille()+" m²";
		affichageDescriptionChamp.setText(description);

		Label affichageTitre = (Label)lookup("#titre-page");
		affichageTitre.setText("CHAMP " + champ.getNom());
		
		
	}
	public void afficherSemences(List<Semence> listeSemences) //TODO : trouver une façon d'afficher chaque semences séparément et de pouvoir les modifier
	{
		/*for (Semence s: listeSemences) {
			
		}
		listeSemences.get(1).getTypeSemence()*/
		TextArea textArea = new TextArea();
		//textArea.setLayoutX(300);
		//textArea.setLayoutY(300);
		ListView affichageListeSemences = (ListView)lookup("#liste-semences");
		affichageListeSemences.setItems(FXCollections.observableArrayList(listeSemences));
		
		
	}
}
