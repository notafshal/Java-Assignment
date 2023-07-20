package com.internsaathi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internsaathi.model.Datafile;

public class LoginDao {
// to check if login details are in database or not
	public boolean validate (Datafile datafile) throws Exception{
		boolean status = false;
		Class.forName("com.mysql.jdbc.Driver");
		try(
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/datatable","root","afshal123");
				PreparedStatement  preparedStatement = connection.prepareStatement
						("select * from datatable where email =? and password =?")){
			preparedStatement.setString(1,  datafile.getEmail());
			preparedStatement.setString(2, datafile.getPassword());
			
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status =rs.next();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
						
	}
}
