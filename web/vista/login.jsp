<%-- 
    Document   : login
    Created on : 13-jul-2015, 15:33:27
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
        <title>Login - CarSalesSystem</title>
    </head>
    <body>
        <div style="margin-left:33%;margin-right: 33%;background: #e4e0e0;padding-top:10px;padding-bottom: 20px;border: 1px solid #cccccc;">
            
            <!-- Mensaje -->
            <% 
            String mensaje = (String)request.getAttribute("mensaje");
            if(mensaje!=null&&mensaje!=""){ %>
            <div class="alert alert-${tipoMensaje} alert-dismissable mensaje">
                  <button type="button" class="close" data-dismiss="alert">&times;</button>
                  <center><p class="letraMediana"><strong>${mensajeTitulo}</strong> ${mensaje}<p></center>
            </div>
           <% } %>
            
                <h2 class="text-center">CarSalesSystem</h2>
                <div class="border_bottom" style="margin-top: 3px;margin-bottom: 10px;"></div>
                <form action="Login" method="post" class="form-horizontal">
                    <input type="hidden" name="tipo" value="login">
                    <div class="form-group" style="margin:5px;">
                        <label for="usuario" class="col-md-3 control-label">Usuario:</label>
                        <div class="col-md-9">
                            <input type="text" class= "form-control" name="usuario" id="usuario" placeholder="Usuario">
                        </div>
                    </div>
                    <div class="form-group" style="margin:5px;">
                        <label for="password" class="col-md-3 control-label">Contraseña:</label>
                        <div class="col-md-9">
                            <input type="password" class="form-control" name="password" id="password" placeholder="Contraseña">
                        </div>
                    </div>
                    <center><input type="submit" class="btn btn-primary" value="Iniciar Sesión"></center>
                </form>
        </div>
    </body>
</html>
