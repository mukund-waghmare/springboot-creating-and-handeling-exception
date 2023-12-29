package com.ty.creatingandhandlingcustomeexception;

public class Student {
	
	private int studentId;
	
	private String studentName;
	
	private double studentHeight;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentHeight() {
		return studentHeight;
	}

	public void setStudentHeight(double studentHeight) {
		this.studentHeight = studentHeight;
	}

	public Student(int studentId, String studentName, double studentHeight) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentHeight = studentHeight;
	}

	public Student() {
		super();
	}
	
	
	
	

}
