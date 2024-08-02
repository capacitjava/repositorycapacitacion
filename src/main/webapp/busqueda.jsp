<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!-- IMPORTA TAG DE STRUTS -->
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>

<!-- CDN DE BOOTSTRAP -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Filtrado de Productos</title>
</head>
<body>
<h2>BUSQUEDA DE PRODUCTOS Ó FILTRADO</h2>
<br>
<nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <form action="consulta.action" class="d-flex" role="search" method="post">
      <input name="nombre" id="nombre" class="form-control me-2" 
      type="search" placeholder="Busqueda Productos" 
      aria-label="Busqueda Productos">
      <button class="btn btn-outline-success" type="submit">Buscar</button>
    </form>
  </div>
</nav>

<br>
<h2>LISTADO DE PRODUCTOS</h2>
<br>

<table class="table table-dark table-striped">
	<tr>
		<td>ID</td>
		<td>NOMBRE</td>
		<td>PRECIO</td>
	</tr>
  <s:iterator value="listaProductos">
  	<tr>
  		<td><s:property value="id" /></td>
  		<td><s:property value="nombre" /></td>
  		<td><s:property value="precio" /></td>
  	</tr>
  </s:iterator>	
</table>

</body>
</html>







