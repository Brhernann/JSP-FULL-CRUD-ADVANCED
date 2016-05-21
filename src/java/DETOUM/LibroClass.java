

package DETOUM;


public class LibroClass {
    
    private String isb;
    private String nombre;
    private String autor;

    public LibroClass() {
    }

    public LibroClass(String isb) {
        this.isb = isb;
    }

    public LibroClass(String isb, String nombre, String autor) {
        this.isb = isb;
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getIsb() {
        return isb;
    }

    public void setIsb(String isb) {
        this.isb = isb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    

}
