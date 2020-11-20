package com.studentManagement.StudentManagement.exception;

public class StudentNotFoundException {
	private String exception;

	public StudentNotFoundException(String exception) {
		super();
		this.exception = exception;
	}
	public String toString()
	{
		return "StudentNotFoundException Occured"+exception;
	}
}
