<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="datos.*" %>
 <%@page import="entidades.*" %>
 <%@page import="java.util.ArrayList" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> Lista de clientes<br>
<%
	ClienteDB cliDB = new ClienteDB();
		DBCliente cons = new DBCliente();
		DBCliente consult = new DBCliente();
		ArrayList <Cliente> clientes = consult.getUsuarios();
		for (Cliente c : clientes){
		    String nombre = c.getNombre();
		    String apellido = c.getApellido();
		    out.println(nombre+ " "+ apellido+"\n");
		}
%>
</body>
</html>