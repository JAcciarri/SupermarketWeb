<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css\supermercado.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="box">
		<form action="ClienteAdd" method="POST">
			<h1>Agregar Cliente</h1>
			<div class="inputBox">
				<input type="text" required="" name="nombre" placeholder="Nombre" autocomplete="off">
			</div>
			<br>
			<div class="inputBox">
				<input type="text" required=""  name="apellido" placeholder="Apellido" autocomplete="off">
			</div>
			<br>
			<div class="inputBox">
				 <input type="text" required="" name="telefono" placeholder="Telefono" autocomplete="off">
			</div>
			<br>
			<button type="submit" class="button-default">Agregar</button>
			<button type="submit" class="button-return"
				onclick="self.location.href = 'abmClientes.jsp'">Volver</button>
		</form>
	</div>
</body>
</html>