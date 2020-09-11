package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import donnee.ChampDAO;
import donnee.SemenceDAO;
import modele.Champ;
import modele.Semence;
import vue.Navigateur;
import vue.VueAjouterSemence;
import vue.VueChamp;

public class ControleurChamp extends Controleur{

	protected ChampDAO champDAO = new ChampDAO();
	protected SemenceDAO semenceDAO = new SemenceDAO();
	protected Champ champ = null;
	protected List<Semence> semences = null;
	
	public ControleurChamp()
	{
		Logger.logMsg(Logger.INFO, "new ControleurChamp()");
	}
	
	public void actionOuvrirChamp(int numero)
	{
		this.champ = champDAO.detaillerChamp(numero);
		VueChamp.getInstance().afficherChamp(this.champ);
		this.semences = semenceDAO.listerSemences(numero);
		VueChamp.getInstance().afficherSemences(this.semences);
		Navigateur.getInstance().afficherVue(VueChamp.getInstance());
	}
	
	public void notifierClicAjouterSemence()
	{
		Navigateur.getInstance().afficherVue(VueAjouterSemence.getInstance());
		
	}
	
	public void notifierClicEnregisterSemence() {
		
		Semence semence = VueAjouterSemence.getInstance().lireSemence();
		SemenceDAO semenceDAO = new SemenceDAO();
		semenceDAO.ajouterSemence(semence);
		//TODO : gérer l'id et la foreign key
		//VueChamp.getInstance().afficherChamp(semenceDAO.listerSemences(INSERER ID CHAMP));
		Navigateur.getInstance().afficherVue(VueChamp.getInstance());
	}
	
	
}
