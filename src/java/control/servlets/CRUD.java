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
@WebServlet(name = "CRUD", urlPatterns = {"/CRUD"})
public class CRUD extends HttpServlet {

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
        
        String tipo = request.getParameter("tipo");
        
        if (tipo!=null) {
            switch (tipo){
                case "nuevoVehiculo":
                    String marca,modelo,detalles;
                    int año=-1,kilometraje=-1,precio=-1;
                    marca = request.getParameter("marca");
                    modelo = request.getParameter("modelo");
                    if (Utilidades.isNumeric(request.getParameter("anio"))){
                        año = Integer.valueOf(request.getParameter("anio"));
                    }
                    if (Utilidades.isNumeric(request.getParameter("kilometraje"))){
                        kilometraje = Integer.valueOf(request.getParameter("kilometraje"));
                    }
                    detalles = request.getParameter("detalles");
                    if (Utilidades.isNumeric(request.getParameter("precio"))){
                        precio = Integer.valueOf(request.getParameter("precio"));
                    }
                    int id = -1;
                    if(request.getParameter("id")!=null){
                      id = Integer.valueOf(request.getParameter("id"));  
                    }
                     
                    String mensaje = Factoria.crearVehiculo(id,false, marca, modelo, año, kilometraje, precio, 1, detalles, null,"DD/MM/AAAA");
                    if (mensaje.equals("El vehiculo se ha agregado con éxito")) {
                        request.setAttribute("tipoMensaje", "success");
                        request.setAttribute("mensajeTitulo", "Bien!");
                    }
                    else{
                        request.setAttribute("tipoMensaje", "error");
                        request.setAttribute("mensajeTitulo", "Error!");
                    }
                    request.setAttribute("mensaje", mensaje);
                    request.getRequestDispatcher("vista/index.jsp").forward(request, response);
                    break;
                default:
                    request.getRequestDispatcher("vista/index.jsp").forward(request, response);
                    break;
            }
        }
        
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

}
