

package DETOUM;


public class UsuarioClass {
    
    private int tipoUsuario;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String edad;

    public UsuarioClass() {
    }

    public UsuarioClass(String usuario) {
        this.usuario = usuario;
    }

    public UsuarioClass(int tipoUsuario, String usuario, String contrasena, String nombre, String apellido, String edad) {
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    

}
