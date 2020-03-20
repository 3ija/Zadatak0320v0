package report.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.Dao;
import domain.Ispit;
import report.Report;

@Repository(value = "reportByProfesor")
public class ReportByProfesor implements Report {

	private String prof;

	public ReportByProfesor() {

	}

	public void setParam(String prof) {
		this.prof = prof;
	}

	public void getReport() {
		List<Ispit> ispiti = Dao.ispiti;
		System.out.println("-----REPORT BY PROFESOR-----");
		for (Ispit ispit : ispiti) {
			if (ispit.getSifra_nastavnika().equalsIgnoreCase(this.prof)) {
				System.out.println(ispit);
			}
		}
	}

}