package com.internsaathi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.internsaathi.model.Datafile;

//JDBC code to connect to MYSQL database

public class DatafileDao {
public int registerInfo(Datafile save) throws Exception{
	String INSERT_USERS_SQL = "INSERT INTO datatable( name, email, password,  contact) VALUES ( ?, ?,?,?);";

	int result =0;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String Url="jdbc:mysql://localhost:3306/savedata";
	
			try(
		
		Connection con=DriverManager.getConnection(Url,"root","afshal123");
		
		
		
		PreparedStatement preparedStatement = con.prepareStatement(INSERT_USERS_SQL)){


	    preparedStatement.setString(1, save.getName());
	    preparedStatement.setString(2, save.getEmail());
	    preparedStatement.setString(3, save.getPassword());
	    preparedStatement.setString(4, save.getContact());
	    
		System.out.println(preparedStatement);
		 
		 result = preparedStatement.executeUpdate();
		 }catch(SQLException e) {
			 
			 e.printStackTrace();
		 }

         return result;
		
}
}
