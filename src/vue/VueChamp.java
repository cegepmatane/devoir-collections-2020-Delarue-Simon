package vue;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurChamp;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

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
	
	public void afficherChamp(modele.Champ collection)
	{
		TextArea affichageDescription = (TextArea)lookup("#collection-description");
		affichageDescription.setText(collection.getDescription());

		Label affichageTitre = (Label)lookup("#titre-page");
		affichageTitre.setText("CHAMP " + collection.getNom());
	}
}
