package com.abhi.edu;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author abhishekkhare
 * http://localhost:8080/Servlets/HelloWorld
 */
public class LogFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LogFilter() {
		System.out.println(this.getClass().getName() + " filter instance created");
	}

	/**
	 * @see Filter#destroy() Called before the Filter instance is removed from
	 *      service by the web container
	 */
	public void destroy() {
		System.out.println(this.getClass().getName() + " filter is destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(this.getClass().getName() + " doFilter Called");
		// Get the IP address of client machine.
		String ipAddress = request.getRemoteAddr();

		// Log the IP address and current timestamp.
		System.out.println(this.getClass().getName() + " IP " + ipAddress + ", Time " + new Date().toString());

		// Pass request back down the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// Get init parameter
		String testParam = fConfig.getInitParameter("test-param");
		// Print the init parameter
		System.out.println(this.getClass().getName() + " Test Param:: " + testParam);
	}

}
