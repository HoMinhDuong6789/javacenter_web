package com.trungtamjava.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/jdbc" })
public class JDBCServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		try {
			Connection con = JDBCConnection.getJDBConnection();
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from person");
			while (resultSet.next()) {
				printWriter.println(resultSet.getInt("id"));
				printWriter.println(resultSet.getString("name"));
				printWriter.println("</br>");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
