package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;

public class SearchStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number To Be Searched : ");
		int rno=sc.nextInt();
		
		//Query By Id (QBI)
		
		Session session=DataUtility.getSF().openSession();
		
		Student student=session.get(Student.class, rno);
		if(student!=null){
			//System.out.println(student);
			
			System.out.println(student.getRno());
			System.out.println(student.getName());
			System.out.println(student.getBranch());
			System.out.println(student.getSem());
			
			
		}else{
			System.out.println("Enter A Valid Rollno");
		}
		
		
		session.close();
		
		
	}

}
