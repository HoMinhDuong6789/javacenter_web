package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet2" })
public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();

		Cookie ck[] = req.getCookies();
		for (Cookie cookie : ck) {
			printWriter.println("<br>" + cookie.getName() + " " + cookie.getValue());// printing name and value of cookie
			//xoa cookie 
			if(cookie.getName().equals("user")) {
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		}
		

}
