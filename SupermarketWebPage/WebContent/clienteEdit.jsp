<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="entidades.*" %>
<!DOCTYPE html>
<html>
<link href="css\supermercado.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% HttpSession Sesion = request.getSession(false);
   Cliente c = (Cliente) Sesion.getAttribute("cliente");
 	%>
 	
 	<div class="box">
		<form action="ClienteEdit" method="POST">
			<h1>Editar Cliente</h1>
			<div class="inputBox">
				<input type="text" required="" name="id" readonly value="<%=c.getIdCliente()%>">
			</div>
			<br>
			<div class="inputBox">
				<input type="text" name="nombre" value="<%=c.getNombre()%>" autocomplete="off">
			</div>
			<br>
			<div class="inputBox">
				<input type="text" name="apellido" value="<%=c.getApellido()%>">
			</div>
			<div class="inputBox">
			<input type="text" name="telefono" value="<%=c.getTelefono()%>">
			</div>
			<br>
			<button type="submit" class="button-default">Actualizar</button>
			<button type="submit" class="button-return"
				onclick="self.location.href = 'abmClientes.jsp'">Volver</button>
		</form>
	</div>

</body>
</html>