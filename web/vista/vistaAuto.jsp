<%-- 
    Document   : vistaAuto
    Created on : 13-jul-2015, 3:04:06
    Author     : edisonarango
--%>

<%@page import="control.util.Utilidades"%>
<%@page import="modelo.persistencia.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% Vehiculo vehiculo = (Vehiculo)request.getAttribute("vehiculo"); 
        boolean nuevo = false;
        if (vehiculo.getNuevo()==1) {
                nuevo=true;
        }
        boolean sinFotos = false;
        if (vehiculo.imagenes.isEmpty()) {
            sinFotos=true;    
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="vista/lib/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="vista/css/estilos.css"/>
        <script src="vista/lib/jquery1.11.2.js"></script>
        <script type="text/javascript" src="vista/lib/Jssor/jssor.js"></script>
        <script type="text/javascript" src="vista/lib/Jssor/jssor.slider.js"></script>
        <script type="text/javascript" src="vista/lib/fancybox/jquery.fancybox.js?v=2.1.5"></script>
	<link rel="stylesheet" type="text/css" href="vista/lib/fancybox/jquery.fancybox.css?v=2.1.5" media="screen" />
        <script src="vista/lib/bootstrap/js/bootstrap.min.js"></script>
        <script src="vista/js/funciones.js"></script>
        <script type="text/javascript">
        $(document).ready(function() {
                /*
                 *  Thumbnail helper. Disable animations, hide close button, arrows and slide to next gallery item if clicked
                 */

                $('.galeriaFancybox').fancybox({
                        prevEffect : 'elastic',
                        nextEffect : 'elastic',
                        openEffect : 'elastic',
                        openSpeed  : 150,
                        closeEffect : 'elastic',
                        closeSpeed  : 150,
                        closeBtn  : true,
                        arrows    : true,
                        nextClick : true
                });
        });
	</script>
        <title><%=vehiculo.getMarca()%> <%=vehiculo.getModel()%></title>
    </head>
    <body>
        <div id="header"></div>
        <input type="hidden" id="id" value="<%=vehiculo.getId()%>">
        <% if(!sinFotos){ %>
         <input type="hidden" id="fotoPrincipal" value="<%=vehiculo.imagenes.toArray()[0].getRuta()%>">
         <% } %>
        <div class="row" style="margin: 12px;">
            <!-- Mensaje -->
            <% 
            String mensaje = (String)request.getAttribute("mensaje");
            if(mensaje!=null&&mensaje!=""){ %>
            <div class="alert alert-${tipoMensaje} alert-dismissable mensaje">
                  <button type="button" class="close" data-dismiss="alert">&times;</button>
                  <center><p class="letraMediana"><strong>${mensajeTitulo}</strong> ${mensaje}<p></center>
            </div>
           <% } %>
            
            <div class="col-md-4" style="padding: 0px;">
                <% if (sinFotos) {%>
                   <img src="vista/resources/sin-imagen.png" style="width: 100%;">
                <%}else{%>               
                    <a class="galeriaFancybox" data-fancybox-group="thumb" href="file/<%=vehiculo.imagenes.toArray()[0].getRuta()%>"><img src="file/<%=vehiculo.imagenes.toArray()[0].getRuta()%>" style="width: 100%;"></a>
                <%}%>
                <h3>Características</h3>
                <div style="margin-bottom: 3px;" class="border_bottom"></div>
                <div class="row">
                    <div class="col-md-4">
                        <b class="letraMediana">Marca:</b>
                    </div>
                    <div class="col-md-8">
                        <p class="letraMediana"><%=vehiculo.getMarca()%><p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <b class="letraMediana">Modelo:</b>
                    </div>
                    <div class="col-md-8">
                        <p class="letraMediana"><%=vehiculo.getModel() %></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <b class="letraMediana">Año:</b>
                    </div>
                    <div class="col-md-8">
                        <p class="letraMediana"><%=vehiculo.getAño()%></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <b class="letraMediana">Kilometraje:</b>
                    </div>
                    <div class="col-md-8">
                        <p class="letraMediana"><%=vehiculo.getKilometraje()%> Km</p>
                    </div>
                </div>
            </div>
            <div class="col-md-8">
                <div class="row">
                    <div class="col-md-10">
                        <h1 style="margin-top: 0px;"><%=vehiculo.getMarca()%> <%=vehiculo.getModel()%> <% if(nuevo){ %> <span class="label label-info" style="font-size:0.3em;">Nuevo</span> <%}%> </h1>
                        <h2 class="text-danger" style="padding-left: 15px;margin-top: 0px;">$&nbsp;<%=Utilidades.numeroADinero(vehiculo.getPrecio()) %></h2>               
                    </div>
                    <div class="col-md-2">
                        <a href="#" class="btn btn-primary" data-toggle='modal' data-target='#modalReserva' data-id='<%=vehiculo.getId()%>' data-titulo='<%=vehiculo.getMarca()%> <%=vehiculo.getModel()%>' style="padding:10px;padding-right: 30px;padding-left: 30px;margin-top: 20px;">Reservar</a>
                    </div>
                </div>
                <% if(nuevo){
                %>
                <div style="margin-top: 3px;" class="border_bottom"></div>
                <div class="row">
                    <div class="col-md-2" >
                        <h3 style="margin-bottom:1px;">Stock:</h3>&nbsp;&nbsp;
                    </div>
                    <p style="margin-top:18px;font-size: 1.5em;"><%=vehiculo.getStock()%></p>
                </div>
                <%} else{%>
                <div style="margin-bottom: 67px;margin-top: 3px;" class="border_bottom"></div>
                <%}%>
                <% if (!sinFotos) {%>
                   <div id='galeria'></div>
                <%}else{%>
                    <div style="height:150px;"></div>
                <%}%>
                <h3>Detalles:</h3>
                <div style="margin-bottom: 3px;" class="border_bottom"></div>
                <p class="lead"><%=vehiculo.getDetalles()%></p>
            </div>
        </div>
            
        <!-- Modal -->
        <div class="modal fade" id="modalReserva" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h3 class="modal-title" id="exampleModalLabel">Reservar Vehículo</h3>
                        <div class="border_bottom"></div>
		        <br>
<!-- 		        <b>Médico:</b> <p id="id-medico"></p> -->
				<div class="row">
                                    <div class="col-md-4"><b class="letraMediana">Vehículo</b> <p class="letraMediana" id="titulo"></p></div>
				</div> 
		      </div>
		      <div class="modal-body">
		        <form id="formReserva" action="Reserva" method="post">
		          <div class="form-group">
		            <label for="paciente" class="control-label">Nombre:</label>
		            <input type="text" class="form-control" name="nombre" id="nombre">
		          </div>
		          <div class="form-group">
		            <label for="clave" class="control-label">Teléfono:</label>
		            <input type="text" class="form-control" name="telefono" id="telefono">
		          </div>
                          <div class="form-group">
		            <label for="clave" class="control-label">Correo Electrónico:</label>
		            <input type="text" class="form-control" name="correo" id="correo">
		          </div>
		            <input type="hidden" class="form-control" name="id" id="id">
	            <div class="form-group">
		          </div>
		        </form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
		        <button id="botonReservaModal" type="button" class="btn btn-primary">Reservar</button>
		      </div>
		    </div>
		  </div>
		</div>
        
    </body>
</html>
