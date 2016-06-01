
package Controlador;

import DAOUM.ClienteCrud;
import DETOUM.ClienteClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Modificarc extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("NombreUsuario");
        String contraseña = request.getParameter("Contrasena");
        String nombre = request.getParameter("Nombre");
        String edad = request.getParameter("Edad");
       
        String error = "";
        
        if (usuario.equals("") || usuario == null || contraseña.equals("") || contraseña==null
             || nombre.equals("") || nombre==null || edad.equals("") 
                || edad==null)  {
            
           error="Los campos estan vacios, procura llenarlos TODOS!";
           request.getSession().setAttribute("Myerror", error);
           request.getRequestDispatcher("error.jsp").forward(request, response);
            
        }
        
        else{
        
        int nuevaEdad = 0;
        int sospechosa = 0;
        
        try {
            nuevaEdad = Integer.parseInt(edad);
        } catch (NumberFormatException e) {
            
           error="Ingresa tu edad en Numeros!";
           request.getSession().setAttribute("Myerror", error);
           request.getRequestDispatcher("error.jsp").forward(request, response);
           sospechosa = 1;
            
        }
        
     
        
            if (sospechosa ==0) {
             
            String rut = (String) request.getSession().getAttribute("Myrut");
            ClienteClass cl = new ClienteClass(nombre, nuevaEdad);
            cl.setRut(rut);
            
            ClienteCrud cc = new ClienteCrud();
            
            cc.update(cl);
            
            String proceso = "Haz modificado satifactoriamente los datos del cliente";
            request.getSession().setAttribute("myProcess", proceso);
            request.getRequestDispatcher("ProcesoExistoso.jsp").forward(request, response);
        
                
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
