package com.internsaathi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internsaathi.model.Datafile;

//JDBC code to connect to MYSQL database

public class DatafileDao {
public int registerInfo(Datafile save) throws Exception{
	String INSERT_USERS_SQL = "INSERT INTO datatable"+"(id, first_name, last_name, email, password,  contact) VALUES (?, ?, ?, ?, ?,?);";

	int result =0;
	
	Class.forName("com.mysql.jdbc.Driver");
	try(
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/datatable","root","afshal123");
		
		
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
	
	    preparedStatement.setInt(1, 1);
	    preparedStatement.setString(2, save.getFirstname());
	    preparedStatement.setString(3, save.getLastname());
	    preparedStatement.setString(4, save.getEmail());
	    preparedStatement.setString(5, save.getPassword());
	    preparedStatement.setString(6, save.getContact());
	    
		System.out.println(preparedStatement);
		 
		 result = preparedStatement.executeUpdate();
		 }catch(SQLException e) {
			 
			 e.printStackTrace();
		 }

         return result;
		
}
}
