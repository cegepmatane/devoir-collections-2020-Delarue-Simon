package controleur;

import donnee.ChampDAO;
import vue.Vue;
import vue.VueChamps;

//import vue.Navigateur;
//import vue.*;

public class Controleur {

	public static Vue selectionnerVuePrincipale()
	{
		ChampDAO champDAO = new ChampDAO();
		VueChamps.getInstance().afficherChamps(champDAO.listerChamps());
		return VueChamps.getInstance();
	}
		
}
