package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RemoveStudent {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll No. of Student To Be Removed");
		int rno=sc.nextInt();
		
		//create entity object
		Student student=new Student();
		student.setRno(rno);
		
		//create session object
		Session session=DataUtility.getSF().openSession();
		
		//begin transaction
		Transaction tr=session.beginTransaction();
		
		//call delete method
		session.delete(student);
		
		//commit transaction
		tr.commit();
		
		//close session
		session.close();
		
		System.out.println("RECORD SUCCESSFULLY REMOVED");

	}

}
