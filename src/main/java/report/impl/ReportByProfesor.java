package report.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.Dao;
import domain.Ispit;
import domain.Predmet;
import domain.Profesor;
import report.Report;

@Repository(value = "reportByProfesor")
public class ReportByProfesor implements Report {

	private Profesor prof;

	public ReportByProfesor() {

	}

	public void getReport() {
		List<Ispit> ispiti = Dao.ispiti;
		System.out.println("-----REPORT BY PROFESOR-----");
		for (Ispit ispit : ispiti) {
			try {
				if (ispit.getSifra_nastavnika().getSifra().equals(this.prof.getSifra())) {
					System.out.println(ispit);
				}
			} catch (Exception e) {

			}
		}
	}

	public void setParam(Object prof) {
		this.prof = (Profesor) prof;
	}

}