package com.trungtamjava.session.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/session-login" })
public class SessionLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<form action='/JavaServlet/session-login' method='post'>");
		printWriter.println("user name: <input type='text' name='username'>");
		printWriter.println("pass word: <input type='password' name='password'>");
		printWriter.println("<input type='submit' value='login'>");
		printWriter.println("</form>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		if(username.equals("admin")&&password.equals("123456")) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("username", username);
			resp.sendRedirect("/JavaServlet/wellcome-session");
		}else {
			resp.sendRedirect("/JavaServlet/session-login");
		}
	}
}
