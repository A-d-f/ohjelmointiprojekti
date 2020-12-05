package tuoteluokat;

public class Leipa extends TuoteLuokka {
	private static int hinta;
	 public static int leipahinta = hinta;
	
	 
	 
	public Leipa() {
		tuoteID=0;
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=1;
	}
	public Leipa(int ID,String n, int h, int k) {
		tuoteID=ID;
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=1;
		
	}
	public void tulosta() {
		System.out.println(tuoteID + " " + hinta + " " + kalorit + " " + nimi + " " + tuoteryhma + "\n");
	}
	
}