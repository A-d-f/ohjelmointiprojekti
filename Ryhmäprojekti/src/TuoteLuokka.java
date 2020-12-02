

public class TuoteLuokka {
	protected int tuoteID;
	protected int hinta;
	protected int kalorit;
	protected String nimi;
	protected int tuoteryhma;

	public TuoteLuokka() {
		tuoteID=0;
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=0;
		
		
		
		}
	
	
}
class Leipa extends TuoteLuokka {
	 
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
class Tayte extends TuoteLuokka {
	
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
	System.out.println(tuoteID + " " + hinta + " " + kalorit + " " + nimi + " " + tuoteryhma + "\n");
}
}
class LisaTayte extends TuoteLuokka {
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
		System.out.println(tuoteID + " " + hinta + " " + kalorit + " " + nimi + " " + tuoteryhma + "\n");
}
}
class Kastike extends TuoteLuokka {
	
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
		System.out.println(tuoteID + " " + hinta + " " + kalorit + " " + nimi + " " + tuoteryhma + "\n");
}
}
class Juoma extends TuoteLuokka {
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
		System.out.println(tuoteID + " " + hinta + " " + kalorit + " " + nimi + " " + tuoteryhma + "\n");
}
}	