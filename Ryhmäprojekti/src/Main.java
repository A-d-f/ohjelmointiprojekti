import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String vastaus;
		int valinta;
		String id = "Jtn";
		int n, h, k;
		h = 0;
		k = 0;
		
		
		tietotuonti.set = 1;
		tietotuonti.tiedot();
		System.out.println("valitse leip‰");
		valinta=Integer.parseInt(in.nextLine());
		n = valinta;
		tietotuonti.asetaValinta = n;
		System.out.println("Valinta:");
		tietotuonti.tiedot1();
		System.out.println("\n");
		Leipa leipa = new Leipa(n, id, h, k);
		leipa.tulosta();
		
		
		
		tietotuonti.set = 2;
		tietotuonti.tiedot();
		System.out.println("Valitse t‰yte");
		vastaus=in.nextLine();
//		  for (int i = 0 ; i < 1000; i++) { //looppi tietojen vienti√§ varten
//		  tietovienti.vietieto(); } 
		
		tulostaOtsikko();
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







