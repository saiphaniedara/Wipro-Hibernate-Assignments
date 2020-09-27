package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;
import com.wipro.bean.MultiCarOwner;

public class CarOwnerDAO {
	Configuration cfg;
	SessionFactory sf;
	public CarOwnerDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(MultiCarOwner.class).addAnnotatedClass(CarDetails.class);
		sf = cfg.buildSessionFactory();
	}
	public String insertCarOwnerDetails(MultiCarOwner mco) {
		String msg = "Inserted Successfully";
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		if(mco != null) {
			s.save(mco);
			tx.commit();
		}
		else {
			msg = "Not Inserted";
		}
		s.close();
		return msg;
	}
}
