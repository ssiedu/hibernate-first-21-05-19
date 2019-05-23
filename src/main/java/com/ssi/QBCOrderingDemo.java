package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCOrderingDemo {
	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Criteria cr=session.createCriteria(Student.class);
		
		Order order1=Order.asc("branch");
		cr.addOrder(order1);
		
		Order order2=Order.desc("rno");
		cr.addOrder(order2);
		
		
		List<Student> students=cr.list();
		
		for(Student student:students){
			System.out.println(student);
		}
		
		session.close();
	}
}
