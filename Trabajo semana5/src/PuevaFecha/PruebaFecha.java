package PuevaFecha;


import Fecha.Fecha;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(6, 22, 2025);
        Fecha f2 = new Fecha(6, 24, 2026);

        System.out.print("Fecha 1: ");
        f1.mostrarFecha();

        System.out.print("Fecha 2: ");
        f2.mostrarFecha();

        f1.establecerAnio(2026);
        System.out.print("Fecha 1 modificada: ");
        f1.mostrarFecha();
    }
}