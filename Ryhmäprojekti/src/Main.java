import java.util.Scanner;

import kayttoliittyma.Tilaus;
import otsikko.Otsikko;

public class Main {
	public static void main(String[] args) {
		String looppaa;
		Otsikko.tulostaOtsikko();
		Scanner input = new Scanner(System.in);
		try {
			
		do {	
		Tilaus.Tilaaja(); 
		
		System.out.println("Haluatko tilata uudelleen? k/e");
		looppaa = input.nextLine();
		} while (looppaa.equalsIgnoreCase("k"));
			
		
		} catch (Exception e) {
			System.out.println("Joku meni vikaan");
		}
		System.out.println("Kiitos k‰ynnist‰, tervetuloa uudelleen");
	} }
	
 // Main p‰‰ttyy







