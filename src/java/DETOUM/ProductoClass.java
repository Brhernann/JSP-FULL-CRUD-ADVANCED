

package DETOUM;


public class ProductoClass {
    
    private String codigo;
    private String nombre;
    private int stock;
    private String precio;


 public ProductoClass() {
    }

    public ProductoClass(String codigo) {
        this.codigo = codigo;
    }

    public ProductoClass(int stock) {
        this.stock = stock;
    }
    
    

    public ProductoClass(String codigo, String nombre, int stock, String precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public ProductoClass(String nombre, int stock, String precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    

}
