import java.util.Scanner;

import kayttoliittyma.Tilaus;
import kuitti.Kuitti;
import kuitti.LueKuitti;
import otsikko.Otsikko;
import yll�pito.tietovienti;

public class Main {
	public static void main(String[] args) {
		String looppaa;
		
		Otsikko.tulostaOtsikko();
		Scanner input = new Scanner(System.in);
//		  for (int i = 0 ; i < 1000; i++) { //looppi tietojen vientiä varten
//		  tietovienti.vietieto(); } 
		Kuitti.TulostaPaivamaara();
			
		do {	
		Tilaus.Tilaaja(); 
		
		System.out.println("Haluatko tilata uudelleen? k/e");
		looppaa = input.nextLine();
		} while (looppaa.equalsIgnoreCase("k"));
			
		Kuitti.tulostaTiedostoon("Yhteens�:\t\t" + Tilaus.getHinta1() +" �");
		LueKuitti.lueTiedostosta("src/resources/kuitti.txt");
		System.out.println("Kiitos k�ynnist�, tervetuloa uudelleen");

} // Main p��ttyy
}	








