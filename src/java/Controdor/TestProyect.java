

package Controdor;

import DAOUM.LibroCrud;
import DETOUM.LibroClass;
import java.util.ArrayList;


public class TestProyect {
    
    
    public static void main(String[] args) {
        
        LibroCrud l = new LibroCrud();
       
     // l.create(new LibroClass("222", "papelucho", "Marcela paz"));
     // l.update(new LibroClass("111", "papeluchoMarciano", "Marcela paz"));
        
     //___________________________________________________________________________
    
     // LibroClass libroABuscar = l.read("111")
     // System.out.println(libroABuscar.getNombre());
        
     //___________________________________________________________________________
    
        ArrayList<LibroClass> lista = (ArrayList<LibroClass>) l.readall();
      
        for (int i = 0; i < lista.size(); i++) {
            
            System.out.println("Nombre de libro: "+lista.get(i).getNombre() +" Autor: "+ lista.get(i).getAutor() +" isbn: "+ lista.get(i).getIsb());
        }
       
        
    }

}
