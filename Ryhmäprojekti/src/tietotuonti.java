import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class tietotuonti {
static Connection connection = null; 
static Statement statement = null;  
static ResultSet resultSet = null;
static int set;
static int asetaValinta;
// Yhteyden tiedot
static String db = "trtkp20a3";
static String url = "jdbc:mysql://shell.hamk.fi/"+db+"?useSSL=false";
static String username = "trtkp20a3";
static String password = "trtkp20a3passwd";

// Tietokannan taulun kentät tulostusta varten
private static int tuote_id;
private static String nimi;
private static int hinta;
private static int kalorit;
private static int tuoteryhma;
private static String nimi1;
private static int hinta1;
private static int kalorit1;


static String valinta;
static String valitse;

public static int gethinta() {
	int getHinta= hinta1;
	return getHinta;
}
public static int getKalorit() {
	int getKalorit= kalorit1;
	return getKalorit;
}
public static String getNimi() {
	String getNimi= nimi1;
	return getNimi;
}


public static void tiedot() {
try {
	Scanner input = new Scanner(System.in);
	// 1. yhteys
	connection = DriverManager.getConnection(url, username, password);
	
	// 2. MySQL-kysely
	statement = connection.createStatement();
	int ryhm = set;
		
	
	String querySelect = "SELECT * FROM ryhmä10_taulu WHERE tuoteryhma =" + ryhm;
	
	
	
	
	// 3. Suoritetaan kysely
	resultSet = statement.executeQuery(querySelect);
	
	// 4. Vastauksen käsittely
	System.out.println("Num\tNimi\t\tHinta\tKalorit");
	
	while (resultSet.next()) {
		
		tuote_id = resultSet.getInt("tuote_id");
		nimi = resultSet.getString("nimi");
		hinta = resultSet.getInt("hinta");
		kalorit = resultSet.getInt("kalorit");
		tuoteryhma = resultSet.getInt("tuoteryhma");
		System.out.println(tuote_id + "\t" + nimi + "\t" + hinta + "\t" + kalorit);
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

	
}
public static void tiedot1() {
try {
	Scanner input = new Scanner(System.in);
	// 1. yhteys
	connection = DriverManager.getConnection(url, username, password);
	
	// 2. MySQL-kysely
	statement = connection.createStatement();
	int valitse = asetaValinta;
		
	
	
	String query = "SELECT * FROM ryhmä10_taulu where tuote_id =" + valitse;
	
	
	
	// 3. Suoritetaan kysely
	resultSet = statement.executeQuery(query);
	
	// 4. Vastauksen käsittely
	System.out.println("Num\tNimi\t\tHinta\tKalorit");
	
	while (resultSet.next()) {
		
		tuote_id = resultSet.getInt("tuote_id");
		nimi1 = resultSet.getString("nimi");
		hinta1 = resultSet.getInt("hinta");
		kalorit1 = resultSet.getInt("kalorit");
		tuoteryhma = resultSet.getInt("tuoteryhma");
		System.out.println(tuote_id + "\t" + nimi1 + "\t" + hinta1 + "\t" + kalorit1);
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

