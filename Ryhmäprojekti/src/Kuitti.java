import java.io.FileWriter;

public class Kuitti {

	String kuitti = "src/resources/kuitti.txt";
	
	// int veloitus= ostosten hintojen haku tietokannasta
	//tämä mainiin? tulostaTiedostoon("Ostot:\n " +  + " . Summa: " + veloitus + "€.");
	
	
	public void tulostaTiedostoon(String txt) {

		try {

			FileWriter fwriter = new FileWriter(kuitti, true);
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
