package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class FlowerDAO {
	Configuration cfg;
	SessionFactory sf;
	public FlowerDAO() {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	public String insertFlower(Flower f) {
		String msg = "Inserted Successfully";
		if(f != null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(f);
			tx.commit();
			s.close();
		}
		else {
			msg = "Not Inserted";
		}
		return msg;
	}
}
