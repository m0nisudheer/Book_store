package my;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sucesss extends HttpServlet {
int res,b;
ResultSet rs;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Thank You for Your Purchase</title>");
        pw.print("<style>");
        pw.print("body {font-family: 'Arial', sans-serif;margin: 0;padding: 0;text-align: center;}");
        pw.print(".container {max-width: 600px;background-image: linear-gradient(to top, #fddb92 0%, #d1fdff 100%);margin: 50px auto;background-color: #fff; padding: 30px;border-radius: 10px;box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
        pw.print("h1 {color: #333;font-size: 32px;margin-bottom: 20px;}p {color: #555;font-size: 18px; margin-bottom: 30px;}");
        //pw.print("p {color: #555;font-size: 18px; margin-bottom: 30px;}");
        pw.print(".billing-details {text-align: left; margin-top: 20px;}.billing-details h2 {border-bottom: 1px solid #ccc;padding-bottom: 10px; margin-bottom: 20px;color: #333;font-size: 24px;}");
       // pw.print(".billing-details h2 {border-bottom: 1px solid #ccc;padding-bottom: 10px; margin-bottom: 20px;color: #333;font-size: 24px;}");
        pw.print(" .billing-details p {margin: 15px 0;color: #555;font-size: 18px;}");
        pw.print(".download-button {background-color: #4CAF50;color: #fff;padding: 15px 30px;text-decoration: none;border-radius: 5px;display: inline-block;margin-top: 30px;font-size: 18px;cursor: pointer;transition: background-color 0.3s ease;}");
        pw.print(".download-button:hover {background-color: #45a049; }");
       
        
        pw.print("</style>");
        pw.print("</head>");
        
        pw.print("<body>");
        pw.print("<div class='container'>");
        pw.print("<h1>Thank You for Your Purchase!</h1>");
        pw.print("<p>Your order has been successfully processed.</p>");
         
        pw.print("<div class='billing-details'>");
        pw.print(" <h2 style='text-align:center'>Visit Again..!!!</h2>");
        pw.print("</div>");
        pw.print(" <a href='#' class='download-button' id='downloadButton'>Download Receipt</a></div>");
         
             
        
       ServletContext sc=req.getServletContext();
      Connection con=(Connection)sc.getAttribute("Coninfo");
        
      //HttpSession ses = req.getSession(false);
      
      String x = req.getParameter("un");
      String y = req.getParameter("en");
      String z= req.getParameter("mn");
      String w=req.getParameter("psw");
       
       //if(ses == null)
           // {
           //     pw.print("<h2 style='color:red' align='center'>Ohhh!! Your Session Has Expired<h3 align='center'>Buy once again...</h3></h2>");
            //}
      // else
       //{
        try
        {   
            Cookie ck[]=req.getCookies();
                  for(Cookie c:ck)
                    {
                        if(c.getName().equals("sum1"))
                         {
                            res=(Integer.parseInt(c.getValue()));
                         }   
                    }
              Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              rs=stmt.executeQuery("select * from payment where name='"+x+"' and cvv="+w+"");
               while(rs.next())
                {
                    if(rs.getInt(3)>=res)
                    { 
                        b=(rs.getInt(3)-(res));
                        rs.updateInt(3,b);
                        rs.updateRow(); 
                        
                        pw.print("<script>");
                        pw.print("document.getElementById('downloadButton').addEventListener('click', function () {");
                        pw.print("var receiptContent = 'Receipt:\\n\\n' +");
                        pw.print("'Billing Details:\\n' +");
                        pw.print("'Name:"+x+"\\n' +");
                        pw.print("'Email:"+y+"\\n' +");
                        pw.print("'Mobile no:"+z+"\\n' +");
                        pw.print(" 'Order Total:"+res+"/-\\n' +");
                        pw.print("'Payment:Sucess\\n\\n' +");
                        pw.print("'Thank you for your purchase!';");
                        pw.print("var blob = new Blob([receiptContent], { type: 'text/plain' });");
                        pw.print("var link = document.createElement('a');link.href = window.URL.createObjectURL(blob);");
                        pw.print("link.download = 'Web Creators bookstore.txt';link.click();});");
                        pw.print(" </script>");
                        pw.print("");
                        
                        
                        
                        
                        /*pw.print("<h2 align='center'>Intial balance:"+rs.getInt(3)+"</h2>");
                        b=(rs.getInt(3)-(res));
                        rs.updateInt(3,b);
                        rs.updateRow(); 
                        pw.print("<h2 align='center'>Your balance is:"+b+"</h2>");
                        pw.print("<h2 style='color:red' align='center'>You Have Sucessfully Purchased...!!</h2>");*/
                   
                    }
                    else 
                    {
                        pw.print("<script>alert('Insufficient amount');</script>");
                        pw.print("<h2 style='align:center;color:red;font-family:Arial black'>You cannot download the receipt if your payment was not successful..!!</h2>");
                    } 
                           
                } 
        }
        catch(Exception e)
        {
                    
        }

 pw.print("</body>");
     pw.print("</html>");
}
}
//}


/*String a = req.getParameter("un");
        String b = req.getParameter("en");
        String c = req.getParameter("mn");
        
        
        pw.print(a);
        pw.print(b);
        pw.print(c);*/
       
 