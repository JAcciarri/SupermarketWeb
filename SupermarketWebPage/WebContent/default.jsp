<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" %>
<%@ page import = "entidades.Cliente"%>
<%@ page import = "datos.DBCliente"%>
<%@ page import = "java.util.ArrayList"%>
<link href="styles.css" rel="stylesheet" type="text/css">

<head>
	<title>Supermarket Web</title>
</head>

	<p>Listado de usuarios y contraseñas</p>
	<table id="tabla">
		<tr>
		<td>Id</td>
		<td>Nombre</td>
		<td>Apellido</td>
		</tr>
		<%
			DBCliente consult = new DBCliente();
			ArrayList<Cliente> listaClientes = consult.getUsuarios();
				for (int i=0;i<listaClientes.size();i++)
				{
				out.println("<tr>");
				out.println("<td>"+listaClientes.get(i).getIdCliente()+"</td>");
				out.println("<td>"+listaClientes.get(i).getNombre()+"</td>");
				out.println("<td>"+listaClientes.get(i).getApellido()+"</td>");
				out.println("</tr>");
				}
		%>
	</table>
		<a href="login.jsp">Log in here</href>
</body>
</html>