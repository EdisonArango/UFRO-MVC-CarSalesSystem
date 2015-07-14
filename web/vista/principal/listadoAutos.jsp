<%-- 
    Document   : listadoAutos
    Created on : 09-jul-2015, 18:41:04
    Author     : edisonarango
--%>

<%@page import="control.util.Utilidades"%>
<%@page import="modelo.persistencia.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<ul style="padding-left: 0px;">
    <% 
       Vehiculo[] vehiculos = (Vehiculo[])request.getAttribute("autos");
       boolean permisoEdicion = false;
       if (session.getAttribute("tipoUsuario")!=null&&(session.getAttribute("tipoUsuario").equals(0)||session.getAttribute("tipoUsuario").equals(1))) {
               permisoEdicion = true;
        }
        for (int i=0;i< vehiculos.length;i++){ %>
            <li class="media border_bottom">
                <div class="media-left">
                  <a href="VistaAuto?id=<%=vehiculos[i].getId()%>">
                    <img style="width: 150px;height: 110px;" class="thumbnail"
                       <% if(!vehiculos[i].imagenes.isEmpty()){ 
                            out.print("src='file/"+vehiculos[i].imagenes.toArray()[0].getRuta()+"'");
                            } else {
                           out.print("src='vista/resources/sin-imagen.png'");
                            } %>
                         alt="">
                  </a>
                </div>
                <div style="padding-top:12px; " class="media-body">
                     <h4 style="display: inline-block"><a href="VistaAuto?id=<%=vehiculos[i].getId()%>" class="media-heading"><%=vehiculos[i].getMarca()%> <%=vehiculos[i].getModel()%> 
                         <% if(vehiculos[i].getNuevo()==1){ %>
                         <span class="label label-info">Nuevo</span>
                         <% } %>
                         </a>
                     </h4>
                     <% if(permisoEdicion){ %>
                            <a href="#" class="btn btn-primary btn-xs" style="display: inline-block"><span class="glyphicon glyphicon-edit"></span> Editar</a>
                            <a href="#" data-toggle='modal' data-target='#modalEliminar' data-url="CRUD?tipo=eliminarVehiculo&id=<%=vehiculos[i].getId()%>" class="btn btn-danger btn-xs" style="display: inline-block"><span class="glyphicon glyphicon-remove"></span> Eliminar</a>
                     <% } %>
                    <ul class="list-inline">
                        <li class="border_right"><%=vehiculos[i].getKilometraje() %> Km</li>
                        <li><b><%=vehiculos[i].getAño() %></b></li>
                      </ul>
                </div>
                 <div style="padding-right: 20px" class="media-right danger">
                     <h2 class="text-danger">$&nbsp;<%=Utilidades.numeroADinero(vehiculos[i].getPrecio()) %></h2>
                 </div>
            </li>
    <% } %>              
</ul>
        
<center>
    <ul class="pagination">
        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
        <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
        <li ><a href="#">2 <span class="sr-only"></span></a></li>
        <li ><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
    </ul>
</center>
