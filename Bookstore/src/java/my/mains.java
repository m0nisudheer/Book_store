
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class mains extends HttpServlet {
        
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        String ca=req.getParameter("books");
        
        
           Cookie ck=new Cookie("b",ca);
           resp.addCookie(ck);
      
        resp.sendRedirect("cookie");
        
        
    }

}