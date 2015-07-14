<%-- 
    Document   : index
    Created on : 20-abr-2015, 11:50:53
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
        <title>Car Sales System</title>
    </head>
    <body>

        <div id="header"></div>
        
        <div class="container-fluid">
        <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <br>
                <h4>Busqueda por marca:</h4>
                    <ul class="nav">
                        <li><a href="?busqueda=Alfa%20Romeo">Alfa Romeo</a></li>
                        <li><a href="#" >Audi</a></li>
                        <li><a href="#" >BMW</a></li>
                        <li><a href="#" >Bugatti</a></li>
                        <li><a href="#" >Chevrolet</a></li>
                        <li><a href="#" >Lamborghini</a></li>
                        <li><a href="#" >Nissan</a></li>
                        <li><a href="#" >Renault </a></li>
                    </ul>
        </div>
        
         <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
             
            <% 
            String mensaje = (String)request.getAttribute("mensaje");
            if(mensaje!=null&&mensaje!=""){ %>
            <div style="padding-left: 26%;margin-top: 10px;" class="alert alert-${tipoMensaje} alert-dismissable mensaje">
                  <button type="button" class="close" data-dismiss="alert">&times;</button>
                  <p class="letraMediana"><strong>${mensajeTitulo}</strong> ${mensaje}<p>
            </div>
           <% } %>

           <div id="listadoAutos"></div>
         </div>
        </div>
        </div>
           
        <!-- Modal -->
        <div class="modal fade" id="modalEliminar" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                  <h3 class="modal-title" id="exampleModalLabel">Eliminar Vehículo</h3>
                </div>
                <div class="modal-body">
                    <center> <p class="lead">¿Esta seguro que desea eliminar este vehículo?</p></center>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                  <a href="" id="botonEliminar" class="btn btn-danger">Eliminar</a>
                </div>
              </div>
            </div>
        </div>
    </body>
</html>
