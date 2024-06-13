<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ page import="java.util.Random,java.util.ArrayList,java.io.*" %>

<%@ page errorPage="erro.jsp" %>
<html>
<head>
    <title>Sum of Two Numbers</title>
</head>
<body>
    <form name="f1" method="post" action="index.jsp">
        Enter First Number: <input type="text" name="n1"/><br/>
        Enter Second Number: <input type="text" name="n2"/><br/><br/>
        <input type="submit" value="Find Sum"/>
    </form>

    <%!
        int find_sum(int p, int q) {
            return p + q;
        }
        int find_mul(int p, int q) {
            return p / q;
        }

    %>

    <%
        String inp1 = request.getParameter("n1");
        String inp2 = request.getParameter("n2");

        if (inp1 != null && inp2 != null) {
            int px = Integer.parseInt(inp1);
            int py = Integer.parseInt(inp2);
            int sum = find_sum(px, py);
            int mul= find_mul(px, py);
            out.println("<br/>Sum = " + sum);
            out.println("<br/>mul = " + mul);
        }
    %>
    
    <%@ include file="header.jsp" %>
    <% Random r=new Random();
        int n=r.nextInt(100);
        out.println("<p>Random Number is</p>");
    %>
    <%= n %>

</body>
</html>
