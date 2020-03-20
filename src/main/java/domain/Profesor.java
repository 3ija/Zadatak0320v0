package domain;

import org.springframework.stereotype.Component;

@Component
public class Profesor {

	private String sifra;

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	@Override
	public String toString() {
		return "Profesor [sifra=" + sifra + "]";
	}
	
	
	
}
