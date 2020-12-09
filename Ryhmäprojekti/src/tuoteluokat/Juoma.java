package tuoteluokat;

public class Juoma extends TuoteLuokka {
	public Juoma() {
		tuoteID=0;
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=5;
	}
	public Juoma(int ID,String n, int h, int k) {
		tuoteID=ID;
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=5;
	}
	public void tulosta() {
		System.out.println("Nimi\t\tHinta\t\tKalorit\n" + nimi+ "\t" + hinta + "\t\t" + kalorit + "\n");
	}
}	