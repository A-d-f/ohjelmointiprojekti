import java.util.Scanner;

import kuitti.Kuitti;
import otsikko.Otsikko;
import tietojen_tuominen.tietotuonti;
import tuoteluokat.*;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String vastaus;
		int valinta;
		String n;
		int id, h, k;
		
		
		System.out.println("Tuletko asiakkaana(a) vai ylläpitäjänä(y)?");
		vastaus=in.nextLine();
		
		if (vastaus.equalsIgnoreCase("y")) {
			
			//tähän väliin kirjautuminen
			
			tietovienti.vietieto();
		
		}else {
		Otsikko.tulostaOtsikko();
		
		
		tietotuonti.set = 1;
		tietotuonti.tiedot();
		System.out.println("valitse leivän numero");
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		Leipa leipa = new Leipa(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//leipa.tulosta();
		int leipakalorit = k;
		int leipah=h;
		String leipaname = n;
		
		tietotuonti.set = 2;
		tietotuonti.tiedot();
		System.out.println("Valitse täytteen numero");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		
		Tayte tayte = new Tayte(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//tayte.tulosta();
		int taytekalorit = k;
		int tayteh = h;
		String taytename = n;
		
		tietotuonti.set = 3;
		tietotuonti.tiedot();
		System.out.println("Valitse lisätäytteen numero");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		
		LisaTayte lisatayte = new LisaTayte(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//lisatayte.tulosta();
		int lisataytekalorit = k;
		int lisatayteh = h;
		String lisataytename = n;
		
		tietotuonti.set = 4;
		tietotuonti.tiedot();
		System.out.println("Valitse kastikkeen numero");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		
		Kastike kastike = new Kastike(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//kastike.tulosta();
		int kastikekalorit = k;
		int kastikeh = h;
		String kastikename = n;
		
		tietotuonti.set = 5;
		tietotuonti.tiedot();
		System.out.println("Valitse juoman numero");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		
		Juoma juoma = new Juoma(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//juoma.tulosta();
		int juomakalorit = k;
		int juomah = h;
		String juomaname = n;
		
		
		//System.out.println("leipä: " + leipäkalorit + " täyte : " + täytekalorit + " yht: " + (leipäkalorit+täytekalorit));
		
//		  for (int i = 0 ; i < 1000; i++) { //looppi tietojen vientiÃ¤ varten
//		  tietovienti.vietieto(); } 
		
		
		System.out.println("\n" + "Haluatko tilata sämpylän?(k/e)?");
		
		vastaus = in.nextLine();
		if (vastaus.equalsIgnoreCase("k")) {
		System.out.println("tilaa");
		System.out.println("Ostoksesi tekee yhteensä: " +(leipah+tayteh+lisatayteh+kastikeh+juomah)+ " €");
		Kuitti.tulostaTiedostoon(" Ostot: \n" + leipaname+ "\t\t"+leipah+",-\n"+taytename+"\t\t"+tayteh+",-\n"+lisataytename+"\t\t"+lisatayteh+",-\n"+kastikename+"\t\t"+kastikeh+",-\n"+juomaname+"\t\t"+juomah+ ",-\nVeloitettu:\t\t"+ (leipah+ tayteh+lisatayteh+kastikeh+juomah)
		+ "€.");
		} else {
			System.out.println("ei sitten");
			}
		
		} 
	}
	
} // Main päättyy







