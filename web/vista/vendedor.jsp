<%-- 
    Document   : vendedor
    Created on : 13-jul-2015, 18:13:37
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="vista/lib/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="vista/css/estilos.css"/>
        <!--<link rel="stylesheet" href="vista/lib/bootstrap/css/bootstrap-theme.min.css"/>-->
        <script src="vista/lib/jquery1.11.2.js"></script>
        <script src="vista/lib/bootstrap/js/bootstrap.min.js"></script>
        <script src="vista/js/funciones.js"></script>
        <title>Página Vendedor - CarSalesSystem</title>
    </head>
    <body>
        <div id="header"></div>
        <h1>Hola <%=session.getAttribute("nombre")%></h1>
    </body>
</html>
