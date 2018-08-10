<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Web</title>
</head>
<body>
    <jsp:useBean id="nameHandlerBean" scope="session" class="org.mypackage.hello.NameHandler" />
    <h1>Hello, <jsp:getProperty name="nameHandlerBean" property="name" />, 
    seu CPF é <jsp:getProperty name="nameHandlerBean" property="cpf" />?</h1>
</body>
</html>