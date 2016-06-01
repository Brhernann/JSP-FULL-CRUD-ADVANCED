package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/signin.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\" />\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.js\">  </script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\">  </script> \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sushipiante</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body class=\"color2\">\n");
      out.write("       \n");
      out.write("     <header>\n");
      out.write("         <div class=\"row\">\n");
      out.write("           <div class=\"col-lg-10\"></div>\n");
      out.write("           <div class=\"col-lg-2\">\n");
      out.write("               \n");
      out.write("            <a href=\"admin.jsp\">Admin</a> <a href=\"LoginClient.jsp\">LoginClient</a> <a href=\"registroCliente.jsp\">Sing up</a>   \n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"row\">\n");
      out.write("               \n");
      out.write("               <div class=\"col-lg-4\"></div>\n");
      out.write("               <div class=\"col-lg-4\">\n");
      out.write("                 \n");
      out.write("                   <h1><b>BIENVENIDO A SUSHIPIANTE</b>\n");
      out.write("                   <span class=\"small\"><b>Las mejores ratas</b></span></h1>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-lg-4\"></div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("       </header>\n");
      out.write("       \n");
      out.write("           <div class=\"container\">\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("         \n");
      out.write("            <div id=\"carousel-1\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                \n");
      out.write("                <ol class=\"carousel-indicators\"> \n");
      out.write("                \n");
      out.write("                    <li data-target=\"#carousel-1\" data-slide-to=\"0\" class=\"active\"> </li>\n");
      out.write("                    <li data-target=\"#carousel-1\" data-slide-to=\"1\"> </li>\n");
      out.write("                    <li data-target=\"#carousel-1\" data-slide-to=\"2\"> </li>\n");
      out.write("                </ol> \n");
      out.write("                \n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        \n");
      out.write("                     <img src=\"Images/image1.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("                        \n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            \n");
      out.write("                            <h3>SIEMBRA DEL DIOS HACHI'S</h3>\n");
      out.write("                            <p>la canabbis mas chora del pule</p>\n");
      out.write("                            \n");
      out.write("                        </div>     \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                        \n");
      out.write("                        <img src=\"Images/image2.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            \n");
      out.write("                            <h3>SIEMBRA DEL DIOS META'S</h3> \n");
      out.write("                            <p>la canabbis mas chora del pule</p>\n");
      out.write("                        </div>     \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                        \n");
      out.write("                        <img src=\"Images/image2.png\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("                        \n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            \n");
      out.write("                            <h3>SIEMBRA DEL DIOS CANAB'S</h3>\n");
      out.write("                            <p>la canabbis mas chora del pule</p>\n");
      out.write("                  </div>     \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <a href=\"#carousel-1\" class=\"left carousel-control\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"> </span>\n");
      out.write("                <span class=\"sr-only\">Anterior</span>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                 <a href=\"#carousel-1\" class=\"right carousel-control\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"> </span>\n");
      out.write("                <span class=\"sr-only\">Siguiente</span>\n");
      out.write("                </a>\n");
      out.write("            </div>    \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     <section class=\"main row\">\n");
      out.write("         \n");
      out.write("         <div class=\"col-lg-4\"> \n");
      out.write("             </br>\n");
      out.write("          Bienvenido a la pagina de los mejores shushipiantes de maipu, para nosotros es un agrado darte lo mejor de <b>comer</b>,\n");
      out.write("         programando java jsp con todo el estilo posile del mercado capial y la lluvia se comio al sol para demostrar\n");
      out.write("         choreza y agua cafe para dos humanos y el otro dia el perro comio la laucha tenia sed\n");
      out.write("         </div>\n");
      out.write("          \n");
      out.write("         <div class=\"col-lg-4\">\n");
      out.write("             </br>    \n");
      out.write("     <p class=\"\">Bienvenido a la pagina de los mejores shushipiantes de maipu, para nosotros es un agrado darte lo mejor de <b>comer</b>,\n");
      out.write("         programando java jsp con todo el estilo posile del mercado capial y la lluvia se comio al sol para demostrar\n");
      out.write("         choreza y agua cafe para dos humanos y el otro dia el perro comio la laucha tenia sed\n");
      out.write("    </p>    \n");
      out.write("         </div>\n");
      out.write("          </br>\n");
      out.write("          <div class=\"col-lg-4\"><code>Bienvenido a la pagina de los mejores shushipiantes de maipu, para nosotros es un agrado darte lo mejor de <b>comer</b>,\n");
      out.write("         programando java jsp con todo el estilo posile del mercado capial y la lluvia se comio al sol para demostrar\n");
      out.write("         choreza y agua cafe para dos humanos y el otro dia el perro comio la laucha tenia sed</code></div>\n");
      out.write("          </br>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("       </br>\n");
      out.write("       \n");
      out.write("     <div class=\"row\">\n");
      out.write("              \n");
      out.write("              <div class=\"col-lg-4\"></div>\n");
      out.write("              <div class=\"col-lg-4\">\n");
      out.write("                  Registrate <a href=\"registroCliente.jsp\">aqui</a> para comprar o Entra <a href=\"LoginClient.jsp\">Aqui</a> si ya tienes cuenta \n");
      out.write("                  &nbsp; <a href=\"Comprar.jsp\"> <input type=\"submit\" value=\"Compra Express\" class=\"btn-success\" /> </a>\n");
      out.write("             </div>\n");
      out.write("              <div class=\"col-lg-4\"></div>\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("       \n");
      out.write("       </br>\n");
      out.write("       \n");
      out.write("       <footer class=\"col-lg-12\">\n");
      out.write("      \n");
      out.write("        <b>Brhernann</b>\n");
      out.write("        \n");
      out.write("  </footer>\n");
      out.write("   \n");
      out.write("       </body>\n");
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
