package Admin;

// El Administrador es un tipo especial de Empleado con permisos extra

import Usuarios.Empleado;

// (por ejemplo: gestionar proveedores y administrar el menu)
public class Administrador extends Empleado {

    public Administrador(int id, String nombre, String usuario, String contrasena) {
        // super() llama al constructor de Empleado, ya que Administrador hereda de el
        super(id, nombre, usuario, contrasena);
    }

    @Override
    public String toString() {
        return "Administrador #" + id + ": " + nombre + " (usuario: " + usuario + ")";
    }
}
