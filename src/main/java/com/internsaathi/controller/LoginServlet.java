package com.internsaathi.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		String email =request.getParameter("email");
		String password = request.getParameter("password");
		Datafile datafile = new Datafile();
		datafile.setEmail(email);
		datafile.setPassword(password);
		PrintWriter out =response.getWriter();
		try {
			if(loginDao.validate(datafile)) {
				response.sendRedirect("loginsuccess.jsp");
			}else {
				out.print("<h4> Invalid Email or Password</h4>");
				RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}

	}
}
