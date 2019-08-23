<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="css\supermercado.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Agregar Productos</title>
</head>
<body>

	<div class="box">
		<form action="ProductoAdd" method="POST">
			<h1>Agregar Producto</h1>
			<div class="inputBox">
				<input type="text" required="" name="descripcion" placeholder="Descripcion" autocomplete="off">
			</div>
			<br>
			<div class="inputBox">
				<input type="text" required=""  name="precio" placeholder="Precio" autocomplete="off">
			</div>
			<br>
			<div class="inputBox">
				 <input type="text" required="" name="categoria" placeholder="Categoria" disabled autocomplete="off">
			</div>
			<br>
			<button type="submit" class="button-default">Agregar</button>
			<button type="submit" class="button-return"
				onclick="self.location.href = 'abmProductos.jsp'">Volver</button>
		</form>
	</div>

<br> <br> 
</body>	
</html>