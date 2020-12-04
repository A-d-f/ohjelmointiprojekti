package kuitti;

import java.io.*;

public class LueKuitti {

	

	public static void lueTiedostosta(String filename) {
		String txt = "";
		try {
			
			FileReader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			 String line;
             while ((line = br.readLine()) != null) {
                 txt = txt + line + "\n";
             }
			System.out.println(txt);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
