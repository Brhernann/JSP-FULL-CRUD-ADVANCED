<%-- 
    Document   : registroCliente
    Created on : 25-may-2016, 20:16:05
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
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="container">
            
            
            <div class="row">
                
                <div class="col-lg-2"> </div>
                <div class="col-lg-8"> 
                <legend><h1>Registro de nuevo usuario</h1></legend></br>
                </div>
                <div class="col-lg-2"> </div>
                
            </div>
            
            <div class="row">
                
                <div class="col-lg-3"> </div>
                
                <div class="col-lg-6"> 

           <div class="form-group">
           
              <form action="registroc.do" method="POST">
         
              <th><b> Datos de cuenta</b></th></br></br>    
         
     Nombre de usuario: <input class="form-control" type="text" name="NombreUsuario"  size="10" required autofocus><br>
     Contraseña: <input class="form-control" type="password" name="Contrasena" size="10" required autofocus> </br>
     
      <th><b> Datos personales</b></th></br></br>
         
     Rut: <input class="form-control "type="text" name="Rut" size="10" required autofocus>
     Nombre: <input class="form-control" type="text" name="Nombre" size="10" required autofocus>
     Edad: <input class="form-control" type="text" name="Edad" size="10" required autofocus></br>
     <br />
     <span>Volver a <a href="index.jsp">Home </a></span>
     <br /><br />
     <input type="submit" value="Registrar" class="btn-primary btn-lg" />
            
        </form>
     
        </div> 
       
        </div>             
        <div class="col-lg-3"> </div>
 
            </div>      
            </div>          
      
    </body>
</html>
