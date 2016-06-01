<%@page import="DAOUM.ProductoCrud"%>
<%@page import="DETOUM.ProductoClass"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Comprar
    Created on : 27-may-2016, 17:39:29
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAOUM.ClienteCrud"%>
<%@page import="DETOUM.ClienteClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/bootstrap-responsive.css" />
	<link rel="stylesheet" href="css/signin.css" />
        <link rel="stylesheet" href="css/estilos.css" />
        
        <link rel="stylesheet" href="css/datepicker.css" />
        <link rel="stylesheet" href="less/datepicker.less" />
        <link rel="stylesheet" href="css/bootstrap.css" />

         <script src="js/jquery.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script>
            
           $(function(){
               
                $('.datepicker').datepicker();
           }) 
            
        </script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
    </head>
    <body>
 
        <header>
        <div class="row">
            
            <div class="col-lg-4" ></div>
            <div class="col-lg-4" ><h1>Adquiriendo productos</h1></div>
            <div class="col-lg-4" ></div>
            
        </div>
        </header>
        </br>
        </br>
        
        <div class="row">

        <div class="col-lg-4"></div>
        <div class="col-lg-4">
        
        <div class="form-group">
            
        <form  action="comprar.do" method="POST">
        
          Selecione Producto<select class="form-control" name="txtcombo">

                   
                <%
         ProductoCrud cnn = new ProductoCrud();
        
        ProductoClass p = new ProductoClass();
        
        ArrayList<ProductoClass> pro = (ArrayList<ProductoClass>) cnn.readall();
        
        for (int i = 0; i < pro.size(); i++) {
            
            String Codigo = pro.get(i).getCodigo();
            String nombre = pro.get(i).getNombre();
            
          out.print("<option>"+Codigo+"</option>");
         
           
         
        }
        

        
                
                %>
            
              
            </select>
                
                Ingrese Rut<input class="form-control" type="text" name="txtrut" value="" />
                Fecha <input class="form-control datepicker" type="text" name="date">
                Cantidad <input class="form-control" type="text" name="txtcantidad" value="" />
                
     <%

        
        ArrayList<ProductoClass> prod = (ArrayList<ProductoClass>) cnn.readall();
        
        for (int i = 0; i < prod.size(); i++) {
            
            String precio = prod.get(i).getPrecio();
          
%>
                <h4>precio <span class="label label-primary"><%out.println(precio);%></span></h4>
         
        <%}%>    
        </br>
        <span>Volver <a href="admin.jsp">atras </a></span>
        </br></br>
        <input type="submit" value="Registrar" class="btn-primary"  />
        </form>   
            
            
        </div>  
        
        
        </div>
            
        <div class="col-lg-4"></div>
            
            
            
        </div>
                
        
    </body>
</html>
