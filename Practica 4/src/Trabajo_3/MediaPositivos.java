package Trabajo_3;

import java.util.Scanner;


public class MediaPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double suma = 0;
        int cantidad = 0;

        System.out.println(" Media de Numeros Positivos ");
        System.out.println("Ingrese numeros (un numero negativo finaliza el programa):");

        System.out.print("\nIngrese un numero: ");
        numero = scanner.nextDouble();

        // Continúa mientras el número sea >= 0
        while (numero >= 0) {
            suma += numero;
            cantidad++;

            System.out.print("Ingrese un numero: ");
            numero = scanner.nextDouble();
        }

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        if (cantidad > 0) {
            double media = suma / cantidad;
            System.out.println("Numeros positivos ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.printf("Media (promedio): %.2f%n", media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}
