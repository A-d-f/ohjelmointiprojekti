import java.util.Scanner;

import kayttoliittyma.Tilaus;
import otsikko.Otsikko;
import ylläpito.tietovienti;

public class Main {
	public static void main(String[] args) {
		String looppaa;
		Otsikko.tulostaOtsikko();
		Scanner input = new Scanner(System.in);
//		  for (int i = 0 ; i < 1000; i++) { //looppi tietojen vientiÃ¤ varten
//		  tietovienti.vietieto(); } 

			
		do {	
		Tilaus.Tilaaja(); 
		
		System.out.println("Haluatko tilata uudelleen? k/e");
		looppaa = input.nextLine();
		} while (looppaa.equalsIgnoreCase("k"));
			

		System.out.println("Kiitos käynnistä, tervetuloa uudelleen");

} // Main päättyy
}	








