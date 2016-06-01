
package Controlador;

import DAOUM.ClienteCrud;
import DAOUM.CompraCrud;
import DAOUM.ProductoCrud;
import DETOUM.ClienteClass;
import DETOUM.CompraClass;
import DETOUM.ProductoClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


public class Comprar extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


   String fecha = request.getParameter("date");
   String cantidad = request.getParameter("txtcantidad");
   String rut_cli = request.getParameter("txtrut");
   String cod_pro = request.getParameter("txtcombo");

   String error = "";

        if (fecha.equals("") || fecha==null || cantidad.equals("") || cantidad==null 
              || rut_cli.equals("") || rut_cli==null) {

           error = "Los campos estan vacios";
           request.getSession().setAttribute("Myerror", error);
           request.getRequestDispatcher("error.jsp").forward(request, response);
           
        }

        else{
            
           
            int NuevaCantidad= 0;
            
            NuevaCantidad  = Integer.parseInt(cantidad);
            
            //________________________________________COMPRA
            
                  CompraClass compra= new CompraClass(fecha, NuevaCantidad, rut_cli, cod_pro);
                  CompraCrud com = new CompraCrud();

            //_________________________________________CLIENTE
            
                  ClienteCrud conec = new ClienteCrud();
                  ClienteClass code = new ClienteClass(rut_cli);
                  
           //_____________________________________________PRODUCTO       
          
                  ProductoCrud cnnpro = new ProductoCrud();
                  ProductoClass leer = cnnpro.read(cod_pro);
                  
                  int stocke = leer.getStock() - NuevaCantidad;
                  
                 leer.setStock(stocke);
 
                  if(conec.verificador(code)>0){
                      
                      if(leer.getStock()>=0){
                      
                          cnnpro.update(leer);
                          com.create(new CompraClass(fecha, NuevaCantidad, rut_cli, cod_pro)); 
                          String proceso = "Compra exitosa";
                          request.getSession().setAttribute("myProcess", proceso);
                          request.getRequestDispatcher("ProcesoExistoso.jsp").forward(request, response); 
                      
                      }
                      else{
                        error = "No hay productos";
                       request.getSession().setAttribute("Myerror", error);
                       request.getRequestDispatcher("error.jsp").forward(request, response);
                      
                      }
                  
                
                }
                else{
                
              error = "Rut no registrado";
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
