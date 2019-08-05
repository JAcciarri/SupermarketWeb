<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.*"%>
<%@page import="entidades.*"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<link href="css\supermercado.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>

	<div class="box">
		<h2>Loggeado correctamente</h2>
		<h3>Cuenta de Admin</h3>
	</div>

	<br>
	<h1>Lista de clientes</h1>
		<form action="ClienteSearch" method="POST">
			<input type="text" name="descripcion" size="30px" placeholder="Nombre del Cliente"> 
			<button type="submit" class="button-default">Buscar</button>
			<br><br>
		</form>
	<table class="table">
		<tr>
			<th>ID Cliente</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Telefono</th>
			<th>ACCIONES</th>
		</tr>
		<%
			ArrayList<Cliente> clientes = DBCliente.getAllClientes();
			for(Cliente c : clientes){
			%>
		<tr>
			<td><%=c.getIdCliente() %></td>
			<td><%=c.getNombre() %></td>
			<td><%=c.getApellido() %></td>
			<td><%=c.getTelefono() %></td>
			<td>
				<a href="ClienteEdit?id=<%=c.getIdCliente()%>" class="button-edit"> Editar </a>
				<a href="ClienteDelete?id=<%=c.getIdCliente()%>" class="button-delete"> Eliminar </a>
			</td>
		</tr>
		<%} %>
	</table>
	<br>
	<button class="button-default" onclick="self.location.href = 'clienteAdd.jsp'">Agregar cliente</button>
	<button class="button-default" onclick="self.location.href = 'productos.jsp'">Ver Productos</button>

</body>
</html>