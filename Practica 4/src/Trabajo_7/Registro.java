package Trabajo_7;

import java.util.Scanner;


public class Registro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVentas = 0;
        double montoTotal = 0;
        int ventasMayores50000 = 0;
        double monto;

        System.out.println("=== Registro de Ventas del Día ===");
        System.out.println("Ingrese el monto de cada venta (0 para cerrar caja):\n");

        // Pedir el primer monto
        System.out.print("Monto de venta ₡: ");
        monto = scanner.nextDouble();

        // Continuar mientras no se ingrese 0
        while (monto != 0) {

            // Validar que el monto sea positivo
            if (monto < 0) {
                System.out.println("Error: el monto debe ser positivo. Intente de nuevo.");
            } else {
                // Registrar la venta
                totalVentas++;
                montoTotal += monto;

                if (monto > 50000) {
                    ventasMayores50000++;
                }

                System.out.println("Venta #" + totalVentas + " registrada: ₡" + String.format("%.0f", monto));
            }

            System.out.print("Monto de venta ₡: ");
            monto = scanner.nextDouble();
        }

   
        System.out.println("\n CIERRE DE CAJA ");

        if (totalVentas > 0) {
            double promedio = montoTotal / totalVentas;

            System.out.println("Total de ventas realizadas: " + totalVentas);
            System.out.printf("Monto total acumulado:      ₡%.0f%n", montoTotal);
            System.out.printf("Monto promedio por venta:   ₡%.0f%n", promedio);
            System.out.println("Ventas mayores a ₡50.000:  " + ventasMayores50000);
        } else {
            System.out.println("No se registraron ventas en el día.");
        }

     

        scanner.close();
    }
}
