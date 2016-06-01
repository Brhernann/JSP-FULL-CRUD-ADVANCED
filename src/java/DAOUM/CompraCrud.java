

package DAOUM;

import Conexion.Conexion;
import DETOUM.ClienteClass;
import DETOUM.CompraClass;
import Interfaces.Metopad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CompraCrud implements Metopad<CompraClass>{
    
    private static final String SQL_INSERT  = "INSERT INTO compra (id, fecha, cantidad, precio, rut_cliente, cod_producto) VALUES (?, ? ,? ,? , ?, ?)";
    private static final String SQL_DELETE  = "DELETE FROM compra WHERE id = ?";
    private static final String SQL_UPDATE  = "UPDATE compra SET fecha = ?, cantidad = ?, precio = ?, rut_cliente = ?, cod_producto = ? WHERE id = ?";
    private static final String SQL_READ    = "SELECT * FROM compra WHERE id= ?";
    private static final String SQL_READALL = "SELECT * FROM compra";
    private static final String SQL_VERIFICAR    = "SELECT * FROM compra WHERE id= ?";
    
    private static final Conexion con = Conexion.SaberEstado();
    

    @Override
    public boolean create(CompraClass d) {
        
               
              PreparedStatement ps;
        
        try {
           
            
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1, d.getId());
            ps.setString(2, d.getFecha());
            ps.setInt(3, d.getCantidad());
            ps.setInt(4, d.getPrecio());
            ps.setString(5, d.getRutCliente());
            ps.setString(6, d.getCodProducto());
             
            
            
            
            if (ps.executeUpdate()>0) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompraCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           con.cerrarConexion();
        }
        
        return  false;  
      
    }

    @Override
    public boolean delete(Object key) {
        
        
        PreparedStatement ps;
         
        try {
           
            
            ps = con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1, key.toString());
            
            if (ps.executeUpdate()>0) {
                
                return true;
            }
            
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CompraCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return false;
        
    }

    @Override
    public boolean update(CompraClass d) {
        
                
          PreparedStatement ps;
        
        try {
            
            
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            
            
            ps.setString(1, d.getFecha());
            ps.setInt(2, d.getCantidad());
            ps.setInt(3, d.getPrecio());
            ps.setString(4, d.getRutCliente());
            ps.setString(5, d.getCodProducto());
            ps.setInt(6, d.getId());
            
            
            
            if (ps.executeUpdate()>0) {
                
                return  true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompraCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return  false;
        
    }

    @Override
    public CompraClass read(Object key) {
        
        CompraClass cc = null;
        PreparedStatement ps;
        ResultSet res; 
        
        try {
                       
            ps = con.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
            
            while (res.next()) {
                
           cc  = new CompraClass(res.getInt(1), res.getString(2), res.getInt(3), res.getInt(4), res.getString(5), res.getString(6));
              
                   
            }
            
            return cc;
            
        } catch (SQLException ex) {
            Logger.getLogger(CompraCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return cc;

    }

    @Override
    public List<CompraClass> readall() {
        
          PreparedStatement ps;
          ResultSet res;  
          
         ArrayList<CompraClass> compra = new ArrayList<>();
        
         try {
          
             ps = con.getCnn().prepareStatement(SQL_READALL);
             res = ps.executeQuery();
            
            while (res.next()) {
              
                compra.add(new CompraClass(res.getInt(1), res.getString(2), res.getInt(3), res.getInt(4), res.getString(5), res.getString(6)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CompraCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             con.cerrarConexion();
         }
        return compra;

    }

    @Override
    public int verificador(CompraClass d) {
      
        int caca = 0;
            
       PreparedStatement ps;
       ResultSet res;
       
        try {
          ps = con.getCnn().prepareStatement(SQL_VERIFICAR);
          ps.setInt(1, d.getId());
          
          res = ps.executeQuery();
          
          if (res.next()) {
            
            return 1;
        }
        else{
            return 0;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(CompraCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return 0;
        
    }
    
    

}
