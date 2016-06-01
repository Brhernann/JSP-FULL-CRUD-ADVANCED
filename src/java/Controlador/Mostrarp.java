
package Controlador;

import DAOUM.ProductoCrud;
import DETOUM.ProductoClass;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Mostrarp extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String error = "";
        
        ProductoClass pc = new ProductoClass();
        ProductoCrud pcc = new ProductoCrud();
        
        ArrayList<ProductoClass> lista = (ArrayList<ProductoClass>) pcc.readall();
        
        if (lista.size()==0) {
            
            error="no hay Productos registrados!";
            
            request.getSession().setAttribute("Myerror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        else{
            
        request.getSession().setAttribute("Usuarios", lista);
        request.getRequestDispatcher("mostrarProductos.jsp").forward(request, response);
        
        
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
