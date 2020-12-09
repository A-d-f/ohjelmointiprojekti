package kayttoliittyma;

import java.util.Scanner;

import kuitti.Kuitti;
import kuitti.LueKuitti;
import otsikko.Otsikko;
import tietojen_tuominen.tietotuonti;
import tuoteluokat.Juoma;
import tuoteluokat.Kastike;
import tuoteluokat.Leipa;
import tuoteluokat.LisaTayte;
import tuoteluokat.Tayte;
import ylläpito.Kirjautuminen;

public class Tilaus {
	protected static int juomah, leipah, kastikeh, tayteh, lisatayteh, hinta1;

	public static void Tilaaja() {

		Scanner in = new Scanner(System.in);
		String vastaus;
		int valinta;
		String n;
		int id, h, k;
		String looppaa;
		System.out.println("Tuletko asiakkaana(a) vai ylläpitäjänä(y)?");
		vastaus = in.nextLine();
		String jatka;
		if (vastaus.equalsIgnoreCase("y")) {

			Kirjautuminen.tiedot();
			// tähän väliin kirjautuminen

		}

		tietotuonti.set = 1;

		while (true) {
			try {
				tietotuonti.tiedot();
				System.out.println("valitse leivän numero");
				valinta = Integer.parseInt(in.nextLine());
				if (valinta >= 1 && valinta <= tietotuonti.vaihtoehtojenmaara ) {
					break;
				}
				System.out.println("et valinnut valitse listalla olevista tuotteista, valitse uudelleen.");

			} catch (Exception e) {
				System.out.println("et valinnut listalla olevista tuotteista, valitse uudelleen.");
			}
		}

		id = valinta;
		tietotuonti.asetaValinta = id;

		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		Leipa leipa = new Leipa(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(),
				k = tietotuonti.getKalorit());
		leipa.tulosta();
		
		int leipakalorit = k;
		leipah = h;
		String leipaname = n;

		tietotuonti.set = 2;

		while (true) {
			try {
				tietotuonti.tiedot();
				System.out.println("Valitse täytteen numero");
				valinta = Integer.parseInt(in.nextLine());
				if (valinta >= 1 && valinta <= tietotuonti.vaihtoehtojenmaara) {
					break;
				}
				System.out.println("et valinnut valitse listalla olevista tuotteista, valitse uudelleen.");

			} catch (Exception e) {
				System.out.println("et valinnut listalla olevista tuotteista, valitse uudelleen.");
			}
		}

		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		

		Tayte tayte = new Tayte(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(),
				k = tietotuonti.getKalorit());
		tayte.tulosta();
		int taytekalorit = k;
		tayteh = h;
		String taytename = n;

		tietotuonti.set = 3;
		while (true) {
			try {
				tietotuonti.tiedot();
				System.out.println("Valitse lisätäytteen numero");
				valinta = Integer.parseInt(in.nextLine());
				if (valinta >= 1 && valinta <= tietotuonti.vaihtoehtojenmaara) {
					break;
				}
				System.out.println("et valinnut valitse listalla olevista tuotteista, valitse uudelleen.");

			} catch (Exception e) {
				System.out.println("et valinnut listalla olevista tuotteista, valitse uudelleen.");
			}
		}

		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		

		LisaTayte lisatayte = new LisaTayte(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(),
				k = tietotuonti.getKalorit());
		lisatayte.tulosta();
		int lisataytekalorit = k;
		lisatayteh = h;
		String lisataytename = n;

		tietotuonti.set = 4;
		while (true) {
			try {
				tietotuonti.tiedot();
				System.out.println("Valitse kastikkeen numero");
				valinta = Integer.parseInt(in.nextLine());
				if (valinta >= 1 && valinta <= tietotuonti.vaihtoehtojenmaara) {
					break;
				}
				System.out.println("et valinnut valitse listalla olevista tuotteista, valitse uudelleen.");

			} catch (Exception e) {
				System.out.println("et valinnut listalla olevista tuotteista, valitse uudelleen.");
			}
		}

		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		

		Kastike kastike = new Kastike(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(),
				k = tietotuonti.getKalorit());
		kastike.tulosta();
		int kastikekalorit = k;
		kastikeh = h;
		String kastikename = n;

		tietotuonti.set = 5;
		while (true) {
			try {
				tietotuonti.tiedot();
				System.out.println("Valitse juoman numero");
				valinta = Integer.parseInt(in.nextLine());
				if (valinta >= 1 && valinta <= tietotuonti.vaihtoehtojenmaara) {
					break;
				}
				System.out.println("et valinnut valitse listalla olevista tuotteista, valitse uudelleen.");

			} catch (Exception e) {
				System.out.println("et valinnut listalla olevista tuotteista, valitse uudelleen.");
			}
		}
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		

		Juoma juoma = new Juoma(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(),
				k = tietotuonti.getKalorit());
		juoma.tulosta();

		int juomakalorit = k;
		juomah = h;

		String juomaname = n;
		
		System.out.println("Annoksen kalorit \nleipä: " + leipakalorit + " \ntäytteet : "
				+ (taytekalorit + lisataytekalorit + kastikekalorit) + " \njuoma: " + juomakalorit + " \nkalorit yht: "
				+ (leipakalorit + taytekalorit + lisataytekalorit + kastikekalorit + juomakalorit));

		System.out.println(
				"Leipäsi hinta on: " + (juomah + leipah + kastikeh + lisatayteh + tayteh) + " €" + "\n" + "\n");
		System.out.println("Haluatko vahvistaa tilauksen?(k/e)?");

		vastaus = in.nextLine();
		if (vastaus.equalsIgnoreCase("k")) {
			System.out.println("tilaus käynnissä");

			Kuitti.tulostaTiedostoon("Leipä: \n" + leipaname + "\t\t" + leipah + ",-\n" + taytename + "\t\t" + tayteh
					+ ",-\n" + lisataytename + "\t\t" + lisatayteh + ",-\n" + kastikename + "\t\t" + kastikeh + ",-\n"
					+ juomaname + "\t\t" + juomah + ",-" + "\n" + "Leivän hinta:" + "\t\t"
					+ (juomah + leipah + kastikeh + lisatayteh + tayteh) + " € \n");
			getHinta();

		} else {
			System.out.println("ei sitten");
		}

	} // main loppuu
//	  for (int i = 0 ; i < 1000; i++) { //looppi tietojen vientiÃ¤ varten
//	  tietovienti.vietieto(); } 

	public static int getHinta() {
		int yhteensa = (juomah + leipah + kastikeh + lisatayteh + tayteh);
		hinta1 = hinta1 + yhteensa;
		return hinta1;

	}

	public static int getHinta1() {
		int summa = hinta1;
		return summa;
	}

}
