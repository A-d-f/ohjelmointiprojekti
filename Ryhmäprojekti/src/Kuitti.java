import java.io.FileWriter;

public class Kuitti {

	static String kuitti = "src/resources/kuitti.txt";
	
	// int veloitus= ostosten hintojen haku tietokannasta
	//tämä mainiin? tulostaTiedostoon("Ostot:\n " +  + " . Summa: " + veloitus + "€.");
	
	
	public void tulostaTiedostoon(String txt, String kuitti) {

		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(kuitti, true);
			fwriter.write(date.toString());
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
