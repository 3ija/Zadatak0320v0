package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import report.Report;
import report.impl.ReportByPredmet;
import report.impl.ReportByProfesor;
import service.ReportService;

@Service(value = "reportService")
public class ReportServiceImpl implements ReportService {

	@Autowired
	@Qualifier(value = "reportByPredmet")
	private Report predmet;
	@Autowired
	@Qualifier(value = "reportByProfesor")
	private Report profesor;
	
	private boolean byProfesoru;
	private boolean byPredmetu;
	
	
	
	public void printReport() {
		if(byPredmetu) {
			predmet.getReport();
		}
		if(byProfesoru) {
			profesor.getReport();
		}
	}

	public Report getPredmet() {
		return predmet;
	}

	public void setPredmet(Report predmet) {
		this.predmet = predmet;
	}

	public Report getProfesor() {
		return profesor;
	}

	public void setProfesor(Report profesor) {
		this.profesor = profesor;
	}

	public boolean isByProfesoru() {
		return byProfesoru;
	}

	public void setByProfesoru(boolean byProfesoru) {
		this.byProfesoru = byProfesoru;
	}

	public boolean isByPredmetu() {
		return byPredmetu;
	}

	public void setByPredmetu(boolean byPredmetu) {
		this.byPredmetu = byPredmetu;
	}

	public void enableByProfesor(boolean on, String str) {
		byProfesoru = on;
		predmet.setParam(str);
		
	}

	public void enableByPredmet(boolean on, String str) {
		byPredmetu = on;
		profesor.setParam(str);
	}

	
	
}
