package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EliminarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/signin.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\" />        \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("             <header>\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("           <div class=\"col-lg-10\"></div>\r\n");
      out.write("           <div class=\"col-lg-2\">\r\n");
      out.write("               \r\n");
      out.write("            <a href=\"admin.jsp\">Admin</a>  <a href=\"LoginClient.jsp\">LoginClient</a>  \r\n");
      out.write("               \r\n");
      out.write("           </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"row\">\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"col-lg-4\"></div>\r\n");
      out.write("               <div class=\"col-lg-4\">\r\n");
      out.write("                 \r\n");
      out.write("                   <h1><b>SOMOS  SUSHIPIANTE</b></br>\r\n");
      out.write("                   <span class=\"small\"><b>Eliminar Clientes</b></span></h1>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-lg-4\"></div>\r\n");
      out.write("               \r\n");
      out.write("           </div>\r\n");
      out.write("       <div>\r\n");
      out.write("            </br>\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("                <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            \r\n");
      out.write("                            <b><a href=\"index.jsp\" class=\"navbar-brand\">ADMINROOT</a></b>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                       \r\n");
      out.write("                             <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                 \r\n");
      out.write("                          <li class=\"dropdown\"> \r\n");
      out.write("                            <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">\r\n");
      out.write("                                Productos <span class=\"caret\"></span></a>\r\n");
      out.write("                                \r\n");
      out.write("                         <ul class=\"dropdown-menu\">\r\n");
      out.write("                                   \r\n");
      out.write("                              <li><a href=\"RegistrarProducto.jsp\">Registrar Producto</a></li>  \r\n");
      out.write("                              <li><a href=\"validarProducto.jsp\">Modificar Producto</a></li>\r\n");
      out.write("                              <li><a href=\"mostrarp.do\">Ver productos</a> </li>\r\n");
      out.write("                              <li> <a href=\"eliminarProductos.jsp\">Eliminar Productos</a></li>\r\n");
      out.write("                         </ul>\r\n");
      out.write("                             \r\n");
      out.write("                          </li>\r\n");
      out.write("                          \r\n");
      out.write("                          <li class=\"dropdown\">\r\n");
      out.write("                              \r\n");
      out.write("                           <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">\r\n");
      out.write("                               Clientes <span class=\"caret\"> </a>\r\n");
      out.write("                               \r\n");
      out.write("                               <ul class=\"dropdown-menu\">\r\n");
      out.write("                                   \r\n");
      out.write("                              <li><a href=\"registroCliente.jsp\">Registrar cliente</a></li>  \r\n");
      out.write("                              <li><a href=\"ValidarCliente.jsp\">Modificar cliente</a></li>\r\n");
      out.write("                              <li><a href=\"mostrarc.do\">Ver clientes</a> </li>\r\n");
      out.write("                              <li> <a href=\"EliminarCliente.jsp\">Eliminar clientes</a></li>   \r\n");
      out.write("                                   \r\n");
      out.write("                               </ul>    \r\n");
      out.write("                              \r\n");
      out.write("                          </li>\r\n");
      out.write("                          \r\n");
      out.write("                          <li class=\"dropdown\">\r\n");
      out.write("                              \r\n");
      out.write("                              <a href=\"\" class=\"dropdown-toggle\"data-toggle=\"dropdown\" role=\"button\"> \r\n");
      out.write("                                Ventas <span class=\"caret\"> </a>\r\n");
      out.write("                                \r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    \r\n");
      out.write("                              <li><a href=\"mostrarv.do\">Ver ventas concretadas</a> </li>          \r\n");
      out.write("                              <li> <a href=\"EliminarVentas.jsp\">Eliminar ventas</a></li>   \r\n");
      out.write("                                 </ul> \r\n");
      out.write("                          \r\n");
      out.write("                          </li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                       </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("            </header>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-lg-4\"></div>\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("                \r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("          \r\n");
      out.write("              <form action=\"eliminarc.do\" method=\"POST\">\r\n");
      out.write("            \r\n");
      out.write("            Ingrese Rut: <input class=\"form-control\" type=\"text\" name=\"txtrut\" size=\"10\" />\r\n");
      out.write("            </br>\r\n");
      out.write("            <span>Volver <a href=\"admin.jsp\">atras</a></span>\r\n");
      out.write("            </br></br>\r\n");
      out.write("            <input type=\"submit\" value=\"Eliminar\" class=\"btn-primary\" />\r\n");
      out.write("            \r\n");
      out.write("        </form> \r\n");
      out.write("            \r\n");
      out.write("        </div>   \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4\"></div>\r\n");
      out.write("            \r\n");
      out.write("        </div>   \r\n");
      out.write("         <script src=\"js/jquery.js\">  </script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\">  </script>  \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
