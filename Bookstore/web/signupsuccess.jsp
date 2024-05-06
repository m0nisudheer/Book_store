<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<%Class.forName("org.apache.derby.jdbc.ClientDriver");%>
<%
    String a=request.getParameter("a");
    String b=request.getParameter("b");
    String c=request.getParameter("c");
    String d=request.getParameter("d");
    String e=request.getParameter("e");
    String f=request.getParameter("f");
    String g=request.getParameter("g");
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/pay");
    Statement st=con.createStatement();
    int i=st.executeUpdate("insert into signupdetails(name,password,email,mobilenumber,gender,age,country) values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')");
    %>
    <div align="center">
    <body style="background:linear-gradient(to left,#feada6,#f5efef)"> 
        <img src="image\\suc.png"/>
        <h2>YOU HAVE REGISTER SUCESSFULLY!!</h2>
        <h1>Click here to login👉<a href="login.html">Login</a></h1>
    </body>
    </div>
