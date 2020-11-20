package com.studentManagement.StudentManagement.exception;

public class ConnectionFailedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String exception;
	public ConnectionFailedException(String ex)
	{
		exception=ex;
	}
	public String toString()
	{
		return "Connection Failed Exception Occured"+exception;
	}

}
