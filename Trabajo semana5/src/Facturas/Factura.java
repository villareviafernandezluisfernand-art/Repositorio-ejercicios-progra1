package Facturas;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String num, String desc, int cant, double precio) {
        numeroPieza = num;
        descripcion = desc;
        establecerCantidad(cant);
        establecerPrecioPorArticulo(precio);
    }

    public String obtenerNumeroPieza() { return numeroPieza; }
    public String obtenerDescripcion() { return descripcion; }
    public int obtenerCantidad() { return cantidad; }
    public double obtenerPrecioPorArticulo() { return precioPorArticulo; }

    public void establecerNumeroPieza(String num) { numeroPieza = num; }
    public void establecerDescripcion(String desc) { descripcion = desc; }

    public void establecerCantidad(int cant) {
        cantidad = (cant > 0) ? cant : 0;
    }

    public void establecerPrecioPorArticulo(double precio) {
        precioPorArticulo = (precio > 0) ? precio : 0.0;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}