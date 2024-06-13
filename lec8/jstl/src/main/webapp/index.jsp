<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Setup Check</title>
</head>
<body>
    <h1>JSTL Setup Check</h1>

    <p>Using JSTL to display the current date and time:</p>
  
    <p>Setting a variable and displaying it:</p>
    <c:set var="myVariable" value="Hello, JSTL!" />
    <p>My variable value: <c:out value="${myVariable}" /></p>

   
    <p>this is page</p>
    
</body>
</html>

