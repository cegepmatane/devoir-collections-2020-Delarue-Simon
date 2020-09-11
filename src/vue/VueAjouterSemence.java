package vue;

import com.sun.media.jfxmedia.logging.Logger;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class VueAjouterSemence extends Vue{

	protected static VueAjouterSemence instance;
	public static VueAjouterSemence getInstance() {if(null == instance) instance = new VueAjouterSemence(); return instance;};
	public VueAjouterSemence() {
		super("ajouterSemence.fxml");
	}
	public void activerControles()
	{
		super.activerControles();
		
		Button actionEnregistrer = (Button)lookup("#action-enregistrer-semence");
		actionEnregistrer.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
			//controleur.notifierClicEnregisterSemence();
			}});
	}
	}

