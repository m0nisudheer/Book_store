
package my;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class log extends HttpServlet {

    Connection con;
    PrintWriter pw;
   //int balance;
    
    @Override
    public void init() throws ServletException {
       try
       {
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/pay");
       }
       catch(Exception e)
       {
           System.out.println("Exception handled..!");
       }
    }

    @Override
    public void destroy() {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled..!");
        }
    } 
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
      pw=resp.getWriter();
      
      String a=req.getParameter("a");
      String b=req.getParameter("b");
      
      try
      {
          ServletContext sc=req.getServletContext();
          sc.setAttribute("Coninfo",con);
          
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("select * from signupdetails where email='"+a+"'");
          while(rs.next())
          {
              
              if(a.equals(rs.getString(3)) && b.equals(rs.getString(2)))
              {
                  RequestDispatcher rd=req.getRequestDispatcher("next.html");
                  rd.forward(req,resp);
                                       
              }  
          }
          RequestDispatcher rd=req.getRequestDispatcher("login.html");
          rd.include(req, resp);
          pw.print("<h2 style='color:red' align='center'>Invalid details..!!!</h2s>");   
      }
      catch(Exception e)
      {
          System.out.println("Exception handled..!");
      }
    }
    

}
