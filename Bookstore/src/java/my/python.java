 
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class python extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
       pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Python Books</title>");
        pw.print("<script>");
        pw.print("function checkAndNavigate() {var checkboxes = document.querySelectorAll('input[type=\"checkbox\"]'); var isChecked = false;");
        
        pw.print("for (var i = 0; i < checkboxes.length; i++) { if (checkboxes[i].checked) { isChecked = true;  break;   } }");
        
        pw.print("if (isChecked) {  return true; } else { alert('Select Atleast One Book'); return false; }}");
               
        pw.print("</script>");
        pw.print("<style>");
        
         pw.print("div {margin-left:200px;margin-right:200px;margin-top:20px;margin-bottom:30px;width:950px;background-image: linear-gradient(to top, #feada6 0%, #f5efef 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
               
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body style='font-size:20px'>");
        pw.print("<div align='center'>");
        pw.print("<form method='post' id='checkboxForm' onsubmit='return checkAndNavigate()' action='add'>");
         pw.print("<fieldset>");
       pw.print("<table border='1px' width='900px' cellpadding='10px' cellspacing='5px'>");
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #f5efef\">List of Python Books</h2>");
         
                
                pw.print("<tr><td align='center'><img src='image\\python\\p1.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Fluent python by Luciano Ramalho <br> Author:Luciano Ramalho <br> Publication:1950</td>");
		pw.print("<td align='center'>699/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='699'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='699' />Fluent python by Luciano Ramalho:699/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\python\\p2.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Python Crash course by Eric Matthes <br> Author:Eric Matthes <br> Publication:1952</td>");
		pw.print("<td align='center'>1299/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1299'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1299' />Python Crash course by Eric Matthes:1299/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\python\\p3.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Think Python by Allen B.Downey <br> Author:Allen B.Downey <br> Publication:1954</td>");
		pw.print("<td align='center'>850/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='850'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='850' />Think Python by Allen B.Downey:850/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\python\\p4.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Python for Everybody by charles <br> Author:charles <br> Publication:1956</td>");
		pw.print("<td align='center'>760/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='760'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='760' />Python for Everybody by charles:760/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\python\\p5.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Learn python the Hard Way by Zed Shaw <br> Author:Zed Shaw <br> Publication:1958</td>");
		pw.print("<td align='center'>900/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='900'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='900' />Learn python the Hard Way by Zed Shaw:900/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\python\\p6.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Effective Python by Brett Slatkin <br> Author:Brett Slatkin <br> Publication:1958</td>");
		pw.print("<td align='center'>1206/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1206'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1206' />Effective Python by Brett Slatkin:1206/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\python\\p7.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Python Programming by Hamilton <br> Author:Hamilton <br> Publication:1948</td>");
		pw.print("<td align='center'>1502/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1502'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1502' />Python Programming by Hamilton:1502/-<td></tr>");
                
                
        pw.print("</table>");
        pw.print("<br/>");
        pw.print("<input type='submit' value='Add To Cart' style=\"font-family:arial black ;cursor: pointer; border-radius:5px;background-color:black;color:white;height:35px;width:130px\" />");
        pw.print("<br/>");
        pw.print("</div>");
         pw.print("</body>");
        pw.print("</html>");
        }
 }
    

