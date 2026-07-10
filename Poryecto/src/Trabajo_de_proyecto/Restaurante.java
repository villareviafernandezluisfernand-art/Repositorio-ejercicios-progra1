package Trabajo_de_proyecto;

import Categorias.Categoria;
import mesas_2.Mesa;
import Admin.Administrador;
import Menu.Menu;
import Usuarios.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {

  
    static Menu menu = new Menu();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<Mesa> mesas = new ArrayList<>();
    static ArrayList<Proveedor> proveedores = new ArrayList<>();
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Administrador> administradores = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        datosIniciales(); 

        int opcionLogin;
        do {
            System.out.println("\n===== BIENVENIDO AL RESTAURANTE =====");
            System.out.println("1. Ingresar como Cliente");
            System.out.println("2. Ingresar como Empleado/Administrador");
            System.out.println("0. Salir del sistema");
            System.out.print("Elige una opcion: ");
            opcionLogin = sc.nextInt();
            sc.nextLine();

            if (opcionLogin == 1) {
                menuCliente();
            } else if (opcionLogin == 2) {
                loginEmpleado();
            } else if (opcionLogin != 0) {
                System.out.println("Opcion no valida.");
            }

        } while (opcionLogin != 0);

        System.out.println("Hasta luego!!!");
        sc.close();
    }

    
    static void datosIniciales() {
        // Productos de ejemplo con sus categorias
        menu.agregarProducto(new Producto(1, "Pizza Margherita", 16.500, Categoria.PLATO_FUERTE));
        menu.agregarProducto(new Producto(2, "Ensalada Cesar", 9,800, Categoria.ENTRADA));
        menu.agregarProducto(new Producto(3, "Tiramisu", 6.700, Categoria.POSTRE));
        menu.agregarProducto(new Producto(4, "Batido de Fresa", 5.800, Categoria.BATIDO));
        menu.agregarProducto(new Producto(5, "Limonada", 2.300, Categoria.BEBIDA));

  
        for (int i = 1; i <= 5; i++) {
            mesas.add(new Mesa(i));
        }

        // Proveedores de ejemplo
        proveedores.add(new Proveedor(1, "Lacteos San Carlos", "Queso y leche", "8888-1111"));
        proveedores.add(new Proveedor(2, "Verduras Frescas S.A.", "Vegetales", "8888-2222"));

       
        empleados.add(new Empleado(1, "Carlos Mesero", "carlos", "1234"));
        administradores.add(new Administrador(1, "Ana Gerente", "admin", "admin123"));
    }

 
    static void loginEmpleado() {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contrasena: ");
        String contrasena = sc.nextLine();

        // Primero revisamos si es administrador
        for (Administrador a : administradores) {
            if (a.validarLogin(usuario, contrasena)) {
                System.out.println("Bienvenido, " + a.getNombre() + " (Administrador)");
                menuAdministrador();
                return;
            }
        }

        // Luego revisamos si es un empleado normal
        for (Empleado e : empleados) {
            if (e.validarLogin(usuario, contrasena)) {
                System.out.println("Bienvenido, " + e.getNombre() + " (Empleado)");
                menuEmpleado();
                return;
            }
        }

        System.out.println("Usuario o contrasena incorrectos.");
    }

 
    static void menuCliente() {
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        Cliente cliente = new Cliente(clientes.size() + 1, nombre);
        clientes.add(cliente);
        System.out.println("Bienvenido, " + cliente.getNombre());

        int opcion;
        do {
            System.out.println("\n----- MENU CLIENTE -----");
            System.out.println("1. Ver menu completo");
            System.out.println("2. Ver solo postres");
            System.out.println("3. Ver solo batidos");
            System.out.println("4. Hacer pedido");
            System.out.println("0. Volver al inicio");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    menu.mostrarMenu();
                    break;
                case 2:
                    Menu.mostrarMenuPorCategoria(Categoria.POSTRE);
                    break;
                case 3:
                    Menu.mostrarMenuPorCategoria(Categoria.BATIDO);
                    break;
                case 4:
                    hacerPedido(cliente);
                    break;
                case 0:
                    System.out.println("Volviendo al inicio...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

 
    static void hacerPedido(Cliente cliente) {
        Pedido nuevoPedido = new Pedido(cliente);
        int idProducto;
        do {
            menu.mostrarMenu();
            System.out.print("Ingresa el ID del producto a agregar (0 para terminar): ");
            idProducto = sc.nextInt();
            if (idProducto != 0) {
                Menu.Producto p = menu.buscarProductoPorId(idProducto);
                if (p != null) {
                    nuevoPedido.agregarProducto(p);
                    System.out.println(p.getNombre() + " agregado al pedido.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }
        } while (idProducto != 0);

        pedidos.add(nuevoPedido);
        nuevoPedido.mostrarPedido();
    }

    static void menuEmpleado() {
        int opcion;
        do {
            System.out.println("\n----- MENU EMPLEADO -----");
            System.out.println("1. Ver mesas");
            System.out.println("2. Reservar mesa");
            System.out.println("3. Liberar mesa");
            System.out.println("4. Ver pedidos registrados");
            System.out.println("0. Cerrar sesion");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    verMesas();
                    break;
                case 2:
                    reservarMesa();
                    break;
                case 3:
                    liberarMesa();
                    break;
                case 4:
                    verPedidos();
                    break;
                case 0:
                    System.out.println("Sesion cerrada.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

  
    static void menuAdministrador() {
        int opcion;
        do {
            System.out.println("\n----- MENU ADMINISTRADOR -----");
            System.out.println("1. Ver mesas");
            System.out.println("2. Reservar mesa");
            System.out.println("3. Liberar mesa");
            System.out.println("4. Ver pedidos registrados");
            System.out.println("5. Ver proveedores");
            System.out.println("6. Agregar proveedor");
            System.out.println("7. Agregar producto al menu");
            System.out.println("0. Cerrar sesion");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    verMesas();
                    break;
                case 2:
                    reservarMesa();
                    break;
                case 3:
                    liberarMesa();
                    break;
                case 4:
                    verPedidos();
                    break;
                case 5:
                    verProveedores();
                    break;
                case 6:
                    agregarProveedor();
                    break;
                case 7:
                    agregarProductoAlMenu();
                    break;
                case 0:
                    System.out.println("Sesion cerrada.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    
    static void verMesas() {
        System.out.println("\n----- MESAS -----");
        for (Mesa m : mesas) {
            System.out.println(m);
        }
    }

    static void reservarMesa() {
        verMesas();
        System.out.print("Ingresa el numero de mesa a reservar: ");
        int numero = sc.nextInt();
        for (Mesa m : mesas) {
            if (m.getNumero() == numero) {
                if (m.isReservada()) {
                    System.out.println("Esa mesa ya esta reservada.");
                } else {
                    m.reservar();
                    System.out.println("Mesa " + numero + " reservada con exito.");
                }
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

    static void liberarMesa() {
        verMesas();
        System.out.print("Ingresa el numero de mesa a liberar: ");
        int numero = sc.nextInt();
        for (Mesa m : mesas) {
            if (m.getNumero() == numero) {
                m.liberar();
                System.out.println("Mesa " + numero + " ahora esta disponible.");
                return;
            }
        }
        System.out.println("Mesa no encontrada.");
    }

   
    static void verPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados todavia.");
        } else {
            for (Pedido p : pedidos) {
                p.mostrarPedido();
            }
        }
    }

    
    static void verProveedores() {
        System.out.println("\n----- PROVEEDORES -----");
        if (proveedores.isEmpty()) {
            System.out.println("No hay proveedores registrados.");
        } else {
            for (Proveedor p : proveedores) {
                System.out.println(p);
            }
        }
    }

    static void agregarProveedor() {
        System.out.print("Nombre del proveedor: ");
        String nombre = sc.nextLine();
        System.out.print("Producto que suministra: ");
        String producto = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        Proveedor nuevo = new Proveedor(proveedores.size() + 1, nombre, producto, telefono);
        proveedores.add(nuevo);
        System.out.println("Proveedor agregado: " + nuevo);
    }

  
    static void agregarProductoAlMenu() {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Categorias disponibles: ENTRADA, PLATO_FUERTE, POSTRE, BATIDO, BEBIDA");
        System.out.print("Categoria: ");
        String catTexto = sc.nextLine().toUpperCase();

        try {
            Categoria categoria = Categoria.valueOf(catTexto);
            Producto nuevo = new Producto(menu.getProductos().size() + 1, nombre, precio, categoria);
            menu.agregarProducto(nuevo);
            System.out.println("Producto agregado: " + nuevo);
        } catch (IllegalArgumentException e) {
            System.out.println("Categoria no valida. No se agrego el producto.");
        }
    }
}
