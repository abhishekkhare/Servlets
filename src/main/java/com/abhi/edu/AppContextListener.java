package com.abhi.edu;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * 
 * @authorAbhishekkhare
 *
 */
public class AppContextListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     * Runs during server startup, before any filter or servlet is Initialized
     */
    public AppContextListener() {
    	System.out.println(this.getClass().getName() + " Application Listener has been Initialized" );
    }

    
    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     * Runs during server startup, before any filter or servlet is Initialized
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println(this.getClass().getName() + "  Context has been Initialized:: "  + sce.getServletContext().getServletContextName());
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println(this.getClass().getName() + "  Context has been destroyed:: "  + sce.getServletContext().getServletContextName());
    }
    
    /**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scab)  { 
    	System.out.println(this.getClass().getName() + " A contex attribute has been removed:: "  + scab.getName() + " ::"  + scab.getValue());
    }

    /**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scab)  { 
    	System.out.println(this.getClass().getName() + " A contex attribute has been replaced:: "  + scab.getName() + " ::"  + scab.getValue());
    }
    
    /**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scab)  { 
    	System.out.println(this.getClass().getName() + " A contex attribute has been added:: "  + scab.getName() + " ::"  + scab.getValue());
    }
    
	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println(this.getClass().getName() + " A session has been created:: "  + se.getSession().getId() + se.getSession().getAttribute("Abhi" ));
    }
    
    /**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println(this.getClass().getName() + "  session Destoryed:: "  + se.getSession().getId() + se.getSession().getAttribute("Abhi" ));
    }
    
    /**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
    	System.out.println(this.getClass().getName() + "  session will Passivate:: "  + se.getSession().getId() + se.getSession().getAttribute("Abhi" ));
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
    	System.out.println(this.getClass().getName() + "  session did activate:: "  + se.getSession().getId() + se.getSession().getAttribute("Abhi" ));
    }
    
    /**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println(this.getClass().getName() + " A session attribute has been replaced:: "  + se.getSession().getId()  + se.getSession().getAttribute("Abhi" ));
    }

    /**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	System.out.println(this.getClass().getName() + " A session attribute has been added:: "  + se.getSession().getId()  + se.getSession().getAttribute("Abhi" ));
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	System.out.println(this.getClass().getName() + " A session attribute has been removed:: "  + se.getSession().getId()  + se.getSession().getAttribute("Abhi" ));
    }
    
    /**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent se)  { 
    	System.out.println(this.getClass().getName() + " A session value is bound:: "  + se.getSession().getId()  + se.getSession().getAttribute("Abhi" ));
    }
    
	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent se)  { 
    	System.out.println(this.getClass().getName() + " A session value is ubBound:: "  + se.getSession().getId());
    }
    
    /**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println(this.getClass().getName() + " A servlet request has been destroyed:: "  + sre.getServletRequest().isSecure());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println(this.getClass().getName() + " A servlet request has been intialized:: "  + sre.getServletRequest().isSecure());
    }
    
	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println(this.getClass().getName() + " A request attribute has been added:: "  + srae.getName());
    }

    /**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    	System.out.println(this.getClass().getName() + " A request attribute has been removed:: "  + srae.getName());
    }
    
    /**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println(this.getClass().getName() + " A request attribute has been replaced:: "  + srae.getName());
    }

		
}
