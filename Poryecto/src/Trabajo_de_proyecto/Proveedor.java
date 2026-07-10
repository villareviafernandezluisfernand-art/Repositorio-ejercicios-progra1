package Trabajo_de_proyecto;

// Esta clase representa a un proveedor que le suministra productos/ingredientes al restaurante
public class Proveedor {
    private int id;
    private String nombre;
    private String productoQueSuministra;
    private String telefono;

    public Proveedor(int id, String nombre, String productoQueSuministra, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.productoQueSuministra = productoQueSuministra;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProductoQueSuministra() {
        return productoQueSuministra;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Proveedor #" + id + ": " + nombre + " | Suministra: " + productoQueSuministra + " | Tel: " + telefono;
    }
}
