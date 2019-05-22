package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class StudentEntry {

	public static void main(String[] args) {

		//enter the records of some students.
		
		Student s1=new Student(111,"AAA","MECH",1);
		Student s2=new Student(112,"BBB","IT",2);
		Student s3=new Student(113,"CCC","EC",4);
		Student s4=new Student(114,"DDD","CIVIL",6);
		Student s5=new Student(115,"EEE","CS",3);
		Student s6=new Student(116,"FFF","IT",2);
		
		//Configuration conf=new Configuration().configure();
		//Configuration conf=new Configuration().configure("myconfig.xml");
		//SessionFactory sessionFactory=	conf.buildSessionFactory();
		//Session session=sessionFactory.openSession();	
		
		Session session=DataUtility.getSF().openSession();
		
		Transaction tr=session.beginTransaction();
		
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		
		tr.commit();
		
		session.close();
		System.out.println("RECORDS ADDED");		
		
		
		

	}

}
