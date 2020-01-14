package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns={"/test-config"}, initParams={@WebInitParam(name="name", value = "trung tam java")})
public class ServletConfigDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= super.getServletConfig().getInitParameter("name");
		resp.setContentType("text/html");
		PrintWriter writer= resp.getWriter();
		writer.println("xin chao \t"+ name);
		writer.println(getServletConfig().getServletName());
		
			
	}
}
