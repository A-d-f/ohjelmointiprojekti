package ylläpito;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Kirjautuminen {

	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	static String db = "trtkp20a3";
	static String url = "jdbc:mysql://shell.hamk.fi/" + db + "?useSSL=false";
	static String username = "trtkp20a3";
	static String password = "trtkp20a3passwd";
	private static String ktunnus;
	private static String salasana;

	public static void tiedot() {

		Scanner in = new Scanner(System.in);
		System.out.println("Anna käyttäjätunnus:");
		String vastausk = in.nextLine();
		System.out.println("Anna salasana:");
		String vastauss = in.nextLine();

		try {

			// 1. yhteys
			connection = DriverManager.getConnection(url, username, password);

			// 2. MySQL-kysely
			statement = connection.createStatement();

			String querySelect = "SELECT ktunnus, salasana FROM ryhmä10_taulu_02";
			// 3. Suoritetaan kysely
			ResultSet resultSet = statement.executeQuery(querySelect);
			while (resultSet.next()) {
				String kayttaja = resultSet.getString("ktunnus");
				String salas = resultSet.getString("salasana");

				// 4. Vastauksen käsittely
				System.out.println("Kirjautuminen käynnissä");

				if (vastausk.equals(kayttaja) || vastauss.equals(salas)) {
					tietovienti.vietieto();
				} else {
					System.out.println("Kirjautuminen epäonnistui!");
				}

				while (resultSet.next()) {

					ktunnus = resultSet.getString("ktunnus");
					salasana = resultSet.getString("salasana");

				}

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
