package vue;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurChamp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
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
		
		Logger.logMsg(Logger.INFO, "VueChamp.afficherSemences()");
		/*ListView affichageListeSemences = (ListView)lookup("#liste-semences"); ancien code pour afficher dans un ListView
		ArrayList<String> listeNomSemences= new ArrayList<String>(); */
		VBox vueSemences = (VBox)lookup("#listesemences");
		vueSemences.getChildren().clear();
		for (Semence semence: listeSemences) {
			Logger.logMsg(Logger.INFO, "Semence : "+ semence.getTypeSemence());
			HBox vueSemence = new HBox();
			vueSemence.getStyleClass().add("semence");
			vueSemence.getChildren().add(new Label(semence.getTypeSemence()));
			vueSemence.getChildren().add(new Button("Modifier"));
			vueSemences.getChildren().add(vueSemence);
			//listeNomSemences.add(semence.getTypeSemence());
		}
		
		//affichageListeSemences.setItems(FXCollections.observableArrayList(listeNomSemences));
		
		
	}
}
