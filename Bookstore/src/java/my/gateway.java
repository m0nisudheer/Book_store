
package my;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class gateway extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            PrintWriter pw=resp.getWriter();
            
                    pw.print("<!DOCTYPE html>");
                    pw.print("<html>");
                    pw.print("<head>");
                    pw.print("<title>Servlet payment</title>");
                    pw.print("<style>");
                    
                   // pw.print("body{background: linear-gradient(110deg, #fdcd3b 60%, #ffed4b 60%)}");
                    
                    
                    pw.print("body #a{display: flex;align-items: center;justify-content: flex-start;height: 50vh; margin: 0;padding-left: 200px;}");
                    pw.print(" #clock-container {width: 250px;height: 250px; border-radius: 50%;box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5);background-image: linear-gradient(to top, #fad0c4 0%, #ffd1ff 100%);background-image:url('image\\\\wa2.jpg');background-size:cover;background-position: center;display: flex;align-items: center;justify-content: center;overflow: hidden; }");
                    pw.print("#countdown {font-size: 4em;transition: color 0.5s ease-in-out; text-align: center;}");
                    pw.print(" #countdown strong {font-weight: bold;color:#fff; }");
                    
                    
                    pw.print("body #b{margin: 0;padding: 0;display: flex;justify-content: flex-end;align-items: center; height: 80vh;}");
                    pw.print(" form {padding: 50px; border-radius: 8px; width: 500px;margin-right: 190px;}");
                    pw.print("form input {width: 100%;padding:6px; box-sizing: border-box;}");
                    pw.print("</style>");
                    pw.print("</head>");
                    pw.print("<body>");
                    
                    
                    
                    pw.print("<aside style='float:left'>");
                    pw.print("<aside style='padding-left:100px;padding-top:60px'>");
                    pw.print("<h3 style='color:red;font-size:30px'>The Session will expire within...</h3>");
                    pw.print("</aside>");
                    pw.print("<div id='a'>");
                    pw.print("<div id='clock-container'>");
                    pw.print("<div id='countdown'><strong>1:30</strong></div></div>");
                    pw.print("<script>");
                    pw.print(" document.addEventListener('DOMContentLoaded', function() {let timeRemaining = 90;const countdownElement = document.getElementById('countdown');function updateCountdown() {const minutes = Math.floor(timeRemaining / 60); const seconds = timeRemaining % 60;");
                    pw.print(" countdownElement.innerHTML = `<strong>${minutes}:${seconds < 10 ? '0' : ''}${seconds}</strong>`;");
                    pw.print("if (timeRemaining < 30) {countdownElement.style.color = 'red';}timeRemaining--;if (timeRemaining < 0) {clearInterval(interval);window.history.back();}}  updateCountdown(); const interval = setInterval(updateCountdown, 1000);  });");
                    pw.print("</script>");
                    pw.print("</div>"); 
                    
                    pw.print("</div>"); 
                    pw.print("</aside>");                
                                         
                    pw.print("<aside style='float:right'>");
                    pw.print("<div id='b'>");                 
                    pw.print("<form method='post' action='paymentconformation'>");
                    pw.print("<fieldset style='box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5);background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);border-color:black;border-width:5px;width:500px;font-size:20px;font-family:arial black'/>");
                    pw.print("<table align='center' cellpadding='15px' cellspacing='5px'");
                    
                    pw.print("<tr><th colspan='2' style='color:red'>PAYMENT DETAILS</th></tr>");
                    pw.print("<tr>");
                    pw.print("<td>Enter ur name:</td>");
                    pw.print("<td><input type='text' style='border-radius:5px' name='un' id='un' required/></td>");
                    pw.print("</tr>");
                    
                    pw.print("<tr>");
                    pw.print("<td>Enter ur email:</td>");
                    pw.print("<td><input type='text' style='border-radius:5px' name='en' id='en' required/></td>");
                    pw.print("</tr>");
                    
                    pw.print("<tr>");
                    pw.print("<td>Mobile number:</td>");
                    pw.print("<td><input type='tel' style='border-radius:5px' pattern='[0-9]{10}' name='mn' id='mn' required/></td>");
                    pw.print("</tr>");
                    
                    
                    pw.print("<tr>");
                    pw.print("<td>Enter ur cvv no:</td>");
                    pw.print("<td><input type='text' style='border-radius:5px' pattern='[0-9]{9}' name='psw' required/></td>");
                    pw.print("</tr>");
                 //   pw.print("<tr><td colspan='2'><input type='submit' value='Proceed To Pay' style=\"font-family:arial black ;border-radius:5px;background-color:black;color:white;height:35px;width:430px\" /></td></tr>");
                
                    
                    
                    pw.print("<td colspan='2'><input type='submit' value='Proceed To Pay' style=\"font-family:arial black ;cursor: pointer; background-color:black;color:white;width:430px;border-radius:5px\"></td>");
                    pw.print("</fieldset>");
                    pw.print("</table>");
                    pw.print("</form>");                
                 
                 pw.print("</div>");
            pw.print("</aside>");
        pw.print("</body>");
     pw.print("</html>");
    }

}