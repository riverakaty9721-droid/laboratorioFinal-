package laboratorioFinal;

public class DetalleVenta {
    private int idDetalle;
    private int cantidad;
    private Producto producto;

    public DetalleVenta(int idDetalle, int cantidad, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public double calcularSubtotal() {
        if (producto != null) {
            return producto.getPrecio() * cantidad;
        }
        return 0.0;
    }

    public void mostrarDetalle() {
        System.out.println("Producto: " + (producto != null ? producto.getNombre() : "N/A")
                + " | Cantidad: " + cantidad
                + " | Subtotal: $" + String.format("%.2f", calcularSubtotal()));
    }

    @Override
    public String toString() {
        return "DetalleVenta{id=" + idDetalle + ", cantidad=" + cantidad + ", subtotal=" + calcularSubtotal() + "}";
    }
}
