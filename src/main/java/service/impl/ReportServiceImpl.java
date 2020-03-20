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

	private boolean byProfesor, byPredmet;

	public Report printReport(Object obj) {
		if (obj.getClass().getSimpleName().equalsIgnoreCase("Predmet")) {
			predmet.setParam(obj);
			return predmet;
		} else if (obj.getClass().getSimpleName().equalsIgnoreCase("Profesor")) {
			profesor.setParam(obj);
			return profesor;
		}
		return null;
	}



}
