/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.persistencia.Empleado;
import modelo.servicios.Factoria;
import org.orm.PersistentException;

/**
 *
 * @author edisonarango
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws org.orm.PersistentException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, PersistentException {
        String tipo = request.getParameter("tipo");
        HttpSession sesion = request.getSession();
        if (tipo==null||tipo.equals("")) {
            if (sesion.getAttribute("nombre")!=null) {
                if (sesion.getAttribute("tipoUsuario").equals(0)){
                    request.getRequestDispatcher("vista/admin.jsp").forward(request, response);
                }
                else if(sesion.getAttribute("tipoUsuario").equals(1)){
                    request.setAttribute("reservas", Factoria.obtenerReservas());
                    request.getRequestDispatcher("vista/vendedor.jsp").forward(request, response);
                }
            }
            else{
                request.getRequestDispatcher("vista/login.jsp").forward(request, response);
            }  
        }
        else if (tipo.equals("login")) {
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("password");
            Empleado empleado = null;
            try {
                empleado = modelo.servicios.Login.iniciarSesion(usuario, pass);
            } catch (PersistentException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (empleado!=null) {
                sesion.setAttribute("nombre",empleado.getNombre());
                sesion.setAttribute("tipoUsuario", empleado.getTipoUsuario());
                sesion.setAttribute("id", empleado.getId());
                if (empleado.getTipoUsuario()==0) {
                    request.getRequestDispatcher("vista/admin.jsp").forward(request, response);
                }
                else if(empleado.getTipoUsuario()==1){
                    request.setAttribute("reservas", Factoria.obtenerReservas());   
                    request.getRequestDispatcher("vista/vendedor.jsp").forward(request, response);
                }
                else{
                    request.getRequestDispatcher("vista/index.jsp").forward(request, response);
                }
            }
            else{
                request.getRequestDispatcher("vista/login.jsp").forward(request, response);
            }
        }
        else if(tipo.equals("cerrarSesion")){
            sesion.invalidate();
            request.getRequestDispatcher("vista/index.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
