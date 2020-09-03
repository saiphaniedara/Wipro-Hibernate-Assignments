package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Product;

public class ProductDAO {
	Configuration cfg;
	SessionFactory sf;
	public ProductDAO() {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	public String insertProduct(Product p) {
		String msg = "Inserted Successfully";
		if(p != null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(p);
			tx.commit();
			s.close();
		}
		else {
			msg = "Not Inserted";
		}
		return msg;
	}
}
