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
        <link rel="stylesheet" href="css/styles.css"/>
        <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.9/themes/base/jquery-ui.css"/>
        <link rel="stylesheet" href="lib/plupload/jquery.ui.plupload/css/jquery.ui.plupload.css"/>
        <!--<link rel="stylesheet" href="lib/bootstrap/css/bootstrap-theme.min.css"/>-->
        <script src="lib/jquery1.11.2.js"></script>
        <script src="lib/bootstrap/js/bootstrap.min.js"></script>
        <script src="lib/plupload/jquery-ui.js"></script>
        <script src="lib/plupload/plupload.full.min.js"></script>
        <script src="lib/plupload/jquery.ui.plupload/jquery.ui.plupload.js"></script>
        <script src="lib/plupload/i18n/es.js"></script>
        <script src="js/propiedadesPlupload.js"></script>
        <title>Agregar Auto</title>
    </head>
    <body>
        <h1>Agregar nuevo auto</h1>
        <form method="get" action="../CRUD">
            <input type="hidden" name="tipo" value="nuevoVehiculo">
                <div class="form-inline">
                    <div class="form-group">
                      <label for="marca">Marca</label>
                      <select class="form-control" name="marca" id="marca">
                          <option value="ferrari">Ferrari</option> 
                          <option value="lamborghini">Lamborghini</option>   
                          <option value="audi">Audi</option>   
                          <option value="BMW">BMW</option>   
                      </select>
                    </div>
                    <div class="form-group">
                      <label for="modelo">Modelo</label>
                      <input type="text" class="form-control" id="modelo" name="modelo" placeholder="Camaro">
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                    <label for="año" class="col-sm-2 control-label">Año</label>
                    <div class="col-sm-10">
                      <input type="number" class="form-control" id="año" name="anio" placeholder="2015">
                    </div>
                  </div>
                    <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                      <div class="checkbox">
                        <label>
                          <input type="checkbox" name="nuevo"> Auto nuevo
                        </label>
                      </div>
                    </div>
                    </div>
                  <div class="form-group">
                    <label for="kilometraje" class="col-sm-2 control-label">Kilometraje</label>
                    <div class="col-sm-10">
                      <input type="number" name="kilometraje" class="form-control" id="kilometraje" placeholder="25000"> Km
                    </div>
                    </div>
                   
                    <div class="form-group">
                        <label for="detalles" class="col-sm-2 control-label">Detalles</label>
                        <div class="col-sm-10">
                            <textarea name="detalles" rows="4" class="form-control" id="detalles" placeholder="Ingrese los detalles del vehículo"></textarea>
                        </div>
                    </div>
                    
                    <div class="form-group">
                    <label class="sr-only" for="precio">Precio (CLP)</label>
                    <div class="input-group">
                      <div class="input-group-addon">$</div>
                      <input type="text" class="form-control" id="precio" name="precio" placeholder="Valor">
                      <!--<div class="input-group-addon">.00</div>-->
                    </div>
                  </div>
                </div>
            <div id="uploader">No sirve el plupload</div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
    </body>
</html>
