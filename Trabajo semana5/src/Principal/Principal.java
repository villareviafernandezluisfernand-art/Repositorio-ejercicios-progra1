package Principal;


import Sistema_Encargado.Encargado;

public class Principal {
    public static void main(String[] args) {
        Encargado e1 = new Encargado("Carlos", "Ramírez", 850000.0);
        Encargado e2 = new Encargado("María",  "Solano",  920000.0);

        System.out.println("--- Salario anual actual ---");
        System.out.println(e1.obtenerPrimerNombre() + " " + e1.obtenerApellidoPaterno() + ": ₡" + e1.obtenerSalarioAnual());
        System.out.println(e2.obtenerPrimerNombre() + " " + e2.obtenerApellidoPaterno() + ": ₡" + e2.obtenerSalarioAnual());

        e1.establecerSalarioMensual(e1.obtenerSalarioMensual() * 1.10);
        e2.establecerSalarioMensual(e2.obtenerSalarioMensual() * 1.10);

        System.out.println();
        System.out.println("--- Salario anual con aumento del 10% ---");
        System.out.println(e1.obtenerPrimerNombre() + " " + e1.obtenerApellidoPaterno() + ": ₡" + e1.obtenerSalarioAnual());
        System.out.println(e2.obtenerPrimerNombre() + " " + e2.obtenerApellidoPaterno() + ": ₡" + e2.obtenerSalarioAnual());
    }
}
