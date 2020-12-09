package tuoteluokat;

public class Tayte extends TuoteLuokka {
	
	public Tayte() {
		tuoteID=0;
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=2;
	}
	public Tayte(int ID,String n, int h, int k) {
		tuoteID=ID;
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=2;
	}
	public void tulosta() {
		System.out.println("Nimi\t\tHinta\t\tKalorit\n" + nimi+ "\t" + hinta + "\t\t" + kalorit + "\n");
	}
}