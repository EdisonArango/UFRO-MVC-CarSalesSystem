<%-- 
    Document   : vendedor
    Created on : 13-jul-2015, 18:13:37
    Author     : edisonarango
--%>

<%@page import="modelo.persistencia.Venta"%>
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
    <body style="background: #d4d4d4">
        <div id="header"></div>
        <div style="margin-left: 20%;margin-right: 20%;background: #FFF;padding: 50px;padding-top: 10px !important;">
            
            <!-- Mensaje -->
            <% 
            String mensaje = (String)request.getAttribute("mensaje");
            if(mensaje!=null&&mensaje!=""){ %>
            <div class="alert alert-${tipoMensaje} alert-dismissable mensaje">
                  <button type="button" class="close" data-dismiss="alert">&times;</button>
                  <center><p class="letraMediana"><strong>${mensajeTitulo}</strong> ${mensaje}<p></center>
            </div>
           <% } %>
            
            <h3>Gestión de Reservas</h3>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Vehículo</th>
                        <th>Nombre</th>
                        <th>Teléfono</th>
                        <th>Correo</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <% Venta[] reservas=(Venta[])request.getAttribute("reservas");
                    for (int i=0; i<reservas.length; i++){ %>
                        <tr>
                            <td><%=i+1%></td>
                            <td><a href="VistaAuto?id=<%=reservas[i].getVehiculo().getId()%>" class="btn btn-link" style="padding-top: 0px;"><%=reservas[i].getVehiculo().getMarca()%> <%=reservas[i].getVehiculo().getModel()%></a></td>
                            <td><%=reservas[i].getReservador().getNombre()%></td>
                            <td><%=reservas[i].getReservador().getTelefono()%></td>
                            <td><%=reservas[i].getReservador().getCorreo()%></td>
                            <td>
                                <a href="CRUD?tipo=venderVehiculo&id=<%=reservas[i].getId()%>&idEmpleado=<%=session.getAttribute("id")%>" class="btn btn-primary btn-xs"><span class="glyphicon glyphicon-ok"></span>&nbsp;Vender</a>
                                <a href="CRUD?tipo=eliminarReserva&id=<%=reservas[i].getId()%>" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span>&nbsp;Eliminar</a>
                            </td>
                        </tr>
                   <% } %>
                </tbody>
            </table>
        </div>
    </body>
</html>
