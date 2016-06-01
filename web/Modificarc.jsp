<%-- 
    Document   : Modificarc
    Created on : 27-may-2016, 13:07:18
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
            
            <div class="col-lg-4" ></div>
            <div class="col-lg-4" ><h1>Modificar a cliente </h1></div>
            <div class="col-lg-4" ></div>
            
        </div>
        </header>
        </br>
        </br>
        
            <div class="row">
                
                <div class="col-lg-3"> </div>
                
                <div class="col-lg-6"> 

           <div class="form-group">
           
              <form action="modificarc.do" method="POST">
         
              <th><b> Datos de cuenta</b></th></br></br>    
         
     Nuevo nombre de usuario: <input class="form-control" type="text" name="NombreUsuario"  size="10" required autofocus><br>
     Nueva contraseña: <input class="form-control" type="password" name="Contrasena" size="10" required autofocus> </br>
     
      <th><b> Datos personales</b></th></br></br>
         
    
     Nuevo nombre: <input class="form-control" type="text" name="Nombre" size="10" required autofocus>
     Nueva edad: <input class="form-control" type="text" name="Edad" size="10" required autofocus></br>
     <br />
     <span>Volver a <a href="index.jsp">Home </a></span>
     <br /><br />
     <input type="submit" value="Registrar" class="btn-primary btn-lg" />
            
        </form>
     
        </div> 
       
        </div>             
        <div class="col-lg-3"> </div>
 
            </div>   
        
        
    </body>
</html>
