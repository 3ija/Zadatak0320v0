package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import domain.Ispit;
import domain.Ocena;
import domain.Predmet;
import domain.Profesor;
import domain.Rok;
import domain.Student;
@Component
public class Dao {

	private List<Ispit> objIspiti;
	
	
	
	public List<Ispit> getObjIspiti() {
		return objIspiti;
	}

	public void setObjIspiti(List<Ispit> objIspiti) {
		this.objIspiti = objIspiti;
	}

	public static List<Ispit> ispiti = new ArrayList<Ispit>();
	
	static {
		Predmet p1 = new Predmet();
		p1.setSifra("0");
		Predmet p2 = new Predmet();
		p2.setSifra("1");
		Profesor pr1 = new Profesor();
		pr1.setSifra("0");
		Profesor pr2 = new Profesor();
		pr2.setSifra("1");
		Rok r1 = new Rok();
		r1.setSifra("0");
		Ocena o = new Ocena();
		o.setSifra("10");
		Student s=new Student();
		s.setSifra("201");
		ispiti.add(new Ispit(r1,p1,pr1,s,o));
		ispiti.add(new Ispit(r1,p1,pr2,s,o));
		ispiti.add(new Ispit(r1,p2,pr1,s,o));
		ispiti.add(new Ispit(r1,p2,pr2,s,o));
	}
	
	
}
