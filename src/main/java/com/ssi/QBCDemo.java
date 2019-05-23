package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBCDemo {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Criteria cr=session.createCriteria(Student.class);
		List<Student> students=cr.list();
		
		for(Student student:students){
			System.out.println(student.getRno()+","+student.getName());
		}
		
		session.close();
	}

}
