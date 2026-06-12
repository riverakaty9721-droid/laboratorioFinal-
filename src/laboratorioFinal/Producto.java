package laboratorioFinal;

public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private double precio;
    private Categoria categoria;

    public Producto(int idProducto2, String nombre2, String descripcion2, int cantidad2, double precio2,
			Categoria cat2) {
		// TODO Auto-generated constructor stub
	}

	public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public void validarPrecio(double precio) {
        if (precio > 0) {
            System.out.println("Precio válido: " + precio);
        } else {
            System.out.println("Precio inválido.");
        }
    }

    public void obtenerPrecio(int cantidad) {
        System.out.println("Precio total: " + (precio * cantidad));
    }

    @Override
    public String toString() {
        return "Producto{id=" + idProducto + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}

