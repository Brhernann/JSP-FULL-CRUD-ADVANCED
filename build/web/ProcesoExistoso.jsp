<%-- 
    Document   : ProcesoExistoso
    Created on : 27-may-2016, 14:06:12
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/bootstrap-responsive.css" />
	<link rel="stylesheet" href="css/signin.css" />
        <link rel="stylesheet" href="css/estilos.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
                
        <header>
            
            <div class="row">
               
                <div class="col-lg-4"></div>
                <div class="col-lg-4">
                 
                    <h1><b>Validador de procesos</b></h1>
          
                </div>
                <div class="col-lg-4"></div>
                
                
            </div>
            
        </header> 
        </br>
        
        <div class="row">
            
            <div class="container">
                
      <%
        
        String proceso = (String)request.getSession().getAttribute("myProcess");
       
        out.println("<h2><b>"+proceso+"</b></h2>");
        
        %>   
                
         <span>Volver <a href="index.jsp"> Inicio</a></span> </br>
        <span>Volver a home <a href="admin.jsp"> admin </a></span></br>
        <span>Volver a home <a href="indexdelcliente.jsp">cliente</a></span> </br>
        <span>Mostrar <a href="mostrarp.do">Productos</a></span></br>
        <span>Mostrar <a href="mostrarc.do">Clientes</a></span></br>
        <span>Mostrar <a href="mostrarv.do">Ventas</a></span></br>
            </div>
       

        
            
        </div>

    </body>
</html>
