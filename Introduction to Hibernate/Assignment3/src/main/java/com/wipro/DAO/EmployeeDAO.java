package com.wipro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;

public class EmployeeDAO {
	Configuration cfg;
	SessionFactory sf;
	public EmployeeDAO() {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}
	public String insertEmployee(Employee e) {
		String msg = "Inserted Successfully";
		if(e != null) {
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(e);
			tx.commit();
		}
		else
		{
			msg = "Not Inserted";
		}
		return msg;
	}
}
