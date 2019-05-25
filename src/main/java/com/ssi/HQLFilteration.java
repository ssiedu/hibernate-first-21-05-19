package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLFilteration {
	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Query query=session.createQuery("select rno,name,branch from Student order by rno desc");
		List<Object[]> students=query.list();
		
		for(Object ar[]:students){
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("__________________________________");
		}
		session.close();
	}

}
