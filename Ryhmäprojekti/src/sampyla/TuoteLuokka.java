package sampyla;

public class TuoteLuokka {
	protected int hinta;
	protected int kalorit;
	protected String nimi;
	protected int tuoteryhma;

	public TuoteLuokka() {
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=0;
		}
	
}
class Leipa extends TuoteLuokka {
	 
	public Leipa() {
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=1;
	}
	public Leipa(String n, int h, int k) {
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=1;
	}
	
}
class Tayte extends TuoteLuokka {
	
	public Tayte() {
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=2;
	}
	public Tayte(String n, int h, int k) {
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=2;
	}
}
class LisaTayte extends TuoteLuokka {
	public LisaTayte() {
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=3;
	}
	public LisaTayte(String n, int h, int k) {
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=3;
	}
}

class Kastike extends TuoteLuokka {
	
	public Kastike() {
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=4;
	}
	public Kastike(String n, int h, int k) {
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=4;
	}
}
class Juoma extends TuoteLuokka {
	public Juoma() {
		hinta=0;
		kalorit=0;
		nimi="";
		tuoteryhma=5;
	}
	public Juoma(String n, int h, int k) {
		hinta=h;
		kalorit=k;
		nimi=n;
		tuoteryhma=5;
	}
}	