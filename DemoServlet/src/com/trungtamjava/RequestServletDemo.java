package com.trungtamjava;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test-request"})
public class RequestServletDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("phuong thuc cua request"+req.getMethod());
		req.getContentType();
		req.getContextPath();
		System.out.println(req.getServerName());
		
		//req.getSession();
		//lay thong tin tu header
		//header tuc la cac thong tin ma trinh duyet gui len tu clinent, cac thong tin: contentype
		//header duoc dinh dang theo kieu key-value
		
		Enumeration<String> keys= req.getHeaderNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			System.out.println(key +" "+req.getHeader(key));
		}
		
	}
}
