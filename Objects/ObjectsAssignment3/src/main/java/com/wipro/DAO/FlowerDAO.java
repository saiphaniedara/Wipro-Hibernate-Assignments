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
	public String UpdateFlower(String fId,int price) {
		String msg = "";
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Flower f = s.get(Flower.class,fId);
		if(f != null) {
			f.setPrice(price);
			s.saveOrUpdate(f);
			tx.commit();
			msg = "Updated Successfully";
		}
		else {
			msg = "No Flower Found";
		}
		s.close();
		return msg;
	}
}
