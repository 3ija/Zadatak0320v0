package domain;

import org.springframework.stereotype.Component;

@Component
public class Ispit {

	private String sifra_roka;
	private String sifra_predmet;
	private String sifra_nastavnika;
	private String sifra_studenta;
	private int ocena;
	
	public Ispit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ispit(String sifra_roka, String sifra_predmet, String sifra_nastavnika, String sifra_studenta, int ocena) {
		super();
		this.sifra_roka = sifra_roka;
		this.sifra_predmet = sifra_predmet;
		this.sifra_nastavnika = sifra_nastavnika;
		this.sifra_studenta = sifra_studenta;
		this.ocena = ocena;
	}
	public String getSifra_roka() {
		return sifra_roka;
	}
	public void setSifra_roka(String sifra_roka) {
		this.sifra_roka = sifra_roka;
	}
	public String getSifra_predmet() {
		return sifra_predmet;
	}
	public void setSifra_predmet(String sifra_predmet) {
		this.sifra_predmet = sifra_predmet;
	}
	public String getSifra_nastavnika() {
		return sifra_nastavnika;
	}
	public void setSifra_nastavnika(String sifra_nastavnika) {
		this.sifra_nastavnika = sifra_nastavnika;
	}
	public String getSifra_studenta() {
		return sifra_studenta;
	}
	public void setSifra_studenta(String sifra_studenta) {
		this.sifra_studenta = sifra_studenta;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	@Override
	public String toString() {
		return "Ispit [sifra_roka=" + sifra_roka + ", sifra_predmet=" + sifra_predmet + ", sifra_nastavnika="
				+ sifra_nastavnika + ", sifra_studenta=" + sifra_studenta + ", ocena=" + ocena + "]";
	}
	
	
	
	
}
