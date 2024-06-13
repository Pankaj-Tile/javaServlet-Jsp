<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
   
    <title>result page</title>
 

</head>
<body>

    <% 
    String n1=request.getParameter("n1");
    String n2=request.getParameter("n2");
    int num1=Integer.parseInt(n1);
    int num2=Integer.parseInt(n2);
    int c=num1/num2;
%>
    <h1>result is <%= c %></h1>
    
</body>
</html> 