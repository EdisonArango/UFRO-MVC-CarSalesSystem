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
        <link rel="stylesheet" href="vista/css/styles.css"/>
        <link rel="stylesheet" href="vista/lib/bootstrap/css/bootstrap.min.css"/>
        <!--<link rel="stylesheet" href="vista/lib/bootstrap/css/bootstrap-theme.min.css"/>-->
        <script src="vista/lib/jquery1.11.2.js"></script>
        <script src="vista/lib/bootstrap/js/bootstrap.min.js"></script>
        <title>Car Sales System</title>
    </head>
    <body>

        <header class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
              <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                </button>
              </div>
              
              <a class="col-md-3 navbar-brand" href="#">Car Sales System</a>
              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                  <li><a href="vista/agregarAuto.jsp">Ingresar</a></li>
                </ul>
                  
                  <form class="navbar-form">
                    <div class="form-group" style="display:inline;">
                      <div class="input-group" style="display:table;">
                        <span class="input-group-addon" style="width:1%;"><span class="glyphicon glyphicon-search"></span></span>
                        <input class="form-control" name="busqueda" placeholder="Busqueda" type="text">
                        <!--<button class="input-group-addon glyphicon glyphicon-search" type="submit"></button>-->
                      </div>
                    </div>
                </form>
              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
          </header>
        <div style="height:55px;" id="spacer"></div>
        
        <div class="left col-md-3 border_right" style="height: 100%" role="complementary">
                <h4>Busqueda por marca:</h4>
                    <div>
                        <ul class="nav">
                        <li><a href="?busqueda=Alfa%20Romeo">Alfa Romeo</a></li>
                        <li><a href="#" >Audi</a></li>
                        <li><a href="#" >BMW</a></li>
                        <li><a href="#" >Bugatti</a></li>
                        <li><a href="#" >Chevrolet</a></li>
                        <li><a href="#" >Lamborghini</a></li>
                        <li><a href="#">Nissan</a></li>
                        <li><a href="#" >Renault <span class="label label-info">Nuevo</span></a></li>
                        </ul>
                    </div>
                <div style="height:300px;"></div>
            </div>
        
        <% 
                String mensaje = (String)request.getAttribute("mensaje");
                if(mensaje!=null&&mensaje!=""){ %>
                <div style="padding-left: 26%;" class="alert alert-${tipoMensaje} alert-dismissable mensaje">
                      <button type="button" class="close" data-dismiss="alert">&times;</button>
                      <strong>${mensajeTitulo}</strong> ${mensaje}
                </div>
       <% } %>
        <ul>
            <li style="padding-left: 10px;" class="media border_bottom">
                <div class="media-left">
                  <a href="#">
                    <img style="width: 150px;height: 110px;" class="thumbnail" src="vista/resources/lamborghini.jpg" alt="">
                  </a>
                </div>
                 <div style="padding-top:12px; " class="media-body">
                    <h4><a href="#" class="media-heading">Lamborghini Venom</a></h4>
                    <ul class="list-inline">
                        <li class="border_right">0 Km</li>
                        <li><b>2015</b></li>
                      </ul>
                </div>
                 <div style="padding-right: 20px" class="media-right danger">
                     <h2 class="text-danger">$650.000.000</h2>
                 </div>
            </li>
        </ul>
        
        <center>
            <ul class="pagination">
                <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                <li ><a href="#">2 <span class="sr-only"></span></a></li>
                <li ><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
            </ul>
        </center>
    
    </body>
</html>
