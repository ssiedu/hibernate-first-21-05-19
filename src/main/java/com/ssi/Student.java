package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="stud")
public class Student {
	
	@Id
	@Column(name="rollno")
	private int rno;
	
	@Column(name="sname",nullable=true,length=50)
	private String name;
	
	
	private String branch;
	
	private int sem;

	private static String university="DAVV";
	
	public Student() {
		super();
	}
	public Student(int rno, String name, String branch, int sem) {
		super();
		this.rno = rno;
		this.name = name;
		this.branch = branch;
		this.sem = sem;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", branch=" + branch
				+ ", sem=" + sem + "]";
	}
	
	
}
