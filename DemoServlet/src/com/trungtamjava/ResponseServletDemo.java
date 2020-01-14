package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet (urlPatterns={"/test-response"})
public class ResponseServletDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Xin chao trung tam java</h1>");
		
		resp.addCookie(new Cookie("a", "aa"));  // tao cookie
		resp.addHeader("a", "aaa");				// set thong tin Header tra ve
		resp.sendError(200);					// set ma code loi
	}
}
