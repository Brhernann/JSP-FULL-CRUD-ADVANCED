package Controlador;



import DAOUM.ProductoCrud;
import DETOUM.ProductoClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Eliminar extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        String codigo = request.getParameter("txtcodigo");
        String error = "";
        
        if (codigo.equals("") || codigo == null) {
            
            error = "Los campos esta vacios";
            request.getSession().setAttribute("Myerror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        else{
            
            ProductoClass pc = new ProductoClass(codigo);
            ProductoCrud pcc = new ProductoCrud();
            
            if (pcc.delete(codigo)) {
                
                String proceso = "Haz eliminado exitosamente un producto";
                request.getSession().setAttribute("myProcess", proceso);
                request.getRequestDispatcher("ProcesoExistoso.jsp").forward(request, response);
            }
            
            else{
                
            error = "El codigo no existe";
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
