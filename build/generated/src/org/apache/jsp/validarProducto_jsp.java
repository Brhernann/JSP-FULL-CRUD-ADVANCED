package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class validarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/signin.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\" />\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-lg-4\"></div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    \n");
      out.write("                    <h1><b>Ingrese producto a modificar</b></h1>   \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\"></div>\n");
      out.write("           </div>\n");
      out.write("        </header> \n");
      out.write("        </br></br>     \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("             <div class=\"col-lg-4\"></div>\n");
      out.write("             <div class=\"col-lg-4\">\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     \n");
      out.write("         <form action=\"verificarp.do\" method=\"POST\">\n");
      out.write("            \n");
      out.write("             Ingrese codigo: <input class=\"form-control\" type=\"text\" name=\"txtcodigo\" size=\"10\" />\n");
      out.write("         </br>\n");
      out.write("         <span>Volver <a href=\"admin.jsp\">atras</a></span>\n");
      out.write("         </br></br>\n");
      out.write("         <input type=\"submit\" value=\"Buscar\" name=\"btnbuscar\" class=\"btn-primary\" />\n");
      out.write("        </form>   \n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("             </div>\n");
      out.write("             <div class=\"col-lg-4\"></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
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
