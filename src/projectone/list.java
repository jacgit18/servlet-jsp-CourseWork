package projectone;

import coreServlet.ServletUtilities;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mylist")
public class list extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, 
						HttpServletResponse response)
		throws ServletException, IOException{
			
		
		// Always define response first
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "JC";
//		ServletUtilities tes = new ServletUtilities();
//		out.println(tes);
//		out.println(ServletUtilities.headWithTitle("The List")); // practicing what you did in class
		
		out.println("<!DOCTYPE html>");
        out.println("<head><title> Test </title></head>");
        out.println("<body>");

//		out.println(ServletUtilities.headWithTitle("The List" +
//				"<body bgcolor=\"#fdf5e6\">\n" +
//				"<h1>" + title + "</h1>\n" +
//				"<p>Simple servlet for testing.</p>\n" +
//				"</body></html>"));
        out.println("<div>");
		out.println("<b>Joshua Carpentier</b></br>");
		// String mylist = ""; always initialize if using variable inside for loop and after for loop

//		 String[] myArray = new String[]{           
//				 "<li>" + Math.random() + "</li>",
//				 "<li>" + Math.random() + "</li>",
//				 "<li>" + Math.random() + "</li>",
//				 "<li>" + Math.random() + "</li>",
// }; 

        out.println("<ul>");
//		for (int listIndex = 0; listIndex <= myArray.length; listIndex++)
		for (int listIndex = 0; listIndex <= 3; listIndex++)
        {
            out.println("<li>" + Math.random() + "</li>");
//            out.println(myArray[listIndex]);
         }
        out.println("</ul>");
        out.println("</div>");
        out.println("</br>");

        out.println("<div>");
		  out.println("<table border = '1'  width=700 height=700>");
	        out.println("<tr>");

	        for (int i = 0; i <= 25; i++)
	        {
	            for (int j = 0; j <= 10; j++)
	            {
	                out.println("<td height=10></td>");
	            }
	            out.println("</tr>");
	        }

	        out.println("</table>");
	        out.println("</div>");

	        
	        out.println("</body></html>");
		


	}	
	

	
	@Override
	public void doPost(HttpServletRequest request, 
						HttpServletResponse response)
		throws ServletException, IOException{
		
		doGet(request, response);


	}	
}