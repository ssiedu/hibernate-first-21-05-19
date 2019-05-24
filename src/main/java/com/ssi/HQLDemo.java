package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLDemo {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Query query=session.createQuery("from Student");
		List<Student> students=query.list();
		
		for(Student student:students){
			System.out.println(student);
		}
		session.close();
	}

}
