package service;

public interface ReportService {

	void enableByProfesor(boolean on, String str);
	void enableByPredmet(boolean on, String str);
	void printReport();
	
}
