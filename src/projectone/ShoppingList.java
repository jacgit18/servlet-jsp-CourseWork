package projectone;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/shoplist")
public class ShoppingList extends HttpServlet {
	  @Override
	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	      throws ServletException, IOException {
		  
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String title = "Servlet Example: Showing Request Headers";
	    String docType =
	      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
	      "Transitional//EN\">\n";
	    out.println(docType +
	                "<HTML>\n" +
	                "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
	                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
	                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
	                
	                "<a href=\"http://localhost:8080/MYCookiesHW/shopping-start \"> keep shopping </a>" +
	                request.getRequestURI() + "<BR>\n" +
	                "<B>Request Protocol: </B>" +
	                request.getProtocol() + "<BR><BR>\n" +
	                "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
	                "<TR BGCOLOR=\"#FFAD00\">\n" +
	                "<TH>Header Name<TH>Header Value");
	    Enumeration<String> headerNames = request.getHeaderNames();
	    while(headerNames.hasMoreElements()) {
	      String headerName = headerNames.nextElement();
	      out.println("<TR><TD>" + headerName);
	      out.println("    <TD>" + request.getHeader(headerName));
	    }
	    out.println("</TABLE>\n</BODY></HTML>");
	  }

	  /** Since this servlet is for debugging, have it
	   *  handle GET and POST identically.
	   */
	  
	  @Override
	  public void doPost(HttpServletRequest request,
	                     HttpServletResponse response)
	      throws ServletException, IOException {
	    doGet(request, response);
	  }
	}