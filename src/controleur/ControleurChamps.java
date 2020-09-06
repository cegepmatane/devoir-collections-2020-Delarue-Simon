package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import donnee.ChampDAO;
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
		VueChamp.getInstance().afficherChamp(champDAO.detaillerChamp(numero));
		
		Navigateur.getInstance().afficherVue(VueChamp.getInstance());
	}

}
