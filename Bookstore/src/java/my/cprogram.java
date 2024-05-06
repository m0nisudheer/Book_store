    
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cprogram extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        
        pw.print("<!DOCTYPE html>");
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>C Language Books</title>");
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
        pw.print("<h2 style=\"text-align:center;color:black;font-family:arial black;text-shadow:2px 1px #ff9a9e\">List of C Programming Books</h2>");
             
        //pw.print("<h2>List of C Programming Books...</h2>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\1.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book: Let us C by Yashavant Kanetkar <br> Author:Yashavant Kanetkar <br> Publication:1972</td>");
		pw.print("<td align='center'>1099/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1099'/></td> </tr>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\2.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:C programming by Brian Kernighan <br> Author:Brian Kernighan <br> Publication:1980</td>");
		pw.print("<td align='center'>800/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='800'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='899' />C programming by Brian Kernighan:899/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\3.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Effective C by Robert C. Seacord <br> Author:Robert C. Seacord <br> Publication:1982</td>");
		pw.print("<td align='center'>1389/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1389'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1389' />Effective C by Robert C. Seacord :1389/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\4.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Head First C by David Griffiths <br> Author:David Griffiths <br> Publication:1984</td>");
		pw.print("<td align='center'>459/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='459'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='499' />Head First C by David Griffiths:499/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\5.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Expert C Programming by Peter Linden <br> Author:Peter Linden <br> Publication:1986</td>");
		pw.print("<td align='center'>600/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='600'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='600' />Expert C Programming by Peter Linden:600/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\6.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Learn C the Hard Way by Zed Shaw <br> Author:Zed Shaw <br> Publication:1988</td>");
		pw.print("<td align='center'>1209/-</td> ");
		pw.print("<td align='center'> <input type='checkbox' class='my-checkbox' name='items' value='1209'/></td> </tr>");
                
                //pw.print("<tr><td><input type='checkbox' name='items' value='1209' />Learn C the Hard Way by Zed Shaw:1209/-<td></tr>");
                
                pw.print("<tr><td align='center'><img src='image\\c\\7.jpeg' width='100' height='120' align='center'/></td>");
		pw.print("<td align='center'> Book:Programming in Ansi C <br> Author:E.Balagurusamy <br> Publication:1990</td>");
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
    

