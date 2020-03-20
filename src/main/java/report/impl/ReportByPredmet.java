package report.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.Dao;
import domain.Ispit;
import domain.Predmet;
import report.Report;

@Repository(value = "reportByPredmet")
public class ReportByPredmet implements Report {

	private Predmet predmet;
	
	public ReportByPredmet() {
		
	}

	
	public void getReport() {
		List<Ispit> ispiti = Dao.ispiti;
		System.out.println("-----REPORT BY PREDMET-----");
		for(Ispit ispit : ispiti) {
			if(ispit.getSifra_predmet().getSifra().equals(this.predmet.getSifra())) {
				System.out.println(ispit);
			}
		}
	}

	public void setParam(Object predmet) {
		this.predmet = (Predmet) predmet;
		
	}


}
