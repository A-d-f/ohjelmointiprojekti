package kuitti;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Kuitti {

	static String kuitti = "src/resources/kuitti.txt";
	
	public static void tulostaTiedostoon(String txt) {

		try {
			FileWriter fwriter = new FileWriter(kuitti, true);
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void TulostaPaivamaara() {
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(kuitti, false);
			fwriter.write(date.toString());
			fwriter.write("\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	} 
	

