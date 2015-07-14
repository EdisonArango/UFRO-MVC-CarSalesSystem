<%-- 
    Document   : agregarAuto
    Created on : 27-may-2015, 17:56:44
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="vista/css/estilos.css"/>
        <link rel="stylesheet" href="vista/lib/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.9/themes/base/jquery-ui.css"/>
        <link rel="stylesheet" href="vista/lib/plupload/jquery.ui.plupload/css/jquery.ui.plupload.css"/>
        <!--<link rel="stylesheet" href="lib/bootstrap/css/bootstrap-theme.min.css"/>-->
        <script src="vista/lib/jquery1.11.2.js"></script>
        <script src="vista/lib/bootstrap/js/bootstrap.min.js"></script>
        <script src="vista/lib/plupload/jquery-ui.js"></script>
        <script src="vista/lib/plupload/plupload.full.min.js"></script>
        <script src="vista/lib/plupload/jquery.ui.plupload/jquery.ui.plupload.js"></script>
        <script src="vista/lib/plupload/i18n/es.js"></script>
        <script src="vista/js/propiedadesPlupload.js"></script>
        <script src="vista/js/funciones.js"></script>
        <title>Agregar Auto</title>
    </head>
    <body style="background-color: #d4d3d3">
        <div id="header"></div>
        <div style="margin-left: 300px;margin-right: 300px;padding: 10px;background-color: #ffffff">
            <h2>Agregar nuevo auto</h2>
            <div style="margin-bottom: 4px;" class="border_bottom"></div>
            <form method="get" action="CRUD" enctype="multipart/form-data">
            <input type="hidden" name="tipo" value="nuevoVehiculo">
            <input type="hidden" name="fotos" id="fotos" value="">            
            <div class="row">
                
                <div class="form-group col-md-4">
                  <label for="marca">Marca:</label>
                  <select class="form-control" name="marca" id="marca">
                      <option value="Ferrari">Ferrari</option> 
                      <option value="Lamborghini">Lamborghini</option>   
                      <option value="Audi">Audi</option>   
                      <option value="BMW">BMW</option> 
                      <option value="otro">Otro</option>   
                  </select>
                </div>
                        
                <div id="marcaText" class="form-group col-md-4" style="display:none">
                  <label for="marcaText">Marca:</label>
                  <input type="text" class="form-control"  name="marcaText" placeholder="Chevrolet">
                </div>
                
                <div class="form-group col-md-4">
                  <label for="modelo">Modelo:</label>
                  <input type="text" class="form-control" id="modelo" name="modelo" placeholder="Camaro">
                </div>
                
                <div class="form-group col-md-4">
                    <label for="anio" class="control-label">Año:</label>
                    <input type="number" class="form-control" id="año" name="anio" placeholder="2015">
                </div>
                
            </div>
                    
                 <div class="row">
                     
                  <div class="form-group col-md-4">
                      <div style="margin-left: 20px;" class="checkbox">
                        <label>
                            <input type="checkbox" id="nuevoAuto" name="nuevo" value="nuevo"> Auto nuevo
                        </label>
                      </div>
                  </div>
                               
                  <div id="kilometrajeGroup" class="form-group col-md-6">
                      <div class="form-inline">
                            <label class="margenArriba" for="kilometraje" >Kilometraje:</label>
                            <input type="number" name="kilometraje" class="form-control" id="kilometraje" placeholder="25000">&nbsp; Km
                      </div>
                  </div>
                     
                  <div style="display: none" id="stockGroup" class="form-group col-md-8">
                    <div class="form-inline">
                      <label for="stock">Stock:</label>
                      <input type="number" name="stock" class="form-control" id="stock" placeholder="10">
                    </div>
                  </div>
                     
                
                 </div>
                        <div class="form-group">
                        <label for="detalles" class="control-label">Detalles:</label>
                        <div>
                            <textarea name="detalles" rows="4" class="form-control" id="detalles" placeholder="Ingrese los detalles del vehículo"></textarea>
                        </div>
                </div>
                    
                <div class="form-group">
                    <label  for="precio">Precio (CLP)</label>
                    <div class="input-group">
                      <div class="input-group-addon">$</div>
                      <input type="text" class="form-control" id="precio" name="precio" placeholder="Valor">
                      <!--<div class="input-group-addon">.00</div>-->
                    </div>
                  </div>
            
            <div id="plupload">No sirve el plupload</div>
            <br>
            <button style="width: 200px;" type="submit" class="btn btn-primary">Guardar</button>
            </form>
        </div>
    </body>
</html>
