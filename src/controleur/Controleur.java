package controleur;

import donnee.ChampDAO;
import vue.Vue;
import vue.VueChamps;

//import vue.Navigateur;
//import vue.*;

public class Controleur {

	public static Vue selectionnerVuePrincipale()
	{
		ChampDAO collectionDAO = new ChampDAO();
		VueChamps.getInstance().afficherChamps(collectionDAO.listerChamps());
		return VueChamps.getInstance();
	}
		
}
