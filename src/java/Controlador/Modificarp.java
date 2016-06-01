
package Controlador;

import DAOUM.ProductoCrud;
import DETOUM.ProductoClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Modificarp extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
         
        String nombre = request.getParameter("txtnombre");
        String stock = request.getParameter("txtstock");
        String precio = request.getParameter("txtprecio");
        String error = "";
        
        if (nombre.equals("") || nombre == null || stock.equals("") || stock == null || precio.equals("") || precio==null) {
            
            error = "Los campos están vacios.";
            request.getSession().setAttribute("Myerror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
        else{
            
         int NuevoStock = 0;
         int sospechoso = 0;
         
            try {
                
                NuevoStock = Integer.parseInt(stock);
                
            } catch (NumberFormatException e) {
                
            error = "Numeros";
            request.getSession().setAttribute("Myerror", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);  
            
            sospechoso = 1;   
            }
            
                       
            if (sospechoso==0) {
                
            String codigo = (String)request.getSession().getAttribute("Mycodigo");
            ProductoClass pcc = new ProductoClass(nombre, NuevoStock, precio);
            pcc.setCodigo(codigo);
            
            ProductoCrud pc = new ProductoCrud();
           
     
            pc.update(pcc);
            
            String proceso = "Haz modificado satifactoriamente el producto";
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
