package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Address;
import com.wipro.bean.Employee;

public class EmployeeDAO {
	Configuration cfg;
	SessionFactory sf;
	public EmployeeDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		sf = cfg.buildSessionFactory();
	}
	public String insertEmployee(Employee e) {
		String msg;
		if(e != null) {
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.save(e);
			tx.commit();
			session.close();
			msg = "Inserted Successfully";
		}
		else {
			msg = "Not Inserted";
		}
		return msg;
	}
}
