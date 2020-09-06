package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import donnee.ChampDAO;
import donnee.SemenceDAO;
import vue.Navigateur;
import vue.VueChamp;

public class ControleurChamps extends Controleur{

	public ControleurChamps()
	{
		Logger.logMsg(Logger.INFO, "new ControleurCollections()");
	}
	
	// RECEPTION des EVENEMENTS
	public void actionOuvrirChamp(int numero)
	{
		ChampDAO champDAO = new ChampDAO();
		SemenceDAO semenceDAO = new SemenceDAO();
		VueChamp.getInstance().afficherChamp(champDAO.detaillerChamp(numero));
		VueChamp.getInstance().afficherSemences(semenceDAO.listerSemences(numero));
		Navigateur.getInstance().afficherVue(VueChamp.getInstance());
	}

}
