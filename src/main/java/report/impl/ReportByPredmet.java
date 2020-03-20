package report.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.Dao;
import domain.Ispit;
import report.Report;

@Repository(value = "reportByPredmet")
public class ReportByPredmet implements Report {

	private String predmet;
	
	public ReportByPredmet() {
		
	}
	
	public void setParam(String predmet) {
		this.predmet = predmet;
	}
	
	public void getReport() {
		List<Ispit> ispiti = Dao.ispiti;
		System.out.println("-----REPORT BY PREDMET-----");
		for(Ispit ispit : ispiti) {
			if(ispit.getSifra_predmet().equalsIgnoreCase(this.predmet)) {
				System.out.println(ispit);
			}
		}
	}

}
