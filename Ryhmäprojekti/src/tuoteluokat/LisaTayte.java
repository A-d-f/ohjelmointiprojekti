package tuoteluokat;

public class LisaTayte extends TuoteLuokka {
	public LisaTayte() {
		tuoteID=0;
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=3;
	}
	public LisaTayte(int ID,String n, int h, int k) {
		tuoteID=ID;
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=3;
	}
	public void tulosta() {
		System.out.println("Nimi\t\tHinta\t\tKalorit\n" + nimi+ "\t" + hinta + "\t\t" + kalorit + "\n");
	}
}
