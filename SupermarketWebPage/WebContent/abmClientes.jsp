<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>	
<%@ page import="entidades.*" %>
<%@ page import="datos.*" %>
<!DOCTYPE html>
<html>
<link href="css\supermercado.css" rel="stylesheet" type="text/css">
<link href="css\navbar.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Agregar Cliente</title>
</head>
<body>

		<ul>
		  <li><a href="bienvenido.jsp">Home</a></li>
		  <li><a href="abmClientes.jsp">ABM Clientes</a></li>
		  <li><a href="abmProductos.jsp">ABM Productos</a></li>
		  <li><a >About US</a></li>
		</ul>

<%
	if(request.getAttribute("clientes")!=null){
		%>
		<br><br>
		<table class="table">
				<tr>
					<th>ID Cliente</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Telefono</th>
					<th>ACCIONES</th>
				</tr>
				<tr>
		<% 		
		ArrayList<Cliente> clientes = (ArrayList<Cliente>)request.getAttribute("clientes");
		
		for (Cliente c : clientes){
		%>
			
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
			<button class="button-default" onclick="self.location.href = 'abmClientes.jsp'">Volver</button>
	<% }
	else {%>
			<br>
			<h1 id="titleAbm">Lista de clientes</h1>
				
			<div id="navAbm">
				<form action="ClienteSearch" method="GET">
					<input type="text" name="descripcion" size="30px" 
					autocomplete="off" placeholder="Nombre del Cliente"> 
					<button type="submit" class="button-default" ">Buscar</button>
				</form>
				<br>
		<button type="submit" class="button-default"
		onclick="self.location.href='clienteAdd.jsp'">Agregar nuevo cliente</button>
		
			</div>
			<br>
			<table class="table">
				<tr>
					<th>ID Cliente</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Telefono</th>
					<th>ACCIONES</th>
				</tr>
				<%
					ArrayList<Cliente> listaClientes = DBCliente.getAllClientes();
					for(Cliente c : listaClientes){
					%>
				<tr>
					<td><%=c.getIdCliente() %></td>
					<td><%=c.getNombre() %></td>
					<td><%=c.getApellido() %></td>
					<td><%=c.getTelefono() %></td>
					<td class="actions">
						<a href="ClienteEdit?id=<%=c.getIdCliente()%>" class="button-edit"> Editar </a>
						<a href="ClienteDelete?id=<%=c.getIdCliente()%>" class="button-delete"> Eliminar </a>
					</td>
				</tr>
				
				<%} %>
				</table>
				<br> 
		
	 <br><br>
	<% }%>	
	

</body>
</html>