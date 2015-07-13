

$(function() {
    $("#plupload").plupload({
        // General settings
        runtimes : 'html5,flash,silverlight,html4',
        url : "../Upload",
 
        // Maximum file size
        max_file_size : '5mb',
        max_file_count: 12,
//        multipart : true,
        multipart_params : {'id': $('#id').val()},
 
        // Resize images on clientside if we can
        resize : {
            width : 1000,
            height : 1000,
            quality : 100
//            crop: true // crop to exact dimensions
        },
 
        // Specify what files to browse for
        filters : [
            {title : "Image files", extensions : "jpg,gif,png,jpeg"}
        ],
 
        // Rename files by clicking on their titles
        rename: true,
         
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
        
//        init : {
//                    FileUploaded: function(up, file, info) {
//                        $('#actual').val(parseInt($('#actual').val())+1);
//                    }
//        },

        init : {
                    FileUploaded: function(up, file, info) {
                        var nombre = file.name.replace(/\s/g, '');
                        $('#fotos').val($('#fotos').val() +nombre+";");
                    },
                    FilesRemoved: function(up, files) {

                    plupload.each(files, function(file) {
                        var nombre = file.name.replace(/\s/g, '');
                        var fotos = $('#fotos').val().split(";");
                        $('#fotos').val("");
                        for (var i = 0; i < fotos.length; i++) {
                            if (fotos[i]===nombre||fotos[i]==='') {
                                   continue;
                             }
                             $('#fotos').val($('#fotos').val() +fotos[i]+";");
                        }
                    });
                    }
        },

 
        // Flash settings
        flash_swf_url : '../lib/plupload/js/Moxie.swf',
     
        // Silverlight settings
        silverlight_xap_url : '../lib/plupload/js/Moxie.xap'
        
        
    });
});