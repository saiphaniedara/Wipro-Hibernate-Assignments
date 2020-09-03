package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class FlowerDAO {
	Configuration cfg;
	SessionFactory sf;
	public FlowerDAO() {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	public Flower getFlowerDetails(String fId) {
		Session s = sf.openSession();
		Flower f = s.get(Flower.class, fId);
		s.close();
		return f;
	}
}
