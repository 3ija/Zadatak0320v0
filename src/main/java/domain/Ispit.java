package domain;

import org.springframework.stereotype.Component;

@Component
public class Ispit {

	private Rok sifra_roka;
	private Predmet sifra_predmet;
	private Profesor sifra_nastavnika;
	private Student sifra_studenta;
	private Ocena ocena;
	public Rok getSifra_roka() {
		return sifra_roka;
	}
	public void setSifra_roka(Rok sifra_roka) {
		this.sifra_roka = sifra_roka;
	}
	public Predmet getSifra_predmet() {
		return sifra_predmet;
	}
	public void setSifra_predmet(Predmet sifra_predmet) {
		this.sifra_predmet = sifra_predmet;
	}
	public Profesor getSifra_nastavnika() {
		return sifra_nastavnika;
	}
	public void setSifra_nastavnika(Profesor sifra_nastavnika) {
		this.sifra_nastavnika = sifra_nastavnika;
	}
	public Student getSifra_studenta() {
		return sifra_studenta;
	}
	public void setSifra_studenta(Student sifra_studenta) {
		this.sifra_studenta = sifra_studenta;
	}
	public Ocena getOcena() {
		return ocena;
	}
	public void setOcena(Ocena ocena) {
		this.ocena = ocena;
	}
	public Ispit(Rok sifra_roka, Predmet sifra_predmet, Profesor sifra_nastavnika, Student sifra_studenta,
			Ocena ocena) {
		super();
		this.sifra_roka = sifra_roka;
		this.sifra_predmet = sifra_predmet;
		this.sifra_nastavnika = sifra_nastavnika;
		this.sifra_studenta = sifra_studenta;
		this.ocena = ocena;
	}
	@Override
	public String toString() {
		return "Ispit [sifra_roka=" + sifra_roka + ", sifra_predmet=" + sifra_predmet + ", sifra_nastavnika="
				+ sifra_nastavnika + ", sifra_studenta=" + sifra_studenta + ", ocena=" + ocena + "]";
	}
	
	
	
	
}
