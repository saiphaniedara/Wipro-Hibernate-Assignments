package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;
import com.wipro.bean.Passport;


public class EmployeeDAO {
	Configuration cfg;
	SessionFactory sf;
	public EmployeeDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Passport.class);
		sf = cfg.buildSessionFactory();
	}
	public String insertEmployee(Employee e) {
		String msg = "Inserted Successfully";
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		if(e != null) {
			session.save(e);
			tx.commit();
		}
		else {
			msg = "Not Inserted";
		}
		session.close();
		return msg;		
	}
	
}
