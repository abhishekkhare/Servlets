package com.abhi.edu;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletContextAttributeListener
 * 
 * ServletContextListener, ServletContextAttributeListener,
 * 
 * http://localhost:8080/Servlets/TestServletContextAttributeListener
 */


public class TestServletContextAttributeListener extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServletContextAttributeListener() {
		super();
		System.out.println(this.getClass().getName() + " Servlet has been loaded");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		System.out.println(this.getClass().getName() + " Setting a context attribute");
		context.setAttribute("Abhi", "add");
		System.out.println(this.getClass().getName() + " Replace a context attribute");
		context.setAttribute("Abhi", "replace");
		System.out.println(this.getClass().getName() + " Remove a context attribute");
		context.removeAttribute("Abhi");
		System.out.println("*******************************************************************************");
		System.out.println(this.getClass().getName() + " Setting a request attribute");
		request.setAttribute("Abhi", "add");
		System.out.println(this.getClass().getName() + " Replace a request attribute");
		request.setAttribute("Abhi", "replace");
		System.out.println(this.getClass().getName() + " Remove a request attribute");
		request.removeAttribute("Abhi");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
