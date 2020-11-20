package com.studentManagement.StudentManagement.client;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.studentManagement.StudentManagement.entity.Marks;
import com.studentManagement.StudentManagement.entity.Student;

public class StudentManagement {
	Scanner sc=new Scanner(System.in);
	public Student createStudentDetails()
	{
		StudentManagement studentManagement=new StudentManagement();
		System.out.println("Enter the Student id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student name");
		String name=sc.nextLine();
		String branch="";
		System.out.println("Enter the Student Branch");
		branch=sc.nextLine();
		ArrayList<Marks>mark=studentManagement.getStudentMarks();
		Student temp=new Student();
	}
	public ArrayList<Marks> getStudentMarks()
	{
		ArrayList<Marks> marks=new ArrayList<Marks>();
		boolean ifMore=true;
		while(ifMore)
		{
			try
			{
		System.out.println("Enter Subject id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Subject name");
		String name=sc.nextLine();
		System.out.println("Enter Subject Marks");
		double mark=sc.nextDouble();
		Marks temp=new Marks();
		temp.setMarks(mark);
		temp.setSubId(id);
		temp.setSubName(name);
		marks.add(temp);
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Provide correct input");
			}
		System.out.println("Want to add more subject");
		String select=sc.nextLine();
		if(select.equalsIgnoreCase("yes"))
		{
			ifMore=true;
		}
		else
		{
			ifMore=false;
		}
	}
		return marks;
	}
}
