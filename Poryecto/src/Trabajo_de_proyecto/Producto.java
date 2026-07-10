package Trabajo_de_proyecto;


public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private Categoria categoria;

   
    public Producto(int id, String nombre, double precio, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    Producto(int i, String pizza_Margherita, double d, Categorias.Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Producto(int i, String ensalada_Cesar, int i0, int i1, Categorias.Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean esPostreOBatido() {
        return categoria == Categoria.POSTRE || categoria == Categoria.BATIDO;
    }

    
    @Override
    public String toString() {
        return id + ". " + nombre + " - $" + String.format("%.2f", precio) + " [" + categoria + "]";
    }
}
