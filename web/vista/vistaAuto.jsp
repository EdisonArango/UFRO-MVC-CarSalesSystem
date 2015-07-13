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
    <% Vehiculo vehiculo = (Vehiculo)request.getAttribute("vehiculo"); %>
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
        <input type="hidden" id="fotoPrincipal" value="<%=vehiculo.imagenes.toArray()[0].getRuta()%>">
        <div class="row" style="margin: 12px;">
            <div class="col-md-4" style="padding: 0px;">
                <a class="galeriaFancybox" data-fancybox-group="thumb" href="file/<%=vehiculo.imagenes.toArray()[0].getRuta()%>"><img src="file/<%=vehiculo.imagenes.toArray()[0].getRuta()%>" style="width: 100%;"></a>
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
                        <h1 style="margin-top: 0px;"><%=vehiculo.getMarca()%> <%=vehiculo.getModel()%></h1>
                        <h2 class="text-danger" style="padding-left: 15px;margin-top: 0px;">$&nbsp;<%=Utilidades.numeroADinero(vehiculo.getPrecio()) %></h2>               
                    </div>
                    <div class="col-md-2">
                        <a href="#" class="btn btn-primary" style="padding:10px;padding-right: 30px;padding-left: 30px;margin-top: 20px;">Reservar</a>
                    </div>
                </div>
                
                <div style="margin-bottom: 67px;margin-top: 3px;" class="border_bottom"></div>
                <div id='galeria'></div>
                <h3>Detalles:</h3>
                <div style="margin-bottom: 3px;" class="border_bottom"></div>
                <p class="lead"><%=vehiculo.getDetalles()%></p>
            </div>
        </div>
        
    </body>
</html>
