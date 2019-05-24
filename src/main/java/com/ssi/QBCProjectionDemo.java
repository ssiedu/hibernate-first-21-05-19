package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionDemo {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Criteria cr=session.createCriteria(Student.class);
		//To apply projection
		
			ProjectionList pList=Projections.projectionList();
			Projection proj1=Projections.property("name");
			Projection proj2=Projections.property("branch");
			Projection proj3=Projections.property("sem");
			pList.add(proj1); pList.add(proj2); pList.add(proj3);
			cr.setProjection(pList);
			
			List<Object[]> students=cr.list();
			
			
			for(Object ar[]:students){	//fetch one by one array from list
				
				for(Object obj:ar){		//fetch one by one elements of array
					System.out.println(obj);
				}
				System.out.println("____________________________");
			}
			
			
			session.close();

	}

}
