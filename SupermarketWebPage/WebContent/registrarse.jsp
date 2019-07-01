<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="styles.css" rel="stylesheet" type="text/css">
    <head>
        <meta charset="utf-8">
        <title>Sign In</title>
        <link rel="stylesheet" href="styles.css">
    </head>
<html>    
    <body>
        <div class="box">
            <h2>Sign In</h2>
            <form name="signin" method="post" action="SignInServlet" autocomplete="off">
            	<div class="inputBox">
                    <input type="text" name="nombre" required="">
                    <label>Nombre</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="apellido" required="">
                    <label>Apellido</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="username" required="">
                    <label>Username</label>
                </div>
                <div class="inputBox">
                    <input type="password" name="password" required="">
                    <label>Password</label>
                </div>
                <div class="button">
                	<button id="signin2" type="submit" > Registrarse
                </div>
            </form>
        </div>
    </body>
</html>