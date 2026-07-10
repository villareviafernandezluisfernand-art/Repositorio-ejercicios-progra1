package Usuarios;


public class Usuario {
    private int id;
    private String nombre;
    //crear un login para los enpliados y los administradores
    //crear un calse mesa con el numero de mesa con el estado que si esata reservada
    //provedores 
    
    

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario " + id + "" + nombre;
    }
}
