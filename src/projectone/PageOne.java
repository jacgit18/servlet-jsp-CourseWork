package projectone;  

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/pg-one")
public class PageOne extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    Cookie pageOneCookie = new Cookie("visitedPageOne", "yes");
    pageOneCookie.setMaxAge(60*60*24*365);
    response.addCookie(pageOneCookie);
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Page One";
    String docType =
      "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
      "Transitional//EN\">\n";
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
                "Click <A HREF=\"pg-two\">here</A>\n" +
                "to visit page two.\n" +
                "Click <A HREF=\"index.html\">here</A>\n" +
                "to visit main page.\n" +
                "</BODY></HTML>");
  }
}