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
    
    $('#modalReserva').on('show.bs.modal', function (event) {
    	  var button = $(event.relatedTarget); // Button that triggered the modal
    	  var titulo = button.data('titulo'); // Extract info from data-* attributes
    	  var id = button.data('id');
    	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
    	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
    	  var modal = $(this);
          modal.find('#id').val(id);
          modal.find('#titulo').text(titulo);
	});
     
    $("#botonReservaModal").click(function(e){
        $("#formReserva").submit();
    });
    
    $("#btnNuevoVendedor").click(function(){
        if ($("#spanNuevoVendedor").hasClass("glyphicon-plus")) {
            $("#formVendedor").show(400);
            $("#spanNuevoVendedor").removeClass("glyphicon-plus");
            $("#spanNuevoVendedor").addClass("glyphicon-minus");
        }
        else{
            $("#formVendedor").hide(400);
            $("#spanNuevoVendedor").removeClass("glyphicon-minus");
            $("#spanNuevoVendedor").addClass("glyphicon-plus");
        }
    });
});


