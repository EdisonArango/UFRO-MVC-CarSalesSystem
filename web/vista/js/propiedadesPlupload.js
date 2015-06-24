/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Initialize the widget when the DOM is ready
$(function() {
	$("#plupload").plupload({
		// General settings
		runtimes : 'html5,flash,html4',
		url : '',

		// User can upload no more then 20 files in one go (sets multiple_queues to false)
		max_file_count: 20,
		

		// Resize images on clientside if we can
		resize : {
			width : 500, 
			height : 500, 
			quality : 100
			//crop: true // crop to exact dimensions
		},
		
		filters : {
			// Maximum file size
			max_file_size : '5mb',
			// Specify what files to browse for
			mime_types: [
				{title : "Image files", extensions : "jpg,gif,png"}
			]
		},

		// Rename files by clicking on their titles
		rename: false,
		
		// Sort files
		sortable: true,

		// Enable ability to drag'n'drop files onto the widget (currently only HTML5 supports that)
		dragdrop: true,

		// Views to activate
		views: {
			list: true,
			thumbs: true, // Show thumbs
			active: 'thumbs'
		},

		// Flash settings
		flash_swf_url : '../lib/plupload/Moxie.swf',
                        
//                init : {
//                    FileUploaded: function(up, file, info) {
//                        $('#fotos').val($('#fotos').val() +limpiar(file.name)+";");
//                    },
//                    FilesRemoved: function(up, files) {
//                    // Called when files are removed from queue
//                    console.log('[FilesRemoved]');
//
//                    plupload.each(files, function(file) {
//                        var fotos = $('#fotos').val().split(";");
//                        $('#fotos').val("");
//                        for (var i = 0; i < fotos.length; i++) {
//                            if (fotos[i]===limpiar(file.name)||fotos[i]==='') {
//                                   continue;
//                             }
//                             $('#fotos').val($('#fotos').val() +fotos[i]+";");
//                        }
//                    });
//                    }
//                }
	}); 
});

