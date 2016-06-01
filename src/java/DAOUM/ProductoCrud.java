

package DAOUM;

import Conexion.Conexion;
import DETOUM.ClienteClass;
import DETOUM.ProductoClass;
import Interfaces.Metopad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductoCrud implements Metopad<ProductoClass>{
    
    private static final String SQL_INSERT  = "INSERT INTO producto (codigo, nombre, stock, precio) VALUES (? , ?, ?, ?)";
    private static final String SQL_DELETE  = "DELETE FROM producto WHERE codigo = ?";
    private static final String SQL_UPDATE  = "UPDATE producto SET nombre = ?, stock = ?, precio = ? WHERE codigo = ?";
    private static final String SQL_READ    = "SELECT * FROM producto WHERE codigo= ?";
    private static final String SQL_READALL = "SELECT * FROM producto";
    private static final String SQL_VERIFICAR    = "SELECT * FROM producto WHERE codigo= ?";
    
    private static final Conexion con = Conexion.SaberEstado();

    @Override
    public boolean create(ProductoClass d) {
        
                  PreparedStatement ps;
        
        try {
           
            
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, d.getCodigo());
            ps.setString(2, d.getNombre());
            ps.setInt(3, d.getStock());
            ps.setString(4, d.getPrecio());
            
            
            if (ps.executeUpdate()>0) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCrud.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ProductoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return false;

    }

    @Override
    public boolean update(ProductoClass d) {
        
                  PreparedStatement ps;
        
        try {
            
            
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            
            ps.setString(1, d.getNombre()); //codigo nombre stock precio
            ps.setInt   (2, d.getStock());
            ps.setString(3, d.getPrecio());
            ps.setString(4, d.getCodigo());
            
            
            if (ps.executeUpdate()>0) {
                
                return  true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return  false;

    }

    @Override
    public ProductoClass read(Object key) {
        
                
        ProductoClass pc = null;
        PreparedStatement ps;
        ResultSet res; 
        
        try {
                       
            ps = con.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
            
            while (res.next()) {
                
           pc  = new ProductoClass(res.getString(1), res.getString(2), res.getInt(3), res.getString(4));
              
                   
            }
            
            return pc;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return pc;

    }

    @Override
    public List<ProductoClass> readall() {
      
          PreparedStatement ps;
          ResultSet res;  
          
         ArrayList<ProductoClass> producto = new ArrayList<>();
        
         try {
          
             ps = con.getCnn().prepareStatement(SQL_READALL);
             res = ps.executeQuery();
            
            while (res.next()) {
              
               
            producto.add(new ProductoClass(res.getString(1) ,res.getString(2), res.getInt(3), res.getString(4)));  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             con.cerrarConexion();
         }
        return producto;

    }

    @Override
    public int verificador(ProductoClass d) {
       
        int caca = 0;
            
       PreparedStatement ps;
       ResultSet res;
       
        try {
          ps = con.getCnn().prepareStatement(SQL_VERIFICAR);
          ps.setString(1, d.getCodigo());
          
          res = ps.executeQuery();
          
          if (res.next()) {
            
            return 1;
        }
        else{
            return 0;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return 0; 
        
    }

}
