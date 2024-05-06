<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Forms</title>
    <style type="text/css">
	tr:hover
	{
            color:red;
	}
        form input {
            width: 88%; 
            padding:5px;
            box-sizing: border-box;
        }
        div{
            background-image: linear-gradient(to top, #fff1eb 0%, #ace0f9 100%);
            box-shadow: 8px 8px 15px 6px rgba(0,0,0,0.5);
            margin-left:430px;margin-right:430px;margin-top:20px;
            width:520px;
            align:center;
        }
    </style>
</head>
 <body>
    <div align="center">
	<form action="signupsuccess.jsp">
             <fieldset style="font-family:arial black">
		      <table align="center"cellpadding="13px"cellspacing="5px">
                          <tr>
                              <th colspan='2'><h2 style="text-align:center;color:purple">SIGN UP</h2></th>
                          </tr>
		<tr>
                            <td><label>Enter your name:</label></td>
                            <td><input type="text" style="border-radius:5px" name="a" required/></td>
			</tr>
                        <tr>
                            <td><label>Password:</label></td>
                            <td><input type="password" style="border-radius:5px" name="b"  required/></td>
			</tr>
			
			<tr>
                            <td>Enter your email:</td>
                            <td><input type="email" style="border-radius:5px" name="c" required/></td>
			</tr>
			<tr>
                            <td><label>Mobile number:</label></td>
                            <td><input type="tel" name="d" style="border-radius:5px" pattern="[0-9]{10}"  required/></td>	
			</tr>
			
			<tr>
                            <td>Gender:</td>
                            <td><input type="radio" name="e" value="male" required="" style="height:15px;width:15px">male
                                <input type="radio" name="e" value="female" required="" style="height:15px;width:15px">female
                                <input type="radio" name="e" value="others" required="" style="height:15px;width:15px">others</td>
			</tr>
                        <tr>
                            <td>Select age:</td>
                            <td><select name="f" style="border-radius:5px" required="">
                                    <option value="">age</option>
                                    <option value="10-20">10-20</option>
                                    <option value="21-30">21-30</option>
                                    <option value="31-40">31-40</option>
                                    <option value="41-50">41-50</option>
                                    <option value="50 Above">50 Above</option>
				</select></td>
			</tr>
			<tr>
                            <td>Select country:</td>
                            <td><select name="g" style="border-radius:5px" required="">
                                    <option value="">country</option>
                                    <option value="India">India</option>
                                    <option value="Others">Others</option>
				</select></td>
			</tr>
			<tr>
                           <tr align="center"> 
				<td colspan='2'><input type="submit" value="SignUP" style="font-family:arial black ;cursor: pointer;background-color:#0171d3;color:white;color:white;width:400px;border-radius:5px"></td>  
			</tr> 
			</tr>
		</table>
            </fieldset>
            </form>
	</div>
    </body>
</html>
