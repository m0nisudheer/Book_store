
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class paymentconformation extends HttpServlet {
    Connection con;
    PrintWriter pw;
   int balance;
    
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
      
      String un=req.getParameter("un");
      String psw=req.getParameter("psw");
      
      try
      {
          ServletContext sc=req.getServletContext();
          sc.setAttribute("Coninfo",con);
          
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("select * from payment where name='"+un+"'");
          while(rs.next())
          {
              
              if(un.equals(rs.getString(1)) && psw.equals(rs.getString(2)))
              {
                  RequestDispatcher rd=req.getRequestDispatcher("sucesss");
                  rd.forward(req,resp);
                                       
              }  
          }
          RequestDispatcher rd=req.getRequestDispatcher("gateway");
          rd.include(req, resp);
          pw.print("<aside style='float:right;margin-right: 300px'>");
          pw.print("<h1 style='color:red;font-size:40px'>Invalid details..!!!</h1>"); 
          pw.print("</aside>");
      }
      catch(Exception e)
      {
          System.out.println("Exception handled..!");
      }
    }
    

}