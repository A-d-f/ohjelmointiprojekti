import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;






public class Kirjautuminen {
	
	static Connection connection = null; 
	static Statement statement = null;  
	static ResultSet resultSet = null;
	static String db = "trtkp20a3";
	static String url = "jdbc:mysql://shell.hamk.fi/"+db+"?useSSL=false";
	static String username = "trtkp20a3";
	static String password = "trtkp20a3passwd";
	private static String ktunnus;
	private static String salasana;
	
	
	
	
	
	
	
	
	
	
	public static void tiedot() {
		try {
			
			// 1. yhteys
			connection = DriverManager.getConnection(url, username, password);
			
			// 2. MySQL-kysely
			statement = connection.createStatement();

			String querySelect = "SELECT * FROM ryhmä10_taulu_02";
			
			// 3. Suoritetaan kysely
			resultSet = statement.executeQuery(querySelect);
			
			// 4. Vastauksen käsittely
			System.out.println("Num\tNimi\t\tHinta\tKalorit");
			
			while (resultSet.next()) {
				
				
				ktunnus = resultSet.getString("ktunnus");
				salasana = resultSet.getString("salasana");
				System.out.println(ktunnus + "\t" +  salasana);
			}
				
			
			
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

			
		}}


