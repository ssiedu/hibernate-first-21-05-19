package com.ssi;

import java.util.ArrayList;
import java.util.List;

public class ListObjArrDemo {
	public static void main(String args[]){
		
		//store name and age of a student to an array
		
		Object stud1[]={"amit",25};
		Object stud2[]={"raj",22};
		Object stud3[]={"priya",20};
		
		List<Object[]> students=new ArrayList<Object[]>();
		
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		
		
		for(Object ar[]:students){
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("_________________________");
		}
}
}

/*
 * 		1st iteration of outer loop 		ar=0th element of list=stud1
				
				1st iteration of inner 		obj=0th element of stud1	=>amit
				2nd iteration of inner		obj=1st element of stud1	=>25
				------------------------
		
	    2nd iteration of outer loop			ar=1st element of list=stud2
	    
	    		1st iteration of inner		obj=0th element stud2		=>raj
	    		2nd iteration of inner		obj=1st element stud2		=>22
	    		-----------------------
	    
	    3rd iteration of outer loop			ar=2nd element of list=stud3
	    		1st iteration of inner		obj=0th element stud3		=>priya
	    		2nd iteration of inner		obj=1st element stud3		=>20
	    		-----------------------
	    ------------------------------------------------------------------------
		
		
 */
