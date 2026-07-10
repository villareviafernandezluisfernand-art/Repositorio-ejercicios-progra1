package Menu;

import Categoria.Categoria;
import java.util.ArrayList;


public class Menu {

    public static void mostrarMenuPorCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void mostrarMenuPorCategoria(Categorias.Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private ArrayList<Producto> productos;

    public Menu() {
        productos = new ArrayList<>();
    }

    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

  
    public void mostrarMenu() {
        System.out.println("\n----- MENU -----");
        if (productos.isEmpty()) {
            System.out.println("El menu esta vacio.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    
    public Producto buscarProductoPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Productos.Producto nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static class Producto {

        public Producto() {
        }

        private int getId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
