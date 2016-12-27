package com.abhi.edu;

import java.io.IOException;
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
public class AuthenFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public AuthenFilter() {
		System.out.println(this.getClass().getName() + " filter instance created");
	}

	/**
	 * @see Filter#destroy()
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
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(this.getClass().getName() + " filter is intialized");
	}

}
