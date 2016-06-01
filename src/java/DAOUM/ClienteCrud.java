

package DAOUM;

import Conexion.Conexion;
import DETOUM.ClienteClass;
import Interfaces.Metopad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteCrud implements Metopad<ClienteClass>{
    
    private static final String SQL_INSERT  = "INSERT INTO cliente (rut, nombre, edad) VALUES (? , ?, ?)";
    private static final String SQL_DELETE  = "DELETE FROM cliente WHERE rut = ?";
    private static final String SQL_UPDATE  = "UPDATE cliente SET nombre = ?, edad = ? WHERE rut = ?";
    private static final String SQL_READ    = "SELECT * FROM cliente WHERE rut= ?";
    private static final String SQL_READALL = "SELECT * FROM cliente";
    private static final String SQL_VERIFICAR    = "SELECT * FROM cliente WHERE rut= ?";
    
    private static final Conexion con = Conexion.SaberEstado();

    @Override
    public boolean create(ClienteClass d) {
       
              PreparedStatement ps;
        
        try {
           
            
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, d.getRut());
            ps.setString(2, d.getNombre());
            ps.setInt(3, d.getEdad());
            
            
            if (ps.executeUpdate()>0) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCrud.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ClienteCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return false;
        
       
    }

    @Override
    public boolean update(ClienteClass d) {
        
        
          PreparedStatement ps;
        
        try {
            
            
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            
            ps.setString(1, d.getNombre());
            ps.setInt   (2, d.getEdad());
            ps.setString(3, d.getRut());
            
            if (ps.executeUpdate()>0) {
                
                return  true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return  false;
       
    }

    @Override
    public ClienteClass read(Object key) {
        
        ClienteClass cl = null;
        PreparedStatement ps;
        ResultSet res; 
        
        try {
                       
            ps = con.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
            
            while (res.next()) {
                
           cl  = new ClienteClass(res.getString(1), res.getString(2), res.getInt(3));
              
                   
            }
            
            return cl;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return cl;

    }

    @Override
    public List<ClienteClass> readall() {
      
          PreparedStatement ps;
          ResultSet res;  
          
         ArrayList<ClienteClass> cliente = new ArrayList<>();
        
         try {
          
             ps = con.getCnn().prepareStatement(SQL_READALL);
             res = ps.executeQuery();
            
            while (res.next()) {
              
                cliente.add(new ClienteClass(res.getString(1) ,res.getString(2), res.getInt(3)));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             con.cerrarConexion();
         }
        return cliente;
        
    }

    @Override
    public int verificador(ClienteClass d) {
       
        int caca = 0;
            
       PreparedStatement ps;
       ResultSet res;
       
        try {
          ps = con.getCnn().prepareStatement(SQL_VERIFICAR);
          ps.setString(1, d.getRut());
          
          res = ps.executeQuery();
          
          if (res.next()) {
            
            return 1;
        }
        else{
            return 0;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return 0;
        
    }
  

}
