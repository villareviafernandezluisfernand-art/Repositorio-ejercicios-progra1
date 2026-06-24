package Sistema_Encargado;

public class Encargado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Encargado(String nombre, String apellido, double salario) {
        primerNombre    = nombre;
        apellidoPaterno = apellido;
        establecerSalarioMensual(salario);
    }

    public String obtenerPrimerNombre()    { return primerNombre; }
    public String obtenerApellidoPaterno() { return apellidoPaterno; }
    public double obtenerSalarioMensual()  { return salarioMensual; }

    public void establecerPrimerNombre(String n)    { primerNombre = n; }
    public void establecerApellidoPaterno(String a) { apellidoPaterno = a; }

    public void establecerSalarioMensual(double s) {
        if (s > 0) salarioMensual = s;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }
}