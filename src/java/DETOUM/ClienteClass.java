

package DETOUM;


public class ClienteClass {
    
    private String rut;
    private String nombre;
    private int edad;

    public ClienteClass() {
    }

    public ClienteClass(String rut) {
        this.rut = rut;
    }

    public ClienteClass(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public ClienteClass(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public ClienteClass(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }
    
    
    

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    

}
