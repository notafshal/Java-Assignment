package com.internsaathi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.internsaathi.dao.LoginDao;
import com.internsaathi.model.Datafile;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private LoginDao loginDao= new LoginDao();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("herer");
		String email =request.getParameter("email");
		String password = request.getParameter("password");
		Datafile datafile = new Datafile();
		
		PrintWriter out =response.getWriter();
		
		Encoder encoder = Base64.getEncoder();
		String encodeed=encoder.encodeToString(password.getBytes());
		System.out.println(encodeed);
		datafile.setEmail(email);
		datafile.setPassword(encodeed);
	
		try {
			if(loginDao.validate(datafile)) {
			
				response.sendRedirect("loginsuccess.jsp");
			}else {
				out.print("<h4> Ivalid Email or Password encoded</h4>"+encodeed);
				out.print(encodeed);
out.println(email);
				RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}

	}
}
