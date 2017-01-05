package com.abhi.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestHttpSessionListenerAndEvents
 * 
 * HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener
 */
public class TestHttpSessionListenerAndEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestHttpSessionListenerAndEvents() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(5);
		System.out.println(this.getClass().getName() + " adding a session attribute");
		session.setAttribute("Abhi", "add");
		System.out.println(this.getClass().getName() + " replacing a session attribute");
		session.setAttribute("Abhi", "replace");
		System.out.println(this.getClass().getName() + " deleting a session attribute");
		session.removeAttribute("Abhi");
		//System.out.println(this.getClass().getName() + " invalidating the session");
		//session.invalidate();
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
