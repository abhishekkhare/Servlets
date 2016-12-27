package com.abhi.edu;


// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 
 * @author abhishekkhare
 * http://localhost:8080/Servlets/HelloWorld
 */
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String message;

	/**
	 * The init method is designed to be called only once. It is called when the
	 * servlet is first created, and not called again for each user request. So,
	 * it is used for one-time initializations
	 */
	public void init() throws ServletException {
		// Do required initialization
		System.out.println(this.getClass().getName() + "Servlet has been initalized:: ");
		message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this.getClass().getName() + "doGet called");
		// Set response content type
		response.setContentType("text/html");
		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	/**
	 * The destroy() method is called only once at the end of the life cycle of
	 * a servlet. This method gives your servlet a chance to close database
	 * connections, halt background threads, write cookie lists or hit counts to
	 * disk, and perform other such cleanup activities.
	 * 
	 * After the destroy() method is called, the servlet object is marked for
	 * garbage collection.
	 */
	public void destroy() {
		System.out.println(this.getClass().getName() + "Servlet has been destroyed:: ");
	}
}
