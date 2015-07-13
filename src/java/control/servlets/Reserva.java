/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servlets;

import control.util.Utilidades;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.servicios.Factoria;

/**
 *
 * @author edisonarango
 */
@WebServlet(name = "Reserva", urlPatterns = {"/Reserva"})
public class Reserva extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        int idVehiculo;
        if (Utilidades.isNumeric(request.getParameter("id"))) {
            idVehiculo = Integer.valueOf(request.getParameter("id"));
        }
        else{
            request.setAttribute("tipoMensaje", "danger");
            request.setAttribute("mensajeTitulo", "Lo Sentimos!");
            request.setAttribute("mensaje", "El id de vehículo no es válido");
            redirigir ("Inicio",request,response);
            return;
        }
        String nombre = request.getParameter("nombre");
        if (nombre==null||nombre.equals("")) {
            request.setAttribute("tipoMensaje", "warning");
            request.setAttribute("mensajeTitulo", "Error!");
            request.setAttribute("mensaje", "Por favor ingrese nombre");
            redirigir ("VistaAuto?id="+idVehiculo,request,response);
            return;
        }
        String telefono = request.getParameter("telefono");
        if (telefono==null||telefono.equals("")) {
            request.setAttribute("tipoMensaje", "warning");
            request.setAttribute("mensajeTitulo", "Error!");
            request.setAttribute("mensaje", "Por favor ingrese teléfono");
            redirigir ("VistaAuto?id="+idVehiculo,request,response);
            return;
        }
        String correo = request.getParameter("correo");
        if (correo==null||correo.equals("")) {
            request.setAttribute("tipoMensaje", "warning");
            request.setAttribute("mensajeTitulo", "Error!");
            request.setAttribute("mensaje", "Por favor ingrese correo");
            redirigir ("VistaAuto?id="+idVehiculo,request,response);
            return;
        }
        String mensaje = Factoria.crearReserva(idVehiculo, nombre, telefono, correo);
        switch (mensaje) {
            case "Error al realizar reserva":
                request.setAttribute("tipoMensaje", "danger");
                request.setAttribute("mensajeTitulo", "Error!");
                request.setAttribute("mensaje", mensaje);
                break;
            case "Este vehiculo no esta disponible en el momento":
                request.setAttribute("tipoMensaje", "warning");
                request.setAttribute("mensajeTitulo", "Lo sentimos!");
                request.setAttribute("mensaje", mensaje);
                break;
            case "La reserva se ha realizado con éxito":
                request.setAttribute("tipoMensaje", "success");
                request.setAttribute("mensajeTitulo", "Bien!");
                request.setAttribute("mensaje", mensaje);
                break;
        }
        redirigir ("VistaAuto?id="+idVehiculo,request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void redirigir (String url,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher(url).forward(request, response);
    }
}
