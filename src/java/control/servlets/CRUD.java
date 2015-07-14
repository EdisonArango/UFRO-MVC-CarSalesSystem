/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servlets;

import control.util.Utilidades;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.servicios.Factoria;
import org.orm.PersistentException;

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
                    int año=-1,kilometraje=-1,precio=-1,stock=-1;
                    marca = request.getParameter("marca");
                    if (marca.equals("otro")) {
                        marca = request.getParameter("marcaText");
                    }
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
                    if (Utilidades.isNumeric(request.getParameter("stock"))){
                        stock = Integer.valueOf(request.getParameter("stock"));
                    }
                    int id = -1;
                    if(request.getParameter("id")!=null){
                      id = Integer.valueOf(request.getParameter("id"));  
                    }
                    boolean nuevo = false;
                    if (request.getParameter("nuevo")!=null&&request.getParameter("nuevo").equals("nuevo")) {
                        nuevo = true;
                    }
                    
                    String fotosStr = request.getParameter("fotos");
                    String fotos[] = null;
                    if (fotosStr != null && !fotosStr.equals("")) {
                        fotos = fotosStr.split(";");
                    }
                    String mensaje = Factoria.crearVehiculo(id,nuevo, marca, modelo, año, kilometraje, precio, stock, detalles, fotos);
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
//                    response.sendRedirect("Inicio?mensaje="+mensaje);
                    break;
                case "nuevoEmpleado":
                    String usuario = request.getParameter("usuario");
                    String nombre = request.getParameter("nombre");
                    String pass = request.getParameter("password");
                    String resultado = Factoria.crearEmpleado(nombre, usuario, pass, 1);
                    if (resultado.equals("Se ha creado el empleado con éxito")) {
                        request.setAttribute("tipoMensaje", "success");
                        request.setAttribute("mensajeTitulo", "Bien!");
                    }
                    else{
                        request.setAttribute("tipoMensaje", "danger");
                        request.setAttribute("mensajeTitulo", "Error!");
                    }
                    request.setAttribute("mensaje", resultado);
                    request.getRequestDispatcher("vista/admin.jsp").forward(request, response);
                    break;
                case "eliminarReserva":
                    String idReserva = request.getParameter("id");
                    if (Factoria.eliminarReserva(idReserva)) {
                        request.setAttribute("tipoMensaje", "success");
                        request.setAttribute("mensajeTitulo", "Bien!");
                        request.setAttribute("mensaje", "Se ha eliminado correctamente la reserva");
                        System.out.println("Exito, pronto al login");
                    }
                    else{
                        request.setAttribute("tipoMensaje", "danger");
                        request.setAttribute("mensajeTitulo", "Error!");
                        request.setAttribute("mensaje", "Se ha producido un error al eliminar la reserva");
                        System.out.println("Fracaso, pronto al login");
                    }
                    try {
                        request.setAttribute("reservas", Factoria.obtenerReservas());
                        request.getRequestDispatcher("vista/vendedor.jsp").forward(request, response);
                    } catch (PersistentException ex) {
                        request.getRequestDispatcher("vista/index.jsp").forward(request, response);
                    }
                    
                    break;
                 case "venderVehiculo":
                    String idReser = request.getParameter("id");
                    String idEmpleado = request.getParameter("idEmpleado");
                    if (Factoria.venderVehiculo(idReser,idEmpleado)) {
                        request.setAttribute("tipoMensaje", "success");
                        request.setAttribute("mensajeTitulo", "Bien!");
                        request.setAttribute("mensaje", "El vehículo se ha vendido con éxito");
                    }
                    else{
                        request.setAttribute("tipoMensaje", "danger");
                        request.setAttribute("mensajeTitulo", "Error!");
                        request.setAttribute("mensaje", "Error al vender el vehículo");
                    }
                    try {
                        request.setAttribute("reservas", Factoria.obtenerReservas());
                        request.getRequestDispatcher("vista/vendedor.jsp").forward(request, response);
                    } catch (PersistentException ex) {
                        request.getRequestDispatcher("vista/index.jsp").forward(request, response);
                    }
                    break;
                 case "eliminarVehiculo":
                     String idVehiculo = request.getParameter("id");
                     if (Factoria.eliminarVehiculo(idVehiculo)) {
                        request.setAttribute("tipoMensaje", "warning");
                        request.setAttribute("mensajeTitulo", "Eliminado!");
                        request.setAttribute("mensaje", "El vehículo se ha eliminado con éxito");
                     }
                     else{
                         request.setAttribute("tipoMensaje", "danger");
                        request.setAttribute("mensajeTitulo", "Error!");
                        request.setAttribute("mensaje", "Error al eliminar el vehículo");
                     }
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
