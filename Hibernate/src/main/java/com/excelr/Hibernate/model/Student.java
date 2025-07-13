package com.excelr.Hibernate.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;
@Entity
@Table(name="College Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rno;
	@Column(name="StudentName") //student_name
	private String sname;
	private String scity;
	
	public Student() {}
	public Student(int rno, String sname, String scity) {
		this.rno = rno;
		this.sname = sname;
		this.scity = scity;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", scity=" + scity + "]";
	}	
	
}