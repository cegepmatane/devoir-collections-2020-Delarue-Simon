package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import vue.Navigateur;
import vue.VueAjouterSemence;

public class ControleurChamp extends Controleur{

	public ControleurChamp()
	{
		Logger.logMsg(Logger.INFO, "new ControleurChamp()");
	}

	public void notifierClicAjouterSemence()
	{
		Navigateur.getInstance().afficherVue(VueAjouterSemence.getInstance());
		
	}
}
