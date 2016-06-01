<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : MostrarCliente
    Created on : 27-may-2016, 12:49:03
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
           <div class="col-lg-10"></div>
           <div class="col-lg-2">
               
            <a href="admin.jsp">Admin</a>  <a href="LoginClient.jsp">LoginClient</a>   
               
           </div>
           </div>
           <div class="row">
               
               <div class="col-lg-4"></div>
               <div class="col-lg-4">
                 
                   <h1><b>SOMOS  SUSHIPIANTE</b></br>
                   <span class="small"><b>Clientes rgistrados</b></span></h1>
               </div>
               <div class="col-lg-4"></div>
               
           </div>
       <div>
            </br>
            
         
                <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            
                            <b><a href="index.jsp" class="navbar-brand">ADMINROOT</a></b>
                        </div>
                        <div class="collapse navbar-collapse">
                       
                             <ul class="nav navbar-nav">
                                 
                          <li class="dropdown"> 
                            <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button">
                                Productos <span class="caret"></span></a>
                                
                         <ul class="dropdown-menu">
                                   
                              <li><a href="RegistrarProducto.jsp">Registrar Producto</a></li>  
                              <li><a href="validarProducto.jsp">Modificar Producto</a></li>
                              <li><a href="mostrarp.do">Ver productos</a> </li>
                              <li> <a href="eliminarProductos.jsp">Eliminar Productos</a></li>
                         </ul>
                             
                          </li>
                          
                          <li class="dropdown">
                              
                           <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button">
                               Clientes <span class="caret"> </span></a>
                               
                               <ul class="dropdown-menu">
                                   
                              <li><a href="registroCliente.jsp">Registrar cliente</a></li>  
                              <li><a href="ValidarCliente.jsp">Modificar cliente</a></li>
                              <li><a href="mostrarc.do">Ver clientes</a> </li>
                              <li> <a href="EliminarCliente.jsp">Eliminar clientes</a></li>   
                                   
                               </ul>    
                              
                          </li>
                          
                          <li class="dropdown">
                              
                              <a href="" class="dropdown-toggle"data-toggle="dropdown" role="button"> 
                                  Ventas <span class="caret"> </span></a>
                                
                                <ul class="dropdown-menu">
                                    
                              <li><a href="mostrarv.do">Ver ventas concretadas</a> </li>          
                              <li> <a href="EliminarVentas.jsp">Eliminar ventas</a></li>   
                                 </ul> 
                          
                          </li>
                          </ul>
                       </div>
                        
                    </div>
                </nav>
            </div>
                
            </header>
            
          

        <script src="js/jquery.js">  </script>
        <script src="js/bootstrap.min.js">  </script> 
        </br>
        </br>
         
        <div class="row">
            
            <div class="col-lg-3"></div>
            <div class="col-lg-6 table-responsive">
          <table class="table table-bordered table-hover">
           
              <tr class="success">
                    <th>Rut del cliente </th>
                    <th>Nombre Cliente </th>
                    <th>Edad del cliente </th>
                </tr>
                
                <c:forEach var="c" items="${sessionScope.Usuarios}">
                    
                <tr>
                    <td>${c.getRut()}</td>
                    <td>${c.getNombre()}</td>
                    <td>${c.getEdad()}</td>
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
