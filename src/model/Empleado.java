package model;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String cargo;
    private String telefono;
    private String correo;
    private boolean disponible;
    private List<Venta> ventas;

    public Empleado(int idEmpleado, String nombre, String cargo, String telefono, String correo, boolean disponible) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
        this.disponible = disponible;
        this.ventas = new ArrayList<>();
    }

    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public List<Venta> getVentas() { return ventas; }
    public void setVentas(List<Venta> ventas) { this.ventas = ventas; }

    public void addVenta(Venta venta) {
        this.ventas.add(venta);
    }

    public void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre inválido.");
        } else {
            System.out.println("Nombre válido: " + nombre);
        }
    }

    public void validarCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            System.out.println("Correo válido: " + correo);
        } else {
            System.out.println("Correo inválido.");
        }
    }

    @Override
    public String toString() {
        return "Empleado{id=" + idEmpleado + ", nombre='" + nombre + "', cargo='" + cargo + "'}";
    }
}

