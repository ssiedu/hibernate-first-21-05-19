package com.ssi;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class SQLDemo {
	public static void main(String args[]){
		
		String sql="select * from stud";
		
		Session session=DataUtility.getSF().openSession();
		SQLQuery query=session.createSQLQuery(sql);
		query.addEntity(Student.class);
		
		/*
		List<Object[]> students=query.list();
		for(Object ar[]:students){
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("__________________________________");
		}
		*/
		
		List<Student> students=query.list();
		for(Student student:students){
			System.out.println(student);
		}
		
		session.close();
		
	}
}
