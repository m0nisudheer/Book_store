    
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class san extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>structural analysis</title>");
        pw.print("<script>");
        pw.print("function checkAndNavigate() {var checkboxes = document.querySelectorAll('input[type=\"checkbox\"]'); var isChecked = false;"); 
        pw.print("for (var i = 0; i < checkboxes.length; i++) { if (checkboxes[i].checked) { isChecked = true;  break;   } }");  
        pw.print("if (isChecked) {  return true; } else { alert('Select Atleast One Book'); return false; }}");
        pw.print("</script>");
        pw.print("<style>");
        
        pw.print("div {margin-left:200px;margin-right:200px;margin-top:20px;margin-bottom:30px;width:950px;background-image: linear-gradient(to top, #fff1eb 0%, #ace0f9 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
         
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body style='font-size:20px'>");
        pw.print("<div align='center'>");
        pw.print("<form method='post' id='checkboxForm' onsubmit='return checkAndNavigate()' action='add'>");
        pw.print("<fieldset>");
        pw.print("<table border='1px' width='900px' cellpadding='10px' cellspacing='5px'>");
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #ace0f9\">List of Structural Analysis Books</h2>");
             
        //pw.print("<h2>List of C Programming Books...</h2>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\1.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book: Structural Analysis-I by S.S.Bhavikatti<br> Author:S.S.Bhavikatti <br> Publication:1892</td>");
		pw.print("<td align='center'>689/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' ame='items' value='689'/></td> </tr>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\2.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Structural Analysis-II second edition by S.S.Bhavikatti <br> Author:S.S.Bhavikatti  <br> Publication:1980</td>");
		pw.print("<td align='center'>829/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='829'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='899' />C programming by Brian Kernighan:899/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\3.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Basic Structural Analysis by M.Vijayanand <br> Author:M.Vijayanand <br> Publication:1932</td>");
		pw.print("<td align='center'>489/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='489'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1389' />Effective C by Robert C. Seacord :1389/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\4.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Structural Analysis by Dr.R.Vaidyanathan<br> Author:Dr.R.Vaidyanathan <br> Publication:1954</td>");
		pw.print("<td align='center'>439/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='439'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='499' />Head First C by David Griffiths:499/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\5.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Structural Analysis by Madan Mohan Das <br> Author:Madan Mohan Das <br> Publication:1846</td>");
		pw.print("<td align='center'>600/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='600'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='600' />Expert C Programming by Peter Linden:600/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\6.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Structural Analysis by R.C.Habbeler <br> Author:R.C.Habbeler <br> Publication:1968</td>");
		pw.print("<td align='center'>1099/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1009'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1209' />Learn C the Hard Way by Zed Shaw:1209/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\san\\7.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book: Structural Analysis Fundamentals by Ramez Gayed<br> Author:Ramez Gayed <br> Publication:1910</td>");
		pw.print("<td align='center'>919/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='919'/></td> </tr>");
                
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
    

