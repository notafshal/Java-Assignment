package com.internsaathi.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Encoder;

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
		System.out.println("herer");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");
		
		Encoder encoder = Base64.getEncoder();
		String encodeed=encoder.encodeToString(password.getBytes());
		System.out.println(encodeed);
		Datafile save = new Datafile();
	
		save.setName(name);
		save.setEmail(email);
		save.setPassword(encodeed);
		save.setContact(contact);
		
		
		try{
			datafileDao.registerInfo(save);
;		} catch (Exception e) {
			e.printStackTrace();
		}
		  RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	      dispatcher.forward(request, response);
	}
}



