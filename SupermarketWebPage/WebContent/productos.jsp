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
<title>Productos</title>
</head>
<body>
	<h1>Lista de productos</h1>
	<table class="table">
		<tr>
			<th>ID Producto</th>
			<th>Descripcion</th>
			<th>Precio</th>
			<th>ACCIONES</th>
		</tr>
		<%
			ArrayList<Producto> productos = DBProducto.getAllProducts();
			for(Producto p : productos){
			%>
		<tr>
			<td><%=p.getIdProducto() %></td>
			<td><%=p.getDescProducto() %></td>
			<td><%=p.getPrecio() %></td>
			<td>
				<a href="ClienteEdit?id=<%=p.getIdProducto()%>" class="button-edit"> Editar </a>
				 <a href="ClienteDelete?id=<%=p.getIdProducto()%>" class="button-delete">Eliminar </a>
			</td>
		</tr>
		<%} %>
	</table>
	<br>
	<button class="button-default" onclick="self.location.href = 'productoAdd.jsp'">Agregar productos</button>.
	<button class="button-default" onclick="self.location.href = 'bienvenido.jsp'">Menu Principal</button>
	
</body>
</html>