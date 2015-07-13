<%-- 
    Document   : header
    Created on : 12-jul-2015, 22:15:32
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">  
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
              
              <a class="col-md-2 navbar-brand" href="Inicio" style="margin-right: 45px;">Car Sales System</a>
              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                  <li><a href="NuevoAuto">Ingresar</a></li>
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
          </div>
