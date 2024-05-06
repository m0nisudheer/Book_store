
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cse extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>"); 
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>System Enginnering Books</title>");
        pw.print("<script>");
        pw.print("function checkAndNavigate() {var checkboxes = document.querySelectorAll('input[type=\"checkbox\"]'); var isChecked = false;");
        
        pw.print("for (var i = 0; i < checkboxes.length; i++) { if (checkboxes[i].checked) { isChecked = true;  break;   } }");
        
        pw.print("if (isChecked) {  return true; } else { alert('Select Atleast One Book'); return false; }}");
               
        pw.print("</script>");
        pw.print("<style>");
        
        pw.print("div {margin-left:200px;margin-right:200px;margin-top:20px;margin-bottom:30px;width:950px;background-image: linear-gradient(to right, #ffecd2 0%, #fcb69f 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
         
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("<style>");
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body style='font-size:20px'>");
        pw.print("<div align='center'>");
        pw.print("<form method='post' id='checkboxForm' onsubmit='return checkAndNavigate()' action='add'>");
        pw.print("<fieldset>");
        pw.print("<table border='1px' width='900px' cellpadding='10px' cellspacing='5px'>");
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #fcb69f\">List of Control Systems Engineering Books</h2>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\1.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Control Systems Engineering by Norman <br> Author:Norman S.Nise <br> Publication:1896</td>");
		pw.print("<td align='center'>655/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='655'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='655' />Effective java by Joshua Bloch:655/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\2.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Control System Engineering by Nagoor <br> Author:Nagoor <br> Publication:1802</td>");
		pw.print("<td align='center'>599/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='599'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='599' />Thinking in java by Bruce Eckel:599/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\3.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book: Control System Engineering by Kani<br> Author:Kani <br> Publication:1906</td>");
		pw.print("<td align='center'>980/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='980'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='980' />Java Beginner's guide by Schildt:980/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\4.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Control System Engineering using MATLAB by Sivanandam<br> Author:Sivanandam <br> Publication:1940</td>");
		pw.print("<td align='center'>790/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='790'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='790' />Head First Java by Kathy Sierra:790/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\5.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Problems In Control System Engineering by Deepa<br> Author:Deepa<br> Publication:1910</td>");
		pw.print("<td align='center'>990/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='990'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='990' />Java in Practise by Brain :990/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\6.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Control System Engineering by Palani <br> Author:Palani <br> Publication:1812</td>");
		pw.print("<td align='center'>1280/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1280'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1280' />Core Java by Nageswara Rao:1280/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\cse\\7.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Control System Engineering by Joseph Cyril Babu <br> Author:Joseph Cyril Babu<br> Publication:1814</td>");
		pw.print("<td align='center'>1255/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox'  name='items' value='1255'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1255' />Java For Dummies by Barry:1255/-<td></tr>");
                
        pw.print("</table>");
        pw.print("<br/>");
        pw.print("<input type='submit' value='Add To Cart' style=\"font-family:arial black ;cursor: pointer; border-radius:5px;background-color:black;color:white;height:35px;width:130px\" />");
        pw.print("<br/>");
        pw.print("</div>");
        pw.print("</body>");
        pw.print("</html>");
        }
 }
    

