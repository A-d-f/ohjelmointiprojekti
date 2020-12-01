import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class tietovienti {
public static void vietieto() {
		
		Connection connection = null; 
		Statement statement = null;  
		ResultSet resultSet = null;
		
		// Yhteyden tiedot
		String db = "trtkp20a3";
		String url = "jdbc:mysql://shell.hamk.fi/"+db+"?useSSL=false";
		String username = "trtkp20a3";
		String password = "trtkp20a3passwd";
		
		// Tietokannan taulun kentät tulostusta varten
		int tuote_id;
		String nimi;
		int hinta;		
		int kalorit;
		int tuoteryhma;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Anna tuotteen nimi");
		nimi  = in.nextLine();
		
		System.out.println("Anna tuoteryhmä 1: Leipä	2: Täyte	3: Jotain");
		tuoteryhma  = Integer.parseInt(in.nextLine());
		
		System.out.println("Anna tuotteen hinta");
		hinta = Integer.parseInt(in.nextLine());
		
		System.out.println("Syötä kalorimäärä");
		kalorit = Integer.parseInt(in.nextLine());
		
		
		
		
		try {
			
			// 1. yhteys
			connection = DriverManager.getConnection(url, username, password);
			
			// 2. MySQL-kysely
			statement = connection.createStatement();

			String queryInsert =  "INSERT INTO ryhmä10_taulu (tuoteryhma,nimi,hinta,kalorit) VALUES ('"+tuoteryhma+"','"+nimi+"','"+hinta+"',"+kalorit+")";
			
			
			// 3. Suoritetaan kysely
			statement.executeUpdate(queryInsert); //lisää tietokantaan
			
			
			
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			// 5. Yhteyden sulkeminen ja kyselyjen nollaus
			if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
			if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
		    if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
		  }
	}
}

