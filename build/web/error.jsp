<%-- 
    Document   : error
    Created on : 25-may-2016, 21:19:31
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
        <title>Error</title>
    </head>
    <body>
        
        <header>
            
            <div class="row">
               
                <div class="col-lg-4"></div>
                <div class="col-lg-4">
                 
                    <h1><b>Ha ocurrido un error</b></h1>
          
                </div>
                <div class="col-lg-4"></div>
                
                
            </div>
            
        </header> 
        </br>
        
        <div class="row">
            
            <div class="container">
                
      <%
        
         String error = (String)request.getSession().getAttribute("Myerror");
       
        out.println("<h2><b>"+error+"</b></h2>");
        
        %>   
                
                
            </div>
            
            
        </div>
       
    </body>
</html>
