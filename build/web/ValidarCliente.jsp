<%-- 
    Document   : ValidarCliente
    Created on : 27-may-2016, 12:46:46
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
        <title>Rut</title>
    </head>
    
    <body>
        
              <header>
            
            <div class="row">
                
                <div class="col-lg-4"></div>
                <div class="col-lg-4">
                    
                    <h1><b>Ingrese Rut de cliente a modificar</b></h1>   
                    
                </div>
                <div class="col-lg-4"></div>
           </div>
        </header> 
        </br></br>     
        
        <div class="row">
            
             <div class="col-lg-4"></div>
             <div class="col-lg-4">
                 
                 <div class="form-group">
                     
         <form action="verificarc.do" method="POST">
            
             Ingrese Rut: <input class="form-control" type="text" name="txtrut" size="10" />
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
