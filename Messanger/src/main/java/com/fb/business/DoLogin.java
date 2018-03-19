package com.fb.business;

import java.io.IOException;
import com.fb.data.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.fb.data.FbData;
import com.fb.model.FbModel;

/**
 * Servlet implementation class DoLogin
 * 
 * @param <Hibcon>
 */
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected FbModel fbModel;
	//final static Logger logger = Logger.getLogger(DoLogin.class);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//logger.info("Entering into the dologin servelt");
		String uName = request.getParameter("uName");
		String pWord = request.getParameter("pWord");
		fbModel = new FbModel();
		fbModel.setuName(uName);
		fbModel.setpWord(pWord);
		//logger.info("readed value from the form = "+fbModel.getuName()+" "+fbModel.getpWord());
		FbData fbData = new FbData();
		String userValidate = fbData.doValidate(fbModel);
		if (userValidate.equals("success")) {
			System.out.println("validation completed successfully and accepted");// checking
			HttpSession ses = request.getSession();
			ses.setAttribute("uName", fbModel.getuName());
			String name = HibCon.DbFname.concat(HibCon.DbLname);
			ses.setAttribute("fName", name);
			ses.setAttribute("state", HibCon.DbState);
			System.out.println(ses.getAttribute(uName));
			RequestDispatcher dispatch = request.getRequestDispatcher("user.jsp");
			dispatch.forward(request, response);

			System.out.println("everything done and response is being redirected to welcome.jsp page...");// checking

		} else {
			System.out.println("validation completed successfully and invalid credential");// checking
			String msg = "Invalid username or password";
			HttpSession ses = request.getSession();
			ses.setAttribute("error", msg);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
