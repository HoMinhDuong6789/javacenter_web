package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form-nguoi-dung"})
public class FromPerson extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<form action='/DemoServlet/them-nguoi-dung' method='post'>");
		writer.println("ten:<input type='text' name='ten'>");
		writer.println("</br>tuoi:<input type='text' name='tuoi'>");
		writer.println("</br>diachi:<input type='text' name='diachi'>");
		writer.println("</br><input type='submit' valur='submit'>");
		writer.println("</form>");
		
	}
	
}
