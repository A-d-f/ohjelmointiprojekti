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

		Tilaus.Tilaaja();

		do {
			System.out.println("Haluatko tilata uudelleen? k/e");
			looppaa = input.nextLine();
			if (looppaa.equalsIgnoreCase("k")) {
				Tilaus.Tilaaja();

			} else if (looppaa.equals("e")) {
				break;
			} else {
				System.out.println("Valitse k/e");
			}
		} while (!looppaa.equals("k") || !looppaa.equals("e"));

		Kuitti.tulostaTiedostoon("Yhteens�:\t\t" + Tilaus.getHinta1() + " �");
		System.out.println("Ostoksesi kuitti:");
		LueKuitti.lueTiedostosta("src/resources/kuitti.txt");
		System.out.println("Kiitos k�ynnist�, tervetuloa uudelleen");

	} // Main p��ttyy
}
