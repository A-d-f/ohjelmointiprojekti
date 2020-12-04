package kayttoliittyma;

import tuoteluokat.Leipa;
import java.util.Scanner;

public class KantaAsiakas {

	public static double alennus() {
		int hinta = Tilaus.getHinta();
		double alennettu = (hinta * 0.9);
		return alennettu;
	}

}
