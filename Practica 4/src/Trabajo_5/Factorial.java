package Trabajo_5;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println(" Factorial de un Numero");

        do {
            System.out.print("Ingrese un numero entero no negativo: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Error: el numero no puede ser negativo. Intente de nuevo.");
            }
        } while (n < 0);

        // Calcular el factorial con un bucle for
        long factorial = 1; // long para soportar números grandes

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("\nEl factorial de " + n + " es: " + factorial);

        // Mostrar el proceso paso a paso
        if (n > 0) {
            System.out.print("Proceso: ");
            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) System.out.print(" x ");
            }
            System.out.println(" = " + factorial);
        }

        scanner.close();
    }
}
