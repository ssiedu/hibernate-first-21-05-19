package com.ssi;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLUpdateParameterized {
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No. : ");
		int v1=sc.nextInt();
		System.out.println("Enter New Sem Value : ");
		int v2=sc.nextInt();
		
		String hql="update Student set sem=? where rno=?";
		Session session=DataUtility.getSF().openSession();
		Query query=session.createQuery(hql);
		query.setParameter(0, v2);
		query.setParameter(1, v1);
		
		
		/*
		String hql="update Student set sem=:semvalue where rno=:rnovalue";
		Session session=DataUtility.getSF().openSession();
		Query query=session.createQuery(hql);
		
		query.setParameter("rnovalue", v1);
		query.setParameter("semvalue", v2);
		*/
		int n=query.executeUpdate();
		session.close();
		System.out.println(n+ " rows modified ");
		
		
		
		
		
		
		
		
	}
}
