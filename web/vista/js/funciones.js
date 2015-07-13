/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function() {
    
    $("#nuevoAuto").change(function() {
         if ($('#nuevoAuto').is(':checked')) {
             $("#kilometrajeGroup").hide();
             $("#stockGroup").show();
         }
         else{
             $("#kilometrajeGroup").show();
             $("#stockGroup").hide();
         }
    });
    
    $("#marca").bind("change", function () {
        if ($("#marca").val()==="otro") {
            $("#marcaText").show();
        }
        else{
            $("#marcaText").hide();
        }
    });
    
    $("#listadoAutos").load("Inicio?tipo=listadoAutos");
    $("#header").load("Inicio?tipo=header");
    $("#galeria").load("VistaAuto?id="+$("#id").val()+"&tipo=slider&fotoPrincipal="+$("#fotoPrincipal").val());
});


