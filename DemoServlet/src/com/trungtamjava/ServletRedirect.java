package com.trungtamjava;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chuyen-huong-trang" })
public class ServletRedirect extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.sendRedirect("https://www.youtube.com/watch?v=_U08pLCxRoc&list=PLFn_qRkU56WGIb1yYxMtFgYyJVrjOXW3c&index=15");
		
		//cach 2:
		resp.setStatus(resp.SC_MOVED_PERMANENTLY);
		resp.setHeader("Location", "https://www.youtube.com/watch?v=_U08pLCxRoc&list=PLFn_qRkU56WGIb1yYxMtFgYyJVrjOXW3c&index=15");
	}
}
