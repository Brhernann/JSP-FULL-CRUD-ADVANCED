<%-- 
    Document   : validarProducto
    Created on : 26-may-2016, 23:28:57
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
                    
                    <h1><b>Ingrese producto a modificar</b></h1>   
                    
                </div>
                <div class="col-lg-4"></div>
           </div>
        </header> 
        </br></br>     
        
        <div class="row">
            
             <div class="col-lg-4"></div>
             <div class="col-lg-4">
                 
                 <div class="form-group">
                     
         <form action="verificarp.do" method="POST">
            
             Ingrese codigo: <input class="form-control" type="text" name="txtcodigo" size="10" />
         </br>
         <span>Volver <a href="admin.jsp">atras</a></span>
         </br></br>
         <input type="submit" value="Validar" name="btnbuscar" class="btn-primary" />
        </form>   
                 </div>
                 
             </div>
             <div class="col-lg-4"></div>
            
            
        </div>
 </body>
</html>
