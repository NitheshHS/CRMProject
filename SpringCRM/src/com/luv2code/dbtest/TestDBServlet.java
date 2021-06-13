package com.luv2code.dbtest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestDBServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user="springstudent";
		String password="springstudent";
		String jdbcurl="jdbc:mysql://localhost:3306/web-customer-tracker?useSSL=false";
		
		String driver="com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			Connection myCon = DriverManager.getConnection(jdbcurl, user, password);
			System.out.println("success!");
			myCon.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
