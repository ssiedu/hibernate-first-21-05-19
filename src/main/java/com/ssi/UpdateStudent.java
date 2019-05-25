package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		
		Student student=session.get(Student.class, 111);
		student.setSem(5);
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
		
		System.out.println("RECORD SUCCESSFULLY MODIFIED");
	}

}
