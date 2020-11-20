package com.studentManagement.StudentManagement.entity;

public class Marks {
	private int subId;
	private String subName;
	private double marks;
	public Marks(int subId, String subName, double marks) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.marks = marks;
	}
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	

}
