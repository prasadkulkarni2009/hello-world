package com.psl;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside get method");
		String user = request.getParameter("usr");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("Hello world..!!! "+user);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside POST methos");
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("welcome "+username+ " "+password);
		pw.write("<a href='Page2'>page2</a>");
		
		
	}

}
