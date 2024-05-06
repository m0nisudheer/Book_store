package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class add extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();
        
        
        String[] orders=req.getParameterValues("items");
        //HttpSession ses=req.getSession();
               
          int sums=0,sum=0,a;
        pw.print("<!DOCTYPE html>");
            pw.print("<html>");
            pw.print("<head>");
            pw.print("<title>Servlet payment</title>");
            pw.print("<style>");
            pw.print("div {margin-left:250px;margin-right:250px;margin-top:50px;width:850px;background-image: linear-gradient(to top, #fad0c4 0%, #ffd1ff 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
            pw.print("</style>");
            pw.print("</head>");
            
           // background:linear-gradient(to left,#00B7FF,#FFFFc7)
            pw.print("<body>");
            pw.print("<div align='center'>");
            pw.print("<form method='post' action='gateway'>");
            pw.print("<fieldset>");
            pw.print("<table>");
             String skills[] = req.getParameterValues("items");
            for (String i:skills){
                 //pw.print(i+"<br/>");
                 sums= sums+Integer.parseInt(i);

            }
            pw.print("<h1 style=\"font-family:arial black\">Web Creators Book Store</h1>");
            pw.print("<h3><p id=\"current_date\"></p></h3>");
            pw.print("<script>");
             pw.print("const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };");
              pw.print("document.getElementById(\"current_date\").innerHTML = new Date().toLocaleDateString('en-US', options);");
             pw.print("</script>");
             pw.print("<h1>========================================</h1>");
             pw.print("<tr><td style='padding-left:42px'><img style='width:300px;height:200px' src='image//logo.png'/></td></tr>");
             //pw.print("<aside style='float:left;width:50px;height:50px'><img src='image//logo.png'/></aside>");
             // pw.print("<aside style=\"float:Left;width:300px\"><h4>Discount</h4></aside>");
              pw.print("<aside style='float:Right;margin-right:10.5%;margin-top:2.5%'>");
             
              pw.print("<h3>Orginal Price is :<strike> "+sums+"/-</strike><br/></h3>");
            a =(sums*25)/100;
            sum=sums-a;
            pw.print("<h2>Total Price is:"+sum+"/-</h2>");
           // pw.print("</script>");
            
            String s = Integer.toString(sum);
           Cookie ck=new Cookie("sum1",s);
           resp.addCookie(ck);
       
            pw.print("<input type='submit' value='Next' style=\"font-family:arial black ;border-radius:5px;cursor: pointer;background-color:black;color:white;height:35px;width:220px\"/>\n"+"");
           // pw.print("<br/><input type='submit' value='purchase'/>");
            //ses.setMaxInactiveInterval(90);
            pw.print("</table>");
            pw.print("<h2 style='color:red;font-family:arial black'>25% discount on total purchase</h2>");
            pw.print("</fieldset>");
            pw.print("</form>");
           pw.print("</div>");
         pw.print("</body>");
     pw.print("</html>");
    }
}