package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveOrUpdateDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno : ");
		int rno=sc.nextInt();
		System.out.println("Enter Name  : ");
		String name=sc.next();
		System.out.println("Enter Branch : ");
		String branch=sc.next();
		System.out.println("Enter Semester : ");
		int sem=sc.nextInt();
		
		Student student=new Student(rno, name, branch, sem);
		
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(student);
		tr.commit();
		session.close();
		System.out.println("Operation Performed");
		
		
		
		

	}

}
