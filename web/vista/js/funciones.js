/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function() {
    
    $("#nuevoAuto").bind( "click", function() {
         if ($('#nuevoAuto').is(':checked')) {
             $("#kilometrajeGroup").hide();
             $("#stockGroup").show();
         }
         else{
             $("#kilometrajeGroup").show();
             $("#stockGroup").hide();
         }
    });
    
});


