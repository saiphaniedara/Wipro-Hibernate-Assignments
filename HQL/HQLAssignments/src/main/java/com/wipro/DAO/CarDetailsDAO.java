package com.wipro.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.CarDetails;

public class CarDetailsDAO {
	Configuration cfg;
	SessionFactory sf;
	public CarDetailsDAO() {
		cfg = new Configuration().configure().addAnnotatedClass(CarDetails.class);
		sf = cfg.buildSessionFactory();
	}
	public void displayAllCarDetails() {
		Session s = sf.openSession();
		Query<CarDetails> query = s.createQuery("from CarDetails");
		List<CarDetails> cars = query.list();
		s.close();
		for(CarDetails car : cars) {
			System.out.println(car);
		}
	}
	public void displayRegAndManu() {
		Session s = sf.openSession();
		Query<CarDetails> query = s.createQuery("from CarDetails");
		List<CarDetails> cars = query.list();
		cars.forEach(c->System.out.println("Reg No : "+c.getRegNo()+" Manufacturer : "+c.getManufacturer()));
	}
	public void displayCarDetailsByRegNo(String regNo) {
		Session s = sf.openSession();
		Query<CarDetails> query = s.createQuery("from CarDetails where regNo = ?0");
		query.setParameter(0, regNo);
		List<CarDetails> cars = query.list();
		if(cars.isEmpty()) {
			System.out.println("No cars with entered Reg No are found");
		}
		else {
			cars.forEach(System.out::println);
		}
	}
	public void displayManufacturerNames() {
		Session session = sf.openSession();
		Query<String> query = session.createQuery("select manufacturer from CarDetails where manufacturer like 'V%'");
		List<String> mnames = query.list();
		mnames.forEach(System.out::println);
	}
	public void displayCarsByColor(String color) {
		Session session = sf.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<CarDetails> query = cb.createQuery(CarDetails.class);
		Root<CarDetails> root = query.from(CarDetails.class);
		query.select(root);
		Predicate p = cb.equal(root.get("color"), color);
		query.where(p);
		Query<CarDetails> q = session.createQuery(query);
		List<CarDetails> cars = q.list();
		if(cars.isEmpty())
		{
			System.out.println("No cars with entered color are found");
		}
		else
		{
			cars.forEach(System.out::println);
		}
	}
	public void displayCountOfCarsByRegNo(String regNo) {
		Session ss = sf.openSession();
		CriteriaBuilder cb = ss.getCriteriaBuilder();
		CriteriaQuery cq = cb.createQuery();
		Root<CarDetails> root = cq.from(CarDetails.class);
		cq.select(root);
		Predicate p = cb.equal(root.get("regNo"), regNo);
		cq.where(p);
		Query<CarDetails> query = ss.createQuery(cq);
		System.out.println("The No of Cars with Reg No "+regNo+" are "+query.list().size());	
	}
}
