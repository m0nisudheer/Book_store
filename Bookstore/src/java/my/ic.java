    
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ic extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>IC</title>");
        pw.print("<script>");
        pw.print("function checkAndNavigate() {var checkboxes = document.querySelectorAll('input[type=\"checkbox\"]'); var isChecked = false;"); 
        pw.print("for (var i = 0; i < checkboxes.length; i++) { if (checkboxes[i].checked) { isChecked = true;  break;   } }");  
        pw.print("if (isChecked) {  return true; } else { alert('Select Atleast One Book'); return false; }}");
        pw.print("</script>"); 
        pw.print("<style>");
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("<style>");
        
        pw.print("div {margin-left:200px;margin-right:200px;margin-top:20px;margin-bottom:30px;width:950px;background-image: linear-gradient(120deg, #d4fc79 0%, #96e6a1 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
         
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body style='font-size:20px'>");
        pw.print("<div align='center'>");
        pw.print("<form method='post' id='checkboxForm' onsubmit='return checkAndNavigate()' action='add'>");
        pw.print("<fieldset>");
        pw.print("<table border='1px' width='900px' cellpadding='10px' cellspacing='5px'>");
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #d4fc79\">List of Integrated Circuits Books</h2>");
             
        //pw.print("<h2>List of C Programming Books...</h2>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\1.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book: Integrated Circuits by Sanjay sharma<br> Author:Sanjay sharma <br> Publication:1922</td>");
		pw.print("<td align='center'>484/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='484'/></td> </tr>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\2.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Digital Integrated Circuits by Jan M Babaey <br> Author:Jan M Babaey <br> Publication:1970</td>");
		pw.print("<td align='center'>899/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='899'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='899' />C programming by Brian Kernighan:899/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\3.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Integrated Circuits by K.R.Botkar <br> Author:K.R.Botkar <br> Publication:1987</td>");
		pw.print("<td align='center'>1380/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1380'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1389' />Effective C by Robert C. Seacord :1389/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\4.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analysis And Design Of Analog Integrated Circuits by Wiley<br> Author:Wiley <br> Publication:1900</td>");
		pw.print("<td align='center'>499/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='499'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='499' />Head First C by David Griffiths:499/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\5.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Linear Integrated Circuits by D.Roy Chowdary <br> Author:D.Roy Chowdary <br> Publication:1986</td>");
		pw.print("<td align='center'>600/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='600'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='600' />Expert C Programming by Peter Linden:600/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\6.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analog Integrated Circuits by J.B.Gupta<br> Author:J.B.Gupta <br> Publication:1938</td>");
		pw.print("<td align='center'>199/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='199'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1209' />Learn C the Hard Way by Zed Shaw:1209/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\ic\\7.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'>Book: Application-Specific Integrated Circuits by Michael John<br> Author:Michael John <br> Publication:1953</td>");
		pw.print("<td align='center'>999/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='999'/></td> </tr>");
                
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
    

