package tuoteluokat;

 public class Kastike extends TuoteLuokka {
	
	public Kastike() {
		tuoteID=0;
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=4;
	}
	public Kastike(int ID,String n, int h, int k) {
		tuoteID=ID;
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=4;
	}
	public void tulosta() {
		System.out.println("Nimi\t\tHinta\t\tKalorit\n" + nimi+ "\t" + hinta + "\t\t" + kalorit + "\n");
	}
}
