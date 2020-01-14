package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet1"})
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter= resp.getWriter();
		printWriter.println("xin chao trung tam java");
		
		//create a cookie
		
		Cookie ck=new Cookie("user1","Romwan");//creating cookie object  
		resp.addCookie(ck);//adding cookie in the response  
		
		// co the tao nhieu cookie
		
		Cookie ck1=new Cookie("user2","Mitt");//creating cookie object  
		resp.addCookie(ck1);//adding cookie in the response  
		 
		
		
		
	}
}
