package Usuarios;


public class Empleado {
    protected int id;
    protected String nombre;
    protected String usuario;
    protected String contrasena;

    public Empleado(int id, String nombre, String usuario, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }


    public boolean validarLogin(String usuarioIngresado, String contrasenaIngresada) {
        return this.usuario.equals(usuarioIngresado) && this.contrasena.equals(contrasenaIngresada);
    }

    @Override
    public String toString() {
        return "Empleado #" + id + ": " + nombre + " (usuario: " + usuario + ")";
    }
}
