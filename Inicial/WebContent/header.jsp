<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Footer</title>
</head>
<body>
		<div id="head-link">
			<div id='menungang'>
				<ul>
					<li class='last'><a href="index.jsp"><span>Home</span></a></li>
					<li class='last'><a href="product.jsp"><span>Produtos</span></a></li>
					<c:choose>
						<c:when test="{not empty username}">
							<li class='last'><a href="cart.jsp"><span>Carrinho
										de compras</span></a></li>
							<li class='last'><a href="search_page.jsp"><span>Pesquisa</span></a></li>
							<li class='last' style="float: right;"><a
								href="LogoutServlet"><span>Sair</span></a></li>
							<li class='last' style="float: right;"><a
								href="update_user.jsp?username=${username}"><span>${username}</span></a></li>
						</c:when>
						<c:when test="{empty username}">
							<li class='last'><a href="search_page.jsp"><span>Pesquisa</span></a></li>
							<li class='last' style="float: right;"><a
								href="register.jsp"><span>Registro</span></a></li>
							<li class='last' style="float: right;"><a href="login.jsp"><span>Login</span></a></li>
						</c:when>
					</c:choose>
				</ul>
			</div>
		</div>
</body>
</html>