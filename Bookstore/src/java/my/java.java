
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class java extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Java Books</title>");
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
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #fcb69f\">List of Java Books</h2>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j1.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Effective java by Joshua Bloch <br> Author:Joshua Bloch <br> Publication:1896</td>");
		pw.print("<td align='center'>655/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='655'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='655' />Effective java by Joshua Bloch:655/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j2.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Thinking in java by Bruce Eckel <br> Author:Eckel <br> Publication:1802</td>");
		pw.print("<td align='center'>599/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='599'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='599' />Thinking in java by Bruce Eckel:599/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j3.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Java Beginner's guide by Schildt <br> Author:Schildt <br> Publication:1906</td>");
		pw.print("<td align='center'>980/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='980'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='980' />Java Beginner's guide by Schildt:980/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j4.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Head First Java by Kathy Sierra <br> Author:Kathy Sierra <br> Publication:1940</td>");
		pw.print("<td align='center'>790/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='790'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='790' />Head First Java by Kathy Sierra:790/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j5.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Java in Practise by Brain <br> Author:Brain <br> Publication:1910</td>");
		pw.print("<td align='center'>990/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='990'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='990' />Java in Practise by Brain :990/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j6.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Core Java by Nageswara Rao <br> Author:Nageswara Rao <br> Publication:1812</td>");
		pw.print("<td align='center'>1280/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1280'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1280' />Core Java by Nageswara Rao:1280/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\java\\j7.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Java For Dummies by Barry <br> Author:Barry <br> Publication:1814</td>");
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
    

