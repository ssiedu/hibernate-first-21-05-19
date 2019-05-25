package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLDelete {

	public static void main(String[] args) {

		String hql="delete from Student where branch='CIVIL'";
		
		Session session=DataUtility.getSF().openSession();
		Query query=session.createQuery(hql);
		int n=query.executeUpdate();
		session.close();
		System.out.println(n+ " rows removed");

	}

}
