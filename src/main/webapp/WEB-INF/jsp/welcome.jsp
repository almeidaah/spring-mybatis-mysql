<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/">Listagem</a></li>
					<li><a href="/search">Buscar</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h1>Spring Boot - Listagem de Clientes</h1>
			<h3>(JSP + Spring-Boot + Spring Mybatis + MySQL)</h3>
		</div>

		<c:if test="${not empty listUsers}">

			<ul>
				<c:forEach var="user" items="${listUsers}">
					<li>${user.id}- ${user.username} - ${user.password} -
						${user.is_enabled} - <fmt:formatDate pattern="dd/MM/yyy"
							value="${user.register_date}" /> - ${user.name} -
						${user.surname} - ${user.email} - ${user.phone}
					</li>
				</c:forEach>
			</ul>

		</c:if>
		<c:if test="${empty listUsers}">
			<ul>
				<li>Não foram encontrados usuários</li>
			</ul>
		</c:if>
	</div>


	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<div class="footer navbar-fixed-bottom">

		<div class="container" style="font-size:1.4em">
			<p class="text-muted">Fernando Almeida - https://twitter.com/falmeidaah - https://github.com/almeidaah</p>
		</div>
	</div>


</body>



</html>
