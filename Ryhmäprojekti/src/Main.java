import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String vastaus;
		int valinta;
		String n;
		int id, h, k;
		
		tulostaOtsikko();
		
		tietotuonti.set = 1;
		tietotuonti.tiedot();
		System.out.println("valitse leip‰");
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		Leipa leipa = new Leipa(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//leipa.tulosta();
		int leipakalorit = k;
		
		tietotuonti.set = 2;
		tietotuonti.tiedot();
		System.out.println("Valitse t‰yte");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		
		Tayte tayte = new Tayte(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//tayte.tulosta();
		int taytekalorit = k;
		
		tietotuonti.set = 3;
		tietotuonti.tiedot();
		System.out.println("Valitse lis‰t‰yte");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		
		LisaTayte lisatayte = new LisaTayte(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//lisatayte.tulosta();
		int lisataytekalorit = k;
		
		tietotuonti.set = 4;
		tietotuonti.tiedot();
		System.out.println("Valitse lis‰t‰yte");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		
		Kastike kastike = new Kastike(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//kastike.tulosta();
		int kastikekalorit = k;
		
		tietotuonti.set = 5;
		tietotuonti.tiedot();
		System.out.println("Valitse lis‰t‰yte");
		
		valinta=Integer.parseInt(in.nextLine());
		id = valinta;
		tietotuonti.asetaValinta = id;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		
		Juoma juoma = new Juoma(id, n = tietotuonti.getNimi(), h = tietotuonti.gethinta(), k =tietotuonti.getKalorit());
		//juoma.tulosta();
		int juomakalorit = k;
		
		
		//System.out.println("leip‰: " + leip‰kalorit + " t‰yte : " + t‰ytekalorit + " yht: " + (leip‰kalorit+t‰ytekalorit));
		
//		  for (int i = 0 ; i < 1000; i++) { //looppi tietojen vienti√§ varten
//		  tietovienti.vietieto(); } 
		
		
		System.out.println("\n" + "Haluatko tilata s‰mpyl‰n?(k/e)?");
		
		vastaus = in.nextLine();
		if (vastaus.equalsIgnoreCase("k")) {
		System.out.println("tilaa");
		} else {
			System.out.println("ei sitten");
		}
		
		
	}
	


	public static void tulostaOtsikko() {
		System.out.println("__________         __                 __   .__.__               .__          \r\n"
				+ "\\______   \\_____ _/  |_  ____   ____ |  | _|__|  |  __ __  ____ |  | _____   \r\n"
				+ " |     ___/\\__  \\\\   __\\/  _ \\ /    \\|  |/ /  |  | |  |  \\/  _ \\|  | \\__  \\  \r\n"
				+ " |    |     / __ \\|  | (  <_> )   |  \\    <|  |  |_|  |  (  <_> )  |__/ __ \\_\r\n"
				+ " |____|    (____  /__|  \\____/|___|  /__|_ \\__|____/____/ \\____/|____(____  /\r\n"
				+ "                \\/                 \\/     \\/                              \\/");
	}
} // Main p√§√§ttyy







