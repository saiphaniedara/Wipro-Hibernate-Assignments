package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;

public class CarDetailsDAO {
	Configuration cfg;
	SessionFactory sf;
	public CarDetailsDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(CarDetails.class);
		sf = cfg.buildSessionFactory();
	}
	public String insertDetails(CarDetails cd) {
		String msg = "Inserted Successfully";
		if(cd != null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(cd);
			tx.commit();
			s.close();
		}
		else {
			msg = "Not Inserted";
		}
		return msg;
	}
}
