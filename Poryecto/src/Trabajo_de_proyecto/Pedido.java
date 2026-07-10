package Trabajo_de_proyecto;

import Menu.Menu;
import Usuarios.Usuario;
import java.util.ArrayList;


public class Pedido {
    private Usuario usuario;
    private ArrayList<Producto> productosPedidos;

    public Pedido(Usuario usuario) {
        this.usuario = usuario;
        this.productosPedidos = new ArrayList<>();
    }

    Pedido(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

   
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productosPedidos) {
            
        }
        return total;
    }

    
    public void mostrarPedido() {
        System.out.println("\n-PEDIDO DE " + usuario.getNombre() + "");
        if (productosPedidos.isEmpty()) {
            System.out.println("No hay productos en este pedido.");
        } else {
            for (Producto p : productosPedidos) {
                System.out.println(p);
            }
            System.out.println("TOTAL: $" + String.format("", calcularTotal()));
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

     void agregarProducto(Producto p) {
       
    }

    void agregarProducto(Menu.Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
