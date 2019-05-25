package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLUpdate {

	public static void main(String[] args) {

		String hql="update Student set sem=sem+1";
		
		Session session=DataUtility.getSF().openSession();
		Query query=session.createQuery(hql);
		int n=query.executeUpdate();
		System.out.println(n+ " rows modified");
		session.close();
		

	}

}
