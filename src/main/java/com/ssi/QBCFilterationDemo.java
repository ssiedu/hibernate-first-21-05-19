package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCFilterationDemo {
	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Criteria cr=session.createCriteria(Student.class);
		
		//Criterion crt1=Restrictions.in("branch", "CS","IT","CIVIL");
		Criterion crt1=Restrictions.in("rno", 111,115);
		//Criterion crt1=Restrictions.between("rno", 111, 115);
		cr.add(crt1);
		
		Restrictions.gt("rno", 3);
		Restrictions.ge("rno", 3);
		Restrictions.lt("rno", 115);
		Restrictions.le("rno", 114);
		Restrictions.like("name", "A%");
		
		/*
		Criterion crt1=Restrictions.between("rno", 112, 114);
		cr.add(crt1);
		*/
		
		/*
		Criterion crt1=Restrictions.eq("sem", 2);
		//cr.add(crt1);
		
		Criterion crt2=Restrictions.eq("branch", "IT");
		//cr.add(crt2);
		
		Criterion crt3=Restrictions.and(crt1,crt2);
		
		cr.add(crt3);
		*/
		List<Student> students=cr.list();
		
		for(Student student:students){
			System.out.println(student);
		}
		
		session.close();
	}
}
