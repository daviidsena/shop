<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>It Step - Viagens</title>
<style type="text/css">
#main {
	width: 800px;
	padding: 0;
	margin-left: auto;
	margin-right: auto;
}

#cabecalho {
	height: 100px;
	background-color: #F5F5F5;
	border: 1px solid #CDCDCD;
	margin-bottom: 5px;
	margin-top: 5px;
}

#menu {
	height: 50px;
	line-height: 30px;
	border: 1px solid #CDCDCD;
	background-color: #F5F5F5;
	margin-bottom: 5px;
	clear: both;
}

#corpo {
	width: 800px;
	min-height: 430px;
	border: 1px solid #CDCDCD;
	float: left;
	margin-bottom: 5px;
	clear: both;
}

#rodape {
	height: 50px;
	clear: both;
	border: 1px solid #CDCDCD;
	background-color: #F8F8FF;
	margin-bottom: 5px;
}
</style>
</head>
<body>
	<div id="main">
		<div id="head">
			<img src="images/banner.jpg" width="800px" height="100px" />
		</div>
		<div id="corpo">
			<form name="Autenticacao" action="NameHandlerServlet">
				<p>
					<label>Usuário:</label> <input type="text" name="name" />
				</p>
				<p>
					<label>CPF:</label> <input type="text" name="cpf" />
				</p>
				<input type="submit" value="OK" />
			</form>
		</div>
		<div id="rodape"><jsp:include page="rodape.jsp"></jsp:include></div>
	</div>
</body>
</html>
