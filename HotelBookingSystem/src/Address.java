
public class Address {
	private String stadt; 
	private String strasse;
	private int wohnNummer, potsleitzahl;
	
	
	
	public String getName() {
		return stadt;
	}
	public void setName(String stadt) {
		this.stadt = stadt;
	}
	public int getWohnNummer() {
		return wohnNummer;
	}
	public void setWohnNummer(int wohnNummer) {
		this.wohnNummer = wohnNummer;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getPotsleitzahl() {
		return potsleitzahl;
	}
	public void setPotsleitzahl(int potsleitzahl) {
		this.potsleitzahl = potsleitzahl;
	}
	
	

}
