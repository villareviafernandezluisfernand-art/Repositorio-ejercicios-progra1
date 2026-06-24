package Pruba_Facturas;


import Facturas.Factura;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura("P001", "Martillo", 3, 5500.0);
        System.out.println("Número de pieza: " + f1.obtenerNumeroPieza());
        System.out.println("Descripción: "     + f1.obtenerDescripcion());
        System.out.println("Cantidad: "         + f1.obtenerCantidad());
        System.out.println("Precio unitario: "  + f1.obtenerPrecioPorArticulo());
        System.out.println("Monto total: "      + f1.obtenerMontoFactura());

        System.out.println();

        Factura f2 = new Factura("P002", "Tornillo", -5, -200.0);
        System.out.println("Cantidad (era -5, debe ser 0): " + f2.obtenerCantidad());
        System.out.println("Precio (era -200, debe ser 0.0): " + f2.obtenerPrecioPorArticulo());
        System.out.println("Monto (debe ser 0.0): " + f2.obtenerMontoFactura());
    }
}