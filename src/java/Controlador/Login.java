
package Controlador;

import DAOUM.ClienteCrud;
import DETOUM.ClienteClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rut = request.getParameter("txtuser");
        String nombre = request.getParameter("txtpass");
        String error = "";
        
        
        if (rut.equals("") || rut==null || nombre.equals("") || nombre==null) {
            
            error="Uno de lo dos campos estan vacios";
            request.getSession().setAttribute("Myerror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        else{
            
            
            ClienteClass cc = new ClienteClass(rut, nombre);
            ClienteCrud ccc = new ClienteCrud();
            
            if (ccc.verificador(cc)>0) {
                
                request.getSession().setAttribute("Myuser", cc);
                request.getRequestDispatcher("indexdelcliente.jsp").forward(request, response);
                
            }
            else{
                
             error="Credenciales Incorrectas";
            request.getSession().setAttribute("Myerror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response); 
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
