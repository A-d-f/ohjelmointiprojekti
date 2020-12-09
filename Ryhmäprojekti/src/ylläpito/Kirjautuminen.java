package yll‰pito;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Kirjautuminen {

	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static String db = "trtkp20a3";
	private static String url = "jdbc:mysql://shell.hamk.fi/" + db + "?useSSL=false";
	private static String username = "trtkp20a3";
	private static String password = "trtkp20a3passwd";
	private static String ktunnus;
	private static String salasana;

	public static void tiedot() {

		Scanner in = new Scanner(System.in);
		System.out.println("Anna k‰ytt‰j‰tunnus:");
		String vastausk = in.nextLine();
		System.out.println("Anna salasana:");
		String vastauss = in.nextLine();

		try {

			// 1. yhteys
			connection = DriverManager.getConnection(url, username, password);

			// 2. MySQL-kysely
			statement = connection.createStatement();

			String querySelect = "SELECT ktunnus, salasana FROM ryhm‰10_taulu_02";
			// 3. Suoritetaan kysely
			ResultSet resultSet = statement.executeQuery(querySelect);
			while (resultSet.next()) {
				String kayttaja = resultSet.getString("ktunnus");
				String salas = resultSet.getString("salasana");

				// 4. Vastauksen k‰sittely
				System.out.println("Kirjautuminen k‰ynniss‰");
				
				if (vastausk.equals(kayttaja) && vastauss.equals(salas)) {
					String jtn;
					do {
					tietovienti.vietieto();
					System.out.println("Haluatko lis‰t‰ tuotteita? k/e");
					jtn = in.nextLine();
					if (jtn.equals("e")) {
						System.out.println("Palataan tilausn‰kym‰‰n" + "\n");
						break; }
					} while (jtn.equalsIgnoreCase("k"));
					
				} else {
					System.out.println("Kirjautuminen ep‰onnistui!");
				}} 

				while (resultSet.next()) {

					ktunnus = resultSet.getString("ktunnus");
					salasana = resultSet.getString("salasana");

				}

			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// 5. Yhteyden sulkeminen ja kyselyjen nollaus
			if (resultSet != null)
				try {
					resultSet.close();
				} catch (SQLException ignore) {
				}
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException ignore) {
				}
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException ignore) {
				}
		}

	}
}
