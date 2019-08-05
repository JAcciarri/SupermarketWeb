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

	<form action="ProductoAdd" method="POST">
	<h1> Agregar Producto</h1>
		<div ><label>Descripcion</label> <input type="text" required="" name="descripcion"> </div> <br>
		<div ><label>Precio</label>	<input type="text" required="" name="precio"> </div> <br>
		<div ><label>Categoria</label>	 <input type="text" disabled name="categoria"> </div> <br>
		<button type="submit" class="button-default"> Enviar </button>
		<button type="submit" onclick="self.location.href = 'productos.jsp'"> Volver </button>
	</form>

<br> <br> <p>Prometo ser esteticamente mas agradable en un futuro
</body>	
</html>