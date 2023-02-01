package com.Tanla.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Tanla.interfaces.CoreInterfaces;

public class ObjectHelper extends CoreFields implements CoreInterfaces{

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//belirtilen sınıf adıyla bu Sınıfın örneğini almak için kullanılır.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public Connection getConnection() {
		Connection connection=null;
		try {
			
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/satisstokprojesi", "root", "lahmacun1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return connection;
	}

}
