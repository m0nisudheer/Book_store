
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cookie extends HttpServlet {
   String a;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();
       
        Cookie ck[]=req.getCookies();
        for(Cookie ca:ck)
        {
           if(ca.getName().equals("b"))
           {
               a=ca.getValue();
           }
        }
       if(a.equals("a"))
       {
           resp.sendRedirect("cprogram");
       }
       else if(a.equals("b"))
       {
           resp.sendRedirect("python");
       }
       else if(a.equals("c"))
       {
           resp.sendRedirect("java");
       }
       else if(a.equals("d"))
       {
           resp.sendRedirect("signals");
       }
       else if(a.equals("e"))
       {
           resp.sendRedirect("vlsi");
       }
       else if(a.equals("f"))
       {
           resp.sendRedirect("ic");
       }
       else if(a.equals("g"))
       {
           resp.sendRedirect("stm");
       }
       else if(a.equals("h"))
       {
           resp.sendRedirect("fluidmec");
       }
       else if(a.equals("i"))
       {
           resp.sendRedirect("machinedesign");
       }
       else if(a.equals("j"))
       {
           resp.sendRedirect("concretetech");
       }
       else if(a.equals("k"))
       {
           resp.sendRedirect("inf");
       }
       else if(a.equals("l"))
       {
           resp.sendRedirect("san");
       }
       else if(a.equals("M"))
       {
           resp.sendRedirect("analog");
       }
       else if(a.equals("N"))
       {
           resp.sendRedirect("cse");
       }
       else
       {
           resp.sendRedirect("ct");
       }
       
    }
}