<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Cliente</title>
</head>
<body>

	<form action="AgregarCliente" method="POST">
	<h1> Agregar Cliente</h1>
		<div ><label>Nombre</label>	<input type="text" required="" name="nombre"> </div> <br>
		<div ><label>Apellido</label>	<input type="text" required="" name="apellido"> </div> <br>
		<div ><label>Telefono</label>	<input type="text" required="" name="telefono"> </div> <br>
		<button type="submit"> Enviar </button>
		<button type="submit" onclick="self.location.href = 'bienvenido.jsp'"> Volver </button>
	</form>

<br> <br> <p>Prometo ser esteticamente mas agradable en un futuro
</body>	
</html>