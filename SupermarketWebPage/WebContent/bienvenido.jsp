<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.*"%>
<%@page import="entidades.*"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<link href="css/supermercado.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="box">
		<h2>Loggeado correctamente</h2>
		<h2>I can see you're actually an admin</h2>
	</div>

	<br>
	<h1>Lista de clientes</h1>
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

</body>
</html>