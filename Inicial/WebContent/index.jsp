<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Entry Form</h1>
	<form name="Name Input Form" action="NameHandlerServlet">
		<p>
			<label>Nome:</label> <input type="text" name="name" />
		</p>
		<p>
			<label>CPF:</label> <input type="text" name="cpf" />
		</p>
		<input type="submit" value="OK" />
	</form>
</body>
</html>