package com.luv2code.jdbc;

import java.sql.*;

public class TestJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		Connection connection=DriverManager.getConnection(url,"hbstudent","hbstudent");
		Statement q=connection.createStatement();
		//q.execute("create table person(int id,varchar name)");

	}

}
