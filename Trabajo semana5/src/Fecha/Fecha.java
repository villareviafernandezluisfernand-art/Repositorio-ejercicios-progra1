package Fecha;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes  = mes;
        this.dia  = dia;
        this.anio = anio;
    }

    public int obtenerMes()  { return mes; }
    public int obtenerDia()  { return dia; }
    public int obtenerAnio() { return anio; }

    public void establecerMes(int m)  { mes  = m; }
    public void establecerDia(int d)  { dia  = d; }
    public void establecerAnio(int a) { anio = a; }

    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }
}