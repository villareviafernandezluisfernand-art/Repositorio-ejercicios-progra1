package Trabajo_1;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            
            System.out.println("=== Positivo o Negativo ===");
            System.out.println("Ingrese números enteros (0 para salir):");
            
            // El bucle continúa mientras el usuario no ingrese 0
            do {
                System.out.print("\nIngrese un número: ");
                numero = scanner.nextInt();
                
                if (numero > 0) {
                    System.out.println(numero + " es POSITIVO.");
                } else if (numero < 0) {
                    System.out.println(numero + " es NEGATIVO.");
                } else {
                    System.out.println("Ha ingresado 0. ¡Programa finalizado!");
                }
            } while (numero != 0);
        }
    }
}
