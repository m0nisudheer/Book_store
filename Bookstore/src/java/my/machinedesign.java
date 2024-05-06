    
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class machinedesign extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>machine design</title>");
        pw.print("<script>");
        pw.print("function checkAndNavigate() {var checkboxes = document.querySelectorAll('input[type=\"checkbox\"]'); var isChecked = false;"); 
        pw.print("for (var i = 0; i < checkboxes.length; i++) { if (checkboxes[i].checked) { isChecked = true;  break;   } }");  
        pw.print("if (isChecked) {  return true; } else { alert('Select Atleast One Book'); return false; }}");
        pw.print("</script>"); 
        pw.print("<style>");
        
        pw.print("div {margin-left:200px;margin-right:200px;margin-top:20px;margin-bottom:30px;width:950px;background-image: linear-gradient(120deg, #89f7fe 0%, #66a6ff 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
         
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body style='font-size:20px'>");
        pw.print("<div align='center'>");
        pw.print("<form method='post' id='checkboxForm' onsubmit='return checkAndNavigate()' action='add'>");
        pw.print("<fieldset>");
        pw.print("<table border='1px' width='900px' cellpadding='10px' cellspacing='5px'>");
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #89f7fe\">List of Machine Design Books</h2>");
             
        //pw.print("<h2>List of C Programming Books...</h2>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\1.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book: Machine Design by R.S.Khurmi<br> Author:R.S.Khurmi <br> Publication:1900</td>");
		pw.print("<td align='center'>1029/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1029'/></td> </tr>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\2.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Elements Of Machine Design by Henry L.Rachman <br> Author: Henry L.Rachman <br> Publication:1870</td>");
		pw.print("<td align='center'>823/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='823'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='899' />C programming by Brian Kernighan:899/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\3.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Machine Design Second Edition by P.Kannaiah <br> Author:P.Kannaiah <br> Publication:1983</td>");
		pw.print("<td align='center'>1380/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1380'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1389' />Effective C by Robert C. Seacord :1389/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\4.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Machine Design by Andrew D.Dimarogonas <br> Author: Andrew D.Dimarogonas <br> Publication:1914</td>");
		pw.print("<td align='center'>400/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='400'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='499' />Head First C by David Griffiths:499/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\5.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Machine Design Second Edition by P.Kannaiah<br> Author:P.Kannaiah <br> Publication:1986</td>");
		pw.print("<td align='center'>724/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='724'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='600' />Expert C Programming by Peter Linden:600/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\6.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Fifth Edition Machine Design by Robert L.Norton<br> Author:Robert L.Norton <br> Publication:1923</td>");
		pw.print("<td align='center'>1104/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1104'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1209' />Learn C the Hard Way by Zed Shaw:1209/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\mac\\7.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'>Book:Machine Design by Timothy H.Wentzell<br> Author:Timothy H.Wentzell <br> Publication:1897</td>");
		pw.print("<td align='center'>492/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='492'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='999' />Programming in Ansi C:999/-<td></tr>");
                pw.print("</table>");
                pw.print("<br/>");
                pw.print("<input type='submit' value='Add To Cart' style=\"font-family:arial black ;cursor: pointer; border-radius:5px;background-color:black;color:white;height:35px;width:130px\" />");
                pw.print("<br/>");
                pw.print("</div>");
       // pw.print("<h2 style=\"text-align:center;color:red;text-shadow:1px 1px yellow\">Note:-Choose at least one Book...</h2>");
         pw.print("</body>");
        pw.print("</html>");
        }
 }
    

