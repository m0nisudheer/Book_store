package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class analog extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Analog Books</title>");
        pw.print("<script>");
        pw.print("function checkAndNavigate() {var checkboxes = document.querySelectorAll('input[type=\"checkbox\"]'); var isChecked = false;"); 
        pw.print("for (var i = 0; i < checkboxes.length; i++) { if (checkboxes[i].checked) { isChecked = true;  break;   } }");  
        pw.print("if (isChecked) {  return true; } else { alert('Select Atleast One Book'); return false; }}");
        pw.print("</script>"); 
        pw.print("<style>");
        
        pw.print("div {margin-left:200px;margin-right:200px;margin-top:20px;margin-bottom:30px;width:950px;background-image: linear-gradient(45deg, #ff9a9e 0%, #fad0c4 99%, #fad0c4 100%);box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5)}");
                
        pw.print(".my-checkbox {cursor: pointer;}s");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body style='font-size:20px'>");
        pw.print("<div align='center'>");
        pw.print("<form method='post' id='checkboxForm' onsubmit='return checkAndNavigate()' action='add'>");
        pw.print("<fieldset>");
        pw.print("<table border='1px' width='900px' cellpadding='10px' cellspacing='5px'>");
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #ff9a9e\">List of Analog Electronics Books</h2>");
             
        //pw.print("<h2>List of C Programming Books...</h2>");
                
        
        
        
                pw.print("<tr><td align='center'><img src='image\\an\\1.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analog Electronics by Hickman<br> Author:Hickman <br> Publication:1922</td>");
		pw.print("<td align='center'>1025/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1025'/></td> </tr>");
                
                pw.print("<tr><td align='center'><img src='image\\an\\2.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Principles Of Analog Electronics by Giavanni Saggio<br> Author:Giavanni Saggio <br> Publication:1932</td>");
		pw.print("<td align='center'>439/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='439'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='899' />C programming by Brian Kernighan:899/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\an\\3.jpg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analog Electronics<br> Author:Bakshi <br> Publication:2009</td>");
		pw.print("<td align='center'>1289/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1289'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1389' />Effective C by Robert C. Seacord :1389/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\an\\4.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Basic of Analog Electronics by Dinesh Prasad<br> Author:Dinesh Prasad,Zainab Haseeb <br> Publication:1949</td>");
		pw.print("<td align='center'>469/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='469'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='499' />Head First C by David Griffiths:499/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\an\\5.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analog And Digital Electronic Circuits by R.Prasad<br> Author:R.Prasad<br> Publication:1986</td>");
		pw.print("<td align='center'>600/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='600'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='600' />Expert C Programming by Peter Linden:600/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\an\\6.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analog Electronics Applications by Lautaro<br> Author:Lautaro <br> Publication:1968</td>");
		pw.print("<td align='center'>1009/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1009'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1209' />Learn C the Hard Way by Zed Shaw:1209/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\an\\7.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Analog Electronics By Meena Singh<br> Author:Meena Singh <br> Publication:1960</td>");
		pw.print("<td align='center'>999/-</td> ");
                pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='999'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='999' />Programming in Ansi C:999/-<td></tr>");
                pw.print("</table>");
                pw.print("<br/>");
                pw.print("<input type='submit' value='Add To Cart' style=\"font-family:arial black ;border-radius:5px;cursor: pointer; background-color:black;color:white;height:35px;width:130px\" />");
                pw.print("<br/>");
                pw.print("</div>");
       // pw.print("<h2 style=\"text-align:center;color:red;text-shadow:1px 1px yellow\">Note:-Choose at least one Book...</h2>");
         pw.print("</body>");
        pw.print("</html>");
        }
 }
    
