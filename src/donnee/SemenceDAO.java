package donnee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modele.Semence;

public class SemenceDAO {
	public String recupChampID() {
		String champID;
		
		
		
		return champID;
	}
	
	
	
	
	
	
	public List<Semence> listerSemences(int numero) //TODO : trouver une façon de faire passer l'id du champ ici
	{
		Connection connection = BaseDeDonnees.getInstance().getConnection();
		
		List<Semence> listeSemences =  new ArrayList<Semence>();			
		PreparedStatement requeteSemences;
		try {
			requeteSemences = connection.prepareStatement("SELECT * from semences WHERE id = ?");
			requeteSemences.setInt(1, numero);
			ResultSet curseurListeSemences = requeteSemences.executeQuery();
			
			while(curseurListeSemences.next())
			{
				int id = curseurListeSemences.getInt("id");
				String typeSemence = curseurListeSemences.getString("typesemence");
				int taille = curseurListeSemences.getInt("taille");
				String fertiliteSol = curseurListeSemences.getString("fertilitesol");
				String datePlantation = curseurListeSemences.getString("dateplantation");
				Semence semence = new Semence();
				semence.setId(id);
				semence.setTaille(taille);
				semence.setTypeSemence(typeSemence);
				semence.setFertiliteSol(fertiliteSol);
				semence.setDatePlantation(datePlantation);
				listeSemences.add(semence);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return listeSemences;
	}
	
}
