package com.fb.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fb.data.HibCon;
import com.fb.model.FbModel;

/**
 * Servlet implementation class DoRegister
 */
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String fName;
	public static String lName;
	public static String uName;
	public static String pWord;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		fName = request.getParameter("fName");
		lName = request.getParameter("lName");
		uName = request.getParameter("uName");
		pWord = request.getParameter("pWord");

		// creating and updating the values into the database

		HibCon hcon = new HibCon();
		hcon.createConnection();
		System.out.println("connection created successfully");
		hcon.create();
		System.out.println("data stored into database successfully");
		hcon.close();

	}

}
