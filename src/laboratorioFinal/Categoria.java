package laboratorioFinal;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int idCategoria;
    private String nombre;
    private List<Producto> productos;

    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public String toString() {
        return "Categoria{id=" + idCategoria + ", nombre='" + nombre + "'}";
    }
}

