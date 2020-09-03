package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Emp;

public class EmpDAO {
	Configuration cfg;
	SessionFactory sf;
	public EmpDAO() {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	public String insertEmployee(Emp e) {
		String msg = "Inserted Successfully";
		if(e != null) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e);
		tx.commit();
		s.close();
		}
		else
		{
			msg = "Not Inserted";
		}
		return msg;
	}
}
