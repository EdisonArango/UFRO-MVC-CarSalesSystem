<%-- 
    Document   : admin
    Created on : 13-jul-2015, 16:08:01
    Author     : edisonarango
--%>

<%@page import="control.util.Utilidades"%>
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
        <title>Admin Page - CarSalesSystem</title>
    </head>
    <body>
        <% if (session.getAttribute("nombre")==null){ 
                request.setAttribute("tipoMensaje", "warning");
                request.setAttribute("mensajeTitulo", "Error!");
                request.setAttribute("mensaje", "Debe iniciar sesión para poder ver este página");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        else if (!session.getAttribute("tipoUsuario").equals(0)){
            request.setAttribute("tipoMensaje", "warning");
            request.setAttribute("mensajeTitulo", "Error!");
            request.setAttribute("mensaje", "No tiene permisos para ver esta página");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        %>
        <div id="header"></div>
        <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 sidebar">
                <img src="vista/resources/sin-imagen.png" class="thumbnail" style="width: 100%;margin-top: 20px;margin-bottom: 20px;">
                <div class="border_bottom" style="margin-bottom: 10px;"></div>
                <b>Ver Detalles Del:</b>
                <div class="radio">
                <label>
                  <input type="radio" name="detalles" id="opcionDetalle1" value="dia" checked>
                  Día
                </label>
                </div>
                <div class="radio">
                  <label>
                    <input type="radio" name="detalles" id="opcionDetalle2" value="semana">
                    Semana
                  </label>
                </div>
                <div class="radio">
                  <label>
                    <input type="radio" name="detalles" id="opcionDetalle3" value="mes">
                    Mes
                  </label>
                </div>
                <div class="radio">
                  <label>
                    <input type="radio" name="detalles" id="opcionDetalle4" value="siempre">
                    Siempre
                  </label>
                </div>
            </div>
            <div class="col-md-10 col-md-offset-2 main">
                <!-- Mensaje -->
                <% 
                String mensaje = (String)request.getAttribute("mensaje");
                if(mensaje!=null&&mensaje!=""){ %>
                <div class="alert alert-${tipoMensaje} alert-dismissable mensaje" style="margin-top:10px;">
                      <button type="button" class="close" data-dismiss="alert">&times;</button>
                      <center><p class="letraMediana"><strong>${mensajeTitulo}</strong> ${mensaje}<p></center>
                </div>
               <% } %>
                <div class="row" style="margin-top: 20px;">
                    <div class="col-md-6">
                        <div class="row">
                            <div class="col-md-7">
                                <h2>Autos Vendidos:</h2>
                            </div>
                            <div class="col-md-5">
                                <p class="lead leadCentrado">4</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="col-md-7">
                            <h2>Autos Agregados:</h2>
                        </div>
                        <div class="col-md-5">
                            <p class="lead leadCentrado">13</p>
                        </div>
                    </div>
                </div>
                <div class="border_bottom" style="margin-top: 0px;margin-bottom: 7px;"></div>
                <div class="row">
                    <div class="col-md-6">
                        <h2>Ingresos Por Ventas:</h2>
                    </div>
                    <div class="col-md-6">
                        <h2 class="text-danger" style="">$&nbsp;<%=Utilidades.numeroADinero(234568000) %></h2>
                    </div>
                </div>
                <div class="border_bottom" style="margin-top: 10px;margin-bottom: 20px;"></div>
                <div class="row">
                    <div class="col-md-6">
                        <button id="btnNuevoVendedor" class="btn btn-primary btn-block" style="font-size: 1.5em;margin-bottom: 5px;"><span id="spanNuevoVendedor" class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;Agregar Nuevo Vendedor</button>
                        <div style="border: 1px solid #cccccc;display: none;" id="formVendedor">
                            <form class="form-horizontal" action="CRUD" method="post" style="margin: 20px;">
                                <input type="hidden" name="tipo" value="nuevoEmpleado">
                                <div class="form-group">
                                    <label class="control-label" for="nombre">Nombre:</label>
                                    <input class="form-control" type="text" name="nombre" placeholder="Nombre">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="nombre">Usuario:</label>
                                    <input class="form-control" type="text" name="usuario" placeholder="Usuario">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="nombre">Contraseña:</label>
                                    <input class="form-control" type="password" name="password" placeholder="Contraseña">
                                </div>
                                <center><input type="submit" class="btn btn-primary" value="Crear Vendedor"></center>
                            </form>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <a href="NuevoAuto" class="btn btn-success btn-block" style="font-size: 1.5em;"><span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;Agregar Nuevo Auto</a>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </body>
</html>
