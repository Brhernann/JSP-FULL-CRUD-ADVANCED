<%-- 
    Document   : LoginClient
    Created on : 27-may-2016, 16:22:50
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
            <div class="col-lg-4" ><h1>Inicio de session</h1></div>
            <div class="col-lg-4" ></div>
            
        </div>
        </header>
        </br>
        </br>
        
        <div class="row">
            
           <div class="col-lg-4" ></div>
           <div class="col-lg-4" >
               
               <div class="form-group">
                   
                   <form  action="login.do" method="POST">
                   <label for="txtuser" class="sr-only">Usuario</label>    
                   <input id="txtuser"  class="form-control" type="text" name="txtuser"  placeholder="Usuario" size="10"  />
                   <input class="form-control" type="password" name="txtpass"  placeholder="Contraseña" size="10"  />
                   <br />
                     <span>Don't have an Account? <a href="registroCliente.jsp">Create an Account</a></span><br />
                     <span>Login as <a href="admin.jsp">Admin</a></span> 
                     <br /><br />
                    
                   <input type="submit" value="Entrar" class="btn-primary" />
                   </form>   
                   
                   
                   
                   
               </div>
               
               
           </div>
            <div class="col-lg-4" ></div>
            
            
        </div>
        
        
    </body>
</html>
