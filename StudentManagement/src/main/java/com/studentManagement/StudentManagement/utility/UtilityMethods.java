package com.studentManagement.StudentManagement.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilityMethods {
	public Connection createConnection() throws ClassNotFoundException, SQLException
	{
		Connection conn=null;
		try
		{
		 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
		}catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
		return conn;
	}

}
