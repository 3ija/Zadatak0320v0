package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import domain.Ispit;
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
		ispiti.add(new Ispit("0", "0", "0", "0", 1));
		ispiti.add(new Ispit("0", "1", "1", "1", 2));
		ispiti.add(new Ispit("1", "0", "1", "2", 3));
		ispiti.add(new Ispit("1", "1", "0", "1", 4));
	}
	
	
}
