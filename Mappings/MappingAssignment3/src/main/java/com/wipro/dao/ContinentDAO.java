package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Continent;

public class ContinentDAO {
	Configuration cfg;
	SessionFactory sf;
	public ContinentDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(Continent.class);
		sf = cfg.buildSessionFactory();
	}
	public String insertContinent(Continent cont) {
		String msg = "Inserted Successfully";
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		if(cont != null) {
			session.save(cont);
			tx.commit();
		}
		else {
			msg = "Not Inserted";
		}
		session.close();
		return msg;
	}
}
