package sampyla;

public class SampylaLuokka {
	private int hinta;
	private int kalorimaara;
	private String nimi;
	

	public SampylaLuokka() {
		hinta=0;
		kalorimaara=0;
		nimi="";
		}
	public SampylaLuokka(String n,int h, int k) {
		hinta = h;
		kalorimaara=k;
		nimi= n;}
}
