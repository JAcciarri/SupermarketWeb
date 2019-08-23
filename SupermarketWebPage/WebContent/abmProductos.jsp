<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="datos.*"%>
<%@page import="entidades.*"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<link href="css\supermercado.css" rel="stylesheet" type="text/css">
<link href="css\navbar.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Productos</title>
</head>
<body>

		<ul>
		  <li><a href="bienvenido.jsp">Home</a></li>
		  <li><a href="abmClientes.jsp">ABM Clientes</a></li>
		  <li><a href="abmProductos.jsp">ABM Productos</a></li>
		  <li><a >About US</a></li>
		</ul>

	
		<h1 id="titleAbm">Lista de productos</h1>
		<br>
	<div id="navAbm">
			<button class="button-default" 
			onclick="self.location.href = 'productoAdd.jsp'">Agregar productos</button>.
		<br> <br>
	</div>
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
			<td  class="actions">
				<a href="ProductoEdit?id=<%=p.getIdProducto()%>" class="button-edit"> Editar </a>
				 <a href="ProductoDelete?id=<%=p.getIdProducto()%>" class="button-delete">Eliminar </a>
			</td>
		</tr>
		<%} %>
	</table>
	<br>
	
	
	
</body>
</html>