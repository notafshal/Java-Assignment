package com.internsaathi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internsaathi.dao.*;
import com.internsaathi.model.Datafile;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	 private DatafileDao datafileDao = new DatafileDao();
       
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");
		
		Datafile save = new Datafile();
		save.setFirstname(firstName);
		save.setLastname(lastName);
		save.setEmail(email);
		save.setPassword(password);
		save.setContact(contact);
		

		try{
			datafileDao.registerInfo(save);
;		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/details.jsp");
	      dispatcher.forward(request, response);
	}
	}