<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrarVentas
    Created on : 27-may-2016, 16:18:16
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
                    
                    <h1>Lista de Ventas efectuadas</h1>  
                    
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
                  
                    <th>#ID </th>
                    <th>Fecha de compra </th>
                    <th>Cantidad de productos </th>
                    <th>Precio </th>
                    <th>Rut del cliente</th>
                    <th>Codigo del producto </th>
                </tr>
                
                
                <c:forEach var="v" items="${sessionScope.Ventas}">
                   
                 <tr>
                    <td>${v.getId()}</td>
                    <td>${v.getFecha()}</td>
                    <td>${v.getCantidad()}</td>
                    <td>${v.getPrecio()}</td>
                    <td>${v.getRutCliente()}</td>
                    <td>${v.getCodProducto()}</td>
                  
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
