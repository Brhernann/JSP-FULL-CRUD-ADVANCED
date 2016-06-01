

package DETOUM;


public class CompraClass {
    
    private int id;
    private String fecha;
    private int cantidad;
    private int precio;
    private String rutCliente;
    private String codProducto;

    public CompraClass() {
    }

    public CompraClass(int id) {
        this.id = id;
    }

    public CompraClass(int id, String fecha, int cantidad, int precio, String rutCliente, String codProducto) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precio = precio;
        this.rutCliente = rutCliente;
        this.codProducto = codProducto;
    }

    public CompraClass(String fecha, int cantidad, String rutCliente, String codProducto) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.rutCliente = rutCliente;
        this.codProducto = codProducto;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }
    
    
    

}
