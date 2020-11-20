package com.studentManagement.StudentManagement.entity;

import java.util.ArrayList;

public class Student {
	private int sId;
	private String name;
	private String branch;
	private ArrayList<Marks> marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String name, String branch, ArrayList<Marks> marks) {
		super();
		this.sId = sId;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
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
	public ArrayList<Marks> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Marks> marks) {
		this.marks = marks;
	}
}
