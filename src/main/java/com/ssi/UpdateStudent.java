package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {

	public static void main(String[] args) {

		Student student=new Student();
		student.setRno(114);
		student.setName("DDD");
		student.setBranch("CIVIL");
		student.setSem(8);
		
		
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
		
		System.out.println("RECORD SUCCESSFULLY MODIFIED");

	}

}
