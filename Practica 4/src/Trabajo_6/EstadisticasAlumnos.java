package Trabajo_6;

import java.util.Scanner;

public class EstadisticasAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_ALUMNOS = 5;

        // Variables acumuladoras
        int sumaEdades = 0;
        double sumaAlturas = 0;
        int mayoresDe18 = 0;
        int altosMas175 = 0;

        System.out.println("=== Estadísticas de Alumnos ===");
        System.out.println("Se ingresarán datos de " + TOTAL_ALUMNOS + " alumnos.\n");

        // Capturar datos de cada alumno
        for (int i = 1; i <= TOTAL_ALUMNOS; i++) {
            System.out.println("--- Alumno " + i + " ---");

            // Validar edad
            int edad;
            do {
                System.out.print("Edad (años): ");
                edad = scanner.nextInt();
                if (edad <= 0) {
                    System.out.println("La edad debe ser mayor que 0.");
                }
            } while (edad <= 0);

            // Validar estatura
            double estatura;
            do {
                System.out.print("Estatura (metros, ej: 1,70): ");
                estatura = scanner.nextDouble();
                if (estatura <= 0) {
                    System.out.println("La estatura debe ser mayor que 0.");
                }
            } while (estatura <= 0);

            // Acumular datos
            sumaEdades += edad;
            sumaAlturas += estatura;

            if (edad > 18) {
                mayoresDe18++;
            }
            if (estatura > 1.75) {
                altosMas175++;
            }

            System.out.println();
        }

        // Calcular promedios
        double edadMedia = (double) sumaEdades / TOTAL_ALUMNOS;
        double alturaMedia = sumaAlturas / TOTAL_ALUMNOS;

        // Mostrar resultados
        System.out.println(" RESULTADOS ");
        System.out.printf("Edad media:           %.1f años%n", edadMedia);
        System.out.printf("Altura media:         %.2f metros%n", alturaMedia);
        System.out.println("Mayores de 18 años:   " + mayoresDe18 + " alumno(s)");
        System.out.println("Miden más de 1,75m:   " + altosMas175 + " alumno(s)");
   

        scanner.close();
    }
}
