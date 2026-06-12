package laboratorioFinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private double total;
    private Cliente cliente;
    private Empleado empleado;
    private List<DetalleVenta> detalles;

    public Venta(int idVenta, Date fecha, Cliente cliente, Empleado empleado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    public int getIdVenta() { return idVenta; }
    public void setIdVenta(int idVenta) { this.idVenta = idVenta; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Empleado getEmpleado() { return empleado; }
    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }
    public List<DetalleVenta> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleVenta> detalles) { this.detalles = detalles; }

    public void addDetalle(DetalleVenta detalle) {
        this.detalles.add(detalle);
        calcularTotal();
    }

    public void calcularTotal() {
        this.total = detalles.stream().mapToDouble(DetalleVenta::calcularSubtotal).sum();
    }

    public void calcularImpuesto() {
        double iva = total * 0.13;
        System.out.println("IVA (13%): $" + String.format("%.2f", iva));
    }

    public void verificarVentaValida() {
        if (cliente != null && empleado != null && !detalles.isEmpty()) {
            System.out.println("Venta #" + idVenta + " es válida.");
        } else {
            System.out.println("Venta #" + idVenta + " NO es válida.");
        }
    }

    public void mostrarVenta() {
        System.out.println("=== Venta #" + idVenta + " ===");
        System.out.println("Cliente: " + (cliente != null ? cliente.getNombre() : "N/A"));
        System.out.println("Empleado: " + (empleado != null ? empleado.getNombre() : "N/A"));
        for (DetalleVenta d : detalles) {
            d.mostrarDetalle();
        }
        System.out.println("TOTAL: $" + String.format("%.2f", total));
    }

    @Override
    public String toString() {
        return "Venta{id=" + idVenta + ", total=" + total + "}";
    }
}

