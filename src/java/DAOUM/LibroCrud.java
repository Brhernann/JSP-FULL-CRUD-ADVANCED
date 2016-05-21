

package DAOUM;

import Conexion.Conexion;
import DETOUM.LibroClass;
import Interfaces.Metopad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LibroCrud implements   Metopad<LibroClass>{
    
    private static final String SQL_INSERT  = "INSERT INTO libros (isbn, nombre, autor) VALUES (? , ?, ?)";
    private static final String SQL_DELETE  = "DELETE FROM libros WHERE isbn = ?";
    private static final String SQL_UPDATE  = "UPDATE libros SET nombre = ?, autor = ? WHERE isbn = ?";
    private static final String SQL_READ    = "SELECT * FROM libros WHERE isbn= ?";
    private static final String SQL_READALL = "SELECT * FROM libros";
    
    private static final Conexion con = Conexion.SaberEstado();

    @Override
    public boolean create(LibroClass d) {
        
        PreparedStatement ps;
        
        try {
           
            
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, d.getIsb());
            ps.setString(2, d.getNombre());
            ps.setString(3, d.getAutor());
            
            if (ps.executeUpdate()>0) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibroCrud.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibroCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return false;
    }

    @Override
    public boolean update(LibroClass d) {
        
        PreparedStatement ps;
        
        try {
            
            
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, d.getNombre());
            ps.setString(2, d.getAutor());
            ps.setString(3, d.getIsb());
            
            if (ps.executeUpdate()>0) {
                
                return  true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibroCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            con.cerrarConexion();
        }
        
        return  false;
    }

    @Override
    public LibroClass read(Object key) {
        
        LibroClass l = null;
        PreparedStatement ps;
        ResultSet res; 
        
        try {
                       
            ps = con.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
            
            while (res.next()) {
                
            l  = new LibroClass(res.getString(1), res.getString(2), res.getString(3));
              
            }
            
            return l;
        } catch (SQLException ex) {
            Logger.getLogger(LibroCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        
        return l;
        
    }

    @Override
    public List<LibroClass> readall() {
        
          PreparedStatement ps;
          ResultSet res;            
         ArrayList<LibroClass> libro = new ArrayList<>();
        
         try {
          
             ps = con.getCnn().prepareStatement(SQL_READALL);
             res = ps.executeQuery();
            
            while (res.next()) {
              
                libro.add(new LibroClass(res.getString(1) ,res.getString(2), res.getString(3)));  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LibroCrud.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             con.cerrarConexion();
         }
        return libro;
    }

}
