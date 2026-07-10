package Trabajo_de_proyecto;

// Esta clase representa un producto del menu (ej: una pizza, un postre, un batido, etc.)
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private Categoria categoria;

    // Constructor: se usa para crear un producto nuevo con sus datos
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

    // Getters: sirven para "leer" los datos privados del producto
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

    // Nos dice si el producto es postre o batido (util para reportes, promociones, etc.)
    public boolean esPostreOBatido() {
        return categoria == Categoria.POSTRE || categoria == Categoria.BATIDO;
    }

    // toString(): define como se va a imprimir el producto cuando hacemos System.out.println(producto)
    @Override
    public String toString() {
        return id + ". " + nombre + " - $" + String.format("%.2f", precio) + " [" + categoria + "]";
    }
}
