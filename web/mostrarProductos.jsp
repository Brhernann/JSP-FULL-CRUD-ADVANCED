<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrarProductos
    Created on : 25-may-2016, 23:10:23
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
                    
                    <h1>Lista de productos online</h1>  
                    
                </div> 
                <div class="col-lg-4"></div> 
                
                
            </div>
        </header>
        </br>
        </br>
         
        <div class="row">
            
            <div class="col-lg-3"></div>
            <div class="col-lg-6 table-responsive">
          <table class="table table-bordered table-hover">
            <tr class="success">
                    <th>Codigo </th>
                    <th>Nombre Producto: </th>
                    <th>Stock: </th>
                    <th>Precio: </th>
                </tr>
       <c:forEach var="l" items="${sessionScope.Usuarios}">
           <tr>
               <td>${l.getCodigo()}</td>
                    <td>${l.getNombre()}</td>
                    <td>${l.getStock()}</td>
                    <td> ${l.getPrecio()} </td>
                </tr>
     </c:forEach>        
        </table> 
          </br>       
          <span>Volver <a href="admin.jsp">atras </a></span>        
            </div>
            <div class="col-lg-3"></div>
            
            
        </div>
       
      
         
    </body>
</html>
