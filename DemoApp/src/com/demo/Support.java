package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

/**
 * Servlet implementation class Support
 */
@WebServlet("/support")
public class Support extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Support() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	     PageContext pageContext = null;
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String supportEmail= getServletContext().getInitParameter("SupportEmail");
		System.out.println(supportEmail);
		//pageContext.setAttribute("SupportEmail", "support@mum.edu", PageContext.SESSION_SCOPE);
		request.setAttribute("supportEmail", supportEmail);
		RequestDispatcher req = request.getRequestDispatcher("info.jsp");
		
		req.forward(request, response);
//		System.out.println(name);
//		doGet(request, response);
	}

}
