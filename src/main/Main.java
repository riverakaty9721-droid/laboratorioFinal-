package main;

import model.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE VENTAS =====\n");

        Categoria cat1 = new Categoria(1, "Electrónica");
        Categoria cat2 = new Categoria(2, "Ropa");

        Producto p1 = new Producto(1, "Laptop", "Laptop 16GB RAM", 10, 899.99, cat1);
        Producto p2 = new Producto(2, "Auriculares", "Inalámbricos", 25, 59.99, cat1);
        Producto p3 = new Producto(3, "Camiseta", "Algodón talla M", 50, 12.99, cat2);

        Cliente cliente1 = new Cliente(1, "Ana García", "Calle Principal #10", "7777-1234");
        Cliente cliente2 = new Cliente(2, "Carlos López", "Av. Libertad #45", "7888-5678");

        Empleado emp1 = new Empleado(1, "Luis Martínez", "Vendedor", "7999-0000", "luis@empresa.com", true);

        Venta venta1 = new Venta(1, new Date(), cliente1, emp1);
        venta1.addDetalle(new DetalleVenta(1, 1, p1));
        venta1.addDetalle(new DetalleVenta(2, 2, p2));
        venta1.verificarVentaValida();
        venta1.mostrarVenta();
        venta1.calcularImpuesto();

        System.out.println();

        Venta venta2 = new Venta(2, new Date(), cliente2, emp1);
        venta2.addDetalle(new DetalleVenta(3, 3, p3));
        venta2.verificarVentaValida();
        venta2.mostrarVenta();
        venta2.calcularImpuesto();

        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }
}
